package session44;

import java.util.HashSet;

import session45.GraphTraversals;

public class GraphClient {
	public static void main(String[] args) {
		GraphTraversals graph = new GraphTraversals(5);
		graph.addEdge(1, 2, 10);
		graph.addEdge(3, 4, 77);
		graph.addEdge(4, 5, 180);
		//graph.addEdge(4, 2, 180);
		// graph.removeEdge(4, 5);
		// graph.removeVertex(1);
		graph.display();
		graph.BFT();

	}
}
