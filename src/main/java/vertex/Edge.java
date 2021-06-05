package vertex;

import java.util.Objects;

public class Edge<F> extends Validator<F> {
    private Vertex<F> vertex;
    private Vertex<F> vertexAnother;

    public Edge(Vertex<F> vertex, Vertex<F> vertexAnother) {
        if (checkIfVertexIsNotNull(vertex) && checkIfVertexIsNotNull(vertexAnother) && !vertex.equals(vertexAnother)) {
            this.vertex = vertex;
            this.vertexAnother = vertexAnother;
        } else {
            System.out.println("Vertexes are equal or null!");
        }
    }

    public Vertex<F> getVertex() {
        return vertex;
    }

    public void setVertex(Vertex<F> vertex) {
        this.vertex = vertex;
    }

    public Vertex<F> getVertexAnother() {
        return vertexAnother;
    }

    public void setVertexAnother(Vertex<F> vertexAnother) {
        this.vertexAnother = vertexAnother;
    }

    @Override
    public String toString() {
        return "(" + vertex + "," + vertexAnother + ") ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edge<?> edge = (Edge<?>) o;

        if (!Objects.equals(vertex, edge.vertex)) return false;
        return Objects.equals(vertexAnother, edge.vertexAnother);
    }

    @Override
    public int hashCode() {
        int result = vertex != null ? vertex.hashCode() : 0;
        result = 31 * result + (vertexAnother != null ? vertexAnother.hashCode() : 0);
        return result;
    }
}
