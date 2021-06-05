package vertex;

public class Vertex<F> {
    private F value;

    public F getValue() {
        return value;
    }

    public void setValue(F value) {
        this.value = value;
    }

    public Vertex() { }

    public Vertex(F value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + value + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Vertex<?> vertex = (Vertex<?>) o;

        return value != null && value.equals(vertex.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
