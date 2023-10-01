package session44;

public class GraphClient {
	public static void main(String[] args) {
		Graph graph = new Graph(5);
		graph.addEdge(1, 2, 10);
		graph.addEdge(3, 4, 77);
		graph.addEdge(4, 5, 180);
		graph.removeEdge(4, 5);
		graph.removeVertex(1);
		graph.display();

	}
}
