# GNode_DFS
# This GNode_DFS include three files:
#   1. GNode.java - GNode interface
#   2. GraphDFSRecursive.java - walkGraph and path functions are included
#   3. GraphNodeTest.java - public static void main for run this project

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
