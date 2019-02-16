package GNode_DFS;

import java.util.ArrayList;
import java.util.Stack;
import CISCOGNode_DFS.GNode;

// Define a class which is implemented from GNode interface
public class GraphDFSRecursive implements GNode {
	
	private String name;
	private GNode[] children;
	// when a GNode has no children, return the a array of size 0 instead of null value
	private GNode[] nochildren = new GNode[0];
	
	// To represent all possible paths, ArrayList elements are defined.
	private ArrayList<GNode> listnodes = new ArrayList<>();
	private ArrayList<GNode> templistnodes = new ArrayList<>();
	private ArrayList<GNode> finallistnodes = new ArrayList<>();
	// DFS(Depth First Search) uses a stack ( BFS: Breadth First Search uses a queue )
	private Stack<GNode> stack = new Stack<GNode>();
	
	// Create a constructor
	public GraphDFSRecursive(String name) {		
		this.name = name;	
	}

	// Set the node name
	public void setName(String name) {
		this.name = name;
	}
	
	// Get the node name
	public String getName() {
		return this.name;
	}
	
	//set children nodes
	public void setChildren(GNode[] children) {
		this.children = new GNode[children.length];
		int index = 0;
		for(GNode child : children) {
			this.children[index] = child;
			index++;
		}			
	}
	
	// get children nodes and check if there is no children
	public GNode[] getChildren() {
		if(this.children == null) {
			return nochildren;
		} else {
			return this.children;
		}
	}

	// It returns a ArrayList containing every GNode in the graph.
	public ArrayList walkGraph(GNode node){
		//String currentnode = node.getName();
		listnodes.add(node);		
		for(GNode child: node.getChildren()) {
			// recursive the function to find all children
			walkGraph(child);
		}
		return listnodes;
	}
	
	// Check which nodes are visited.
	void visit(GNode node) {
		System.out.print(node.getName() + " ");		
	}
	
	// Depth First Search(DFS) Recursive is used with a stack.	
	public ArrayList paths(GNode node) {
		// Put the node into a stack
		stack.push(node);
		templistnodes.add(node);
		
		while(!stack.isEmpty()){			
			GNode currentNode = stack.peek();	// get the first node from the stack		
			GNode[] children = currentNode.getChildren(); // get the children nodes
			if(children.length == 0) {
				// when there is no children, add all children nodes into the final node list
				finallistnodes.addAll(new ArrayList<GNode>(templistnodes));				
			}		
			
			for(GNode n : children) {
				// Call a recursive function
				paths(n);
				stack.pop();
				// remove the last node name before next recursive
				templistnodes.remove(templistnodes.size() - 1);
				//visit(n);
			}			
			break;						
		}
		return finallistnodes;
	}	
	
	public String toString() {
		return this.getName();
	}
}
