package dataStructure;

class Node9{
	int data;
	Node9 next;
	
	Node9(int data){
		this.data = data;
		this.next = null;
	}
}

class Graph{
	int v;
	Node9 adjList[];
	Graph(int v){
		this.v = v;
		adjList=new Node9[v];
		for(int i=0;i<v;i++) {
			adjList[i] = null;
		}
	}
	
	public void addEdges(int i, int j) {
		Node9 newNode = new Node9(j); // directed
		newNode.next = adjList[i];	  // graph
		adjList[i] = newNode;
		
		newNode = new Node9(i); 	// undirected
		newNode.next = adjList[j];	// graph
		adjList[j] = newNode;
	}

	public void dfs(int i) {
		boolean visited[] = new boolean[v];
		dfscall(i,visited);
	}

	private void dfscall(int i, boolean[] visited) {
		visited[i] = true;
		System.out.print(i+" ");
		Node9 temp = adjList[i];
		while(temp!=null) {
			int neighbour = temp.data;
			if(!visited[neighbour]) {
				dfscall(neighbour, visited);
			}
			temp = temp.next;
		}
	}
	
}

public class DepthFirstSearch {

	public static void main(String[] args) {
		
		Graph g = new Graph(6);
		g.addEdges(0,1);
		g.addEdges(0,2);
		g.addEdges(1,3);
		g.addEdges(2,3);
		g.addEdges(2,4);
		g.addEdges(3,4);
		g.addEdges(3,5);
		g.addEdges(4,5);
		
		g.dfs(0);
	}

}
