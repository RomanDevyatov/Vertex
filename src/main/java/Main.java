import vertex.Edge;
import vertex.GraphImpl;
import vertex.Vertex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String... args) {
        Vertex<String> ver1 = new Vertex<>("a");
        Vertex<String> ver2 = new Vertex<>("b");
        Vertex<String> ver3 = new Vertex<>("c");
        Vertex<String> ver4 = new Vertex<>("d");
        Vertex<String> ver5 = new Vertex<>();
        List<Vertex<String>> vertexList = new ArrayList(Arrays.asList( ver2, ver1,ver4, ver3));

        Edge<String> edge1 = new Edge<>(ver1, ver2);
        Edge<String> edge2 = new Edge<>(ver1, ver3);
        Edge<String> edge3 = new Edge<>(ver1, ver4);
        Edge<String> edge4 = new Edge<>(ver1, ver1);
        Edge<String> edge5 = new Edge<>(ver2, ver4);
        Edge<String> edge6 = new Edge<>(ver2, ver5);

        GraphImpl<String> graph = new GraphImpl<>(vertexList);

        graph.addEdge(edge1);
        graph.addEdge(edge2);
        graph.addEdge(edge2);
        graph.addEdge(edge3);
        graph.addEdge(edge3);
        graph.addEdge(edge4);
        graph.addEdge(edge5);
        graph.addEdge(edge6);

        System.out.println(graph.getVertices());
        System.out.println(graph.getEdges());

        graph.deleteEdge(edge2);
        graph.deleteEdge(edge6);
        graph.deleteVertex(ver5);
        graph.deleteVertex(ver1);

        System.out.println(graph.getVertices());
        System.out.println(graph.getEdges());


    }
}