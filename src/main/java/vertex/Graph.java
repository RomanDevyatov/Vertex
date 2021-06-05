package vertex;

public interface Graph<F extends Comparable<F>> {
 public boolean addEdge (Edge<F> e);
    // add edge e to graph g if its vertices are already in g
    // and e doesn’t already exist in g
    // return true if successful and false otherwise
    public boolean addVertex (Vertex<F> v);
    // Add vertex v to graph g if g doesn’t already contain v
    // or any vertex with the same label as v
    // return true if successful and false otherwise
    public boolean deleteEdge (Edge<F> e);
    // delete edge edge if it is present in graph
    // return true if successful and false otherwise
    public boolean deleteVertex (Vertex<F> v);
// delete vertex v if it is present in graph, and all edges that contain v
    // return true if successful and false otherwise
}
