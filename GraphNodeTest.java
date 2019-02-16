package GNode_DFS;

import java.util.ArrayList;

import GNode_DFS.GraphDFSRecursive;
import GNode_DFS.GNode;

/*
* Created a graph with DFS(Depth First Search) Recursive algorithm to find the path
*                        graph        path                    
*         A               A           paths(A)=((A B E K) (A B E L) (A B F) (A C G) (A C H) (A C I) (A D J M))
*      /  |  \              B
*     /   |   \               E
*    /    |    \                K
*   B     C     D               L
*  / \   /|\   /              F
*  E F  G H I  J            C
*  /\          /              G
*  K L        M               H
*                             I
*                           D
*                             J
*                               M                               
*                               
*  - Observe that this GNode can be thought of as defining a graph
*  - In implementing the functions below, you can assume that any graph defined by a GNode is acyclic(no cycles).
*  - Assume that when a GNode has no children, getChildren() returns a array of size 0, and *not* null
*  - You can also assume that all children returned by getChildren() are not null
*  
*  1) Implement a function with the following signature:
*     public ArrayList walkGraph(GNode);
*     - which should return a ArrayList containing every GNode in te graph.
*     - Each node should appear in the ArrayList exactly once (i.e. no duplicates)
*     
*  2) Implement a function with the following signature:
*     public ArrayList paths(GNode node);
*     - which should return a rrayList of ArrayLists, representing all possible pths through the graph strting at 'node'.
*     - The ArrayList returned can be thought of as a ArrayList of paths, where each path is represented as an ArrayList of GNodes.
* 
* <output>
* Find Graph from Node A: [A, B, E, K, L, F, C, G, H, I, D, J, M]
* Find Graph from Node B: [B, E, K, L, F]
* Find Graph from Node C: [C, G, H, I]
* Find Graph from Node D: [D, J, M]
* Find Graph from Node E: [E, K, L]
* Find Graph from Node J: [J, M]
* Find Graph from Node G: [G]
* Find the Path from Node A: [A, B, E, K, A, B, E, L, A, B, F, A, C, G, A, C, H, A, C, I, A, D, J, M]
* Find the Path from Node B: [B, E, K, B, E, L, B, F]
* Find the Path from Node C: [C, G, C, H, C, I]
* Find the Path from Node D: [D, J, M]
* Find the path from Node E: [E, K, E, L]
* Find the path from Node J: [J, M]
* Find the path from Node G: [G] 
*/

public class GraphNodeTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		GraphDFSRecursive ANodeObject = new GraphDFSRecursive("A");
		GraphDFSRecursive BNodeObject = new GraphDFSRecursive("B");
		GraphDFSRecursive CNodeObject = new GraphDFSRecursive("C");
		GraphDFSRecursive DNodeObject = new GraphDFSRecursive("D");
		GraphDFSRecursive ENodeObject = new GraphDFSRecursive("E");
		GraphDFSRecursive FNodeObject = new GraphDFSRecursive("F");
		GraphDFSRecursive GNodeObject = new GraphDFSRecursive("G");
		GraphDFSRecursive HNodeObject = new GraphDFSRecursive("H");
		GraphDFSRecursive INodeObject = new GraphDFSRecursive("I");
		GraphDFSRecursive JNodeObject = new GraphDFSRecursive("J");
		GraphDFSRecursive KNodeObject = new GraphDFSRecursive("K");
		GraphDFSRecursive LNodeObject = new GraphDFSRecursive("L");
		GraphDFSRecursive MNodeObject = new GraphDFSRecursive("M");
		
		GNode[] AChildren = new GNode[]{BNodeObject, CNodeObject, DNodeObject};
		ANodeObject.setChildren(AChildren);
		
		GNode[] BChildren = new GNode[]{ENodeObject, FNodeObject};
		BNodeObject.setChildren(BChildren);
		
		GNode[] CChildren = new GNode[]{GNodeObject, HNodeObject, INodeObject};
		CNodeObject.setChildren(CChildren);
		
		GNode[] DChildren = new GNode[]{JNodeObject};
		DNodeObject.setChildren(DChildren);
		
		GNode[] EChildren = new GNode[]{KNodeObject, LNodeObject};
		ENodeObject.setChildren(EChildren);
		
		GNode[] JChildren = new GNode[]{MNodeObject};
		JNodeObject.setChildren(JChildren);
		
		ArrayList<GNode> GraphA = new ArrayList<GNode>();
		ArrayList<GNode> GraphB = new ArrayList<GNode>();
		ArrayList<GNode> GraphC = new ArrayList<GNode>();
		ArrayList<GNode> GraphD = new ArrayList<GNode>();
		ArrayList<GNode> GraphE = new ArrayList<GNode>();
		ArrayList<GNode> GraphJ = new ArrayList<GNode>();
		// Check no children node's graph
		ArrayList<GNode> GraphG = new ArrayList<GNode>(); 
		
		ArrayList<GNode> PathA = new ArrayList<GNode>();
		ArrayList<GNode> PathB = new ArrayList<GNode>();
		ArrayList<GNode> PathC = new ArrayList<GNode>();
		ArrayList<GNode> PathD = new ArrayList<GNode>();
		ArrayList<GNode> PathE = new ArrayList<GNode>();
		ArrayList<GNode> PathJ = new ArrayList<GNode>();
		// Check no children node's path
		ArrayList<GNode> PathG = new ArrayList<GNode>();
		
		GraphA = ANodeObject.walkGraph(ANodeObject);
		GraphB = BNodeObject.walkGraph(BNodeObject);
		GraphC = CNodeObject.walkGraph(CNodeObject);
		GraphD = DNodeObject.walkGraph(DNodeObject);
		GraphE = ENodeObject.walkGraph(ENodeObject);
		GraphJ = JNodeObject.walkGraph(JNodeObject);		
		// Check no children node's graph
		GraphG = GNodeObject.walkGraph(GNodeObject);
		
		PathA = ANodeObject.paths(ANodeObject);
		PathB = BNodeObject.paths(BNodeObject);
		PathC = CNodeObject.paths(CNodeObject);
		PathD = DNodeObject.paths(DNodeObject);
		PathE = ENodeObject.paths(ENodeObject);
		PathJ = JNodeObject.paths(JNodeObject);
		// Check no children node's path
		PathG = GNodeObject.paths(GNodeObject);

		//System.out.println();
		System.out.println("Find Graph from Node A: " + GraphA);
		System.out.println("Find Graph from Node B: " + GraphB);
		System.out.println("Find Graph from Node C: " + GraphC);
		System.out.println("Find Graph from Node D: " + GraphD);
		System.out.println("Find Graph from Node E: " + GraphE);
		System.out.println("Find Graph from Node J: " + GraphJ);
		System.out.println("Find Graph from Node G: " + GraphG);
		 
		System.out.println("Find the Path from Node A: " + PathA);		
		System.out.println("Find the Path from Node B: " + PathB);
		System.out.println("Find the Path from Node C: " + PathC);		
		System.out.println("Find the Path from Node D: " + PathD);
		System.out.println("Find the path from Node E: " + PathE);
		System.out.println("Find the path from Node J: " + PathJ);
		System.out.println("Find the path from Node G: " + PathG);
	}

}
