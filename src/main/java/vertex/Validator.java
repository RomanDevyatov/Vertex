package vertex;

import java.util.List;

public class Validator<F> {

    protected boolean checkIfVertexIsNotNull(Vertex<F> vertex) {
        return vertex != null && vertex.getValue() != null;
    }

    protected boolean checkIfEdgeIsNotNull(Edge<F> e) {
        return e != null && e.getVertex() != null && e.getVertexAnother() != null;
    }

    protected boolean checkAddVertex(List<Vertex<F>> vertices, Vertex<F> vertex) {
        return checkIfVertexIsNotNull(vertex) && !vertices.contains(vertex);
    }

    protected boolean checkAddEdge(List<Edge<F>> list, Edge<F> e) {
        return checkIfEdgeIsNotNull(e) && !list.contains(e);
    }

    protected boolean checkDeleteEdge(List<Edge<F>> edges, Edge<F> e) {
        return checkIfEdgeIsNotNull(e) && edges.contains(e);
    }

    protected boolean checkDeleteVertex(List<Vertex<F>> vertices, Vertex<F> v) {
        return checkIfVertexIsNotNull(v) && vertices.contains(v);
    }

}
