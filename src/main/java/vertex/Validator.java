package vertex;

import java.util.List;

public class Validator<F> {

    protected boolean checkIfVertexIsNotNull(Vertex<F> vertex) {
        return vertex != null && vertex.getValue() != null;
    }

    protected boolean checkAddVertex(List<Vertex<F>> vertexList, Vertex<F> vertex) {
        return checkIfVertexIsNotNull(vertex) && !vertexList.contains(vertex);
    }

    protected boolean checkIfEdgeIsNull(Edge<F> e) {
        return e == null || e.getVertex() == null || e.getVertexAnother() == null;
    }

    protected boolean checkAddEdge(List<Edge<F>> list, Edge<F> e) {
        return !checkIfEdgeIsNull(e) && !list.contains(e);
    }

    protected boolean checkDeleteEdge(List<Edge<F>> edges, Edge<F> e) {
        if (e != null && e.getVertexAnother() != null && e.getVertex() != null) {
            return edges.contains(e);
        }
        return false;
    }

    protected boolean checkDeleteVertex(Vertex<F> v) {
        return checkIfVertexIsNotNull(v);
    }

}
