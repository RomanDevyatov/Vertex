package vertex;

import java.util.ArrayList;
import java.util.List;

public class GraphImpl<F extends Comparable<F>> extends Validator<F> implements Graph<F> {

    private List<Vertex<F>> vertices = new ArrayList<>();
    private List<Edge<F>> edges = new ArrayList<>();
    private int vertexNumber = 0;
    private int edgeNumber = 0;

    public GraphImpl() {}

    public GraphImpl(List<Vertex<F>> vertices) {
        this.vertices = vertices;
    }

    public GraphImpl(ArrayList<Vertex<F>> vertices, ArrayList<Edge<F>> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    public int getVertexNumber() {
        return vertexNumber;
    }

    public void setVertexNumber(int vertexNumber) {
        this.vertexNumber = vertexNumber;
    }

    public int getEdgeNumber() {
        return edgeNumber;
    }

    public void setEdgeNumber(int edgeNumber) {
        this.edgeNumber = edgeNumber;
    }

    public List<Vertex<F>> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex<F>> vertices) {
        this.vertices = vertices;
    }

    public List<Edge<F>> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge<F>> edges) {
        this.edges = edges;
    }

    @Override
    public boolean addEdge(Edge<F> e) {
        if (checkAddEdge(edges, e)) {
            edges.add(e);
            edgeNumber++;
            return true;
        }
        return false;
    }

    @Override
    public boolean addVertex(Vertex<F> v) {
        if (checkAddVertex(vertices, v)) {
            vertices.add(v);
            vertexNumber++;
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteEdge(Edge<F> e) {
        if (checkDeleteEdge(edges, e)) {
            edges.remove(e);
            edgeNumber--;
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteVertex(Vertex<F> v) {
        if (checkDeleteVertex(vertices, v)) {
            vertices.remove(v);
            edges.removeIf(edge -> edge.getVertex().equals(v) || edge.getVertexAnother().equals(v));
            vertexNumber--;
        }
        return false;
    }
}
