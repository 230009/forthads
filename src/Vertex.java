import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents a vertex in a graph
 * @param <T> - the type of data stored in the vertex
 */
public class Vertex<T> {
    private T data;
    private Map<Vertex<T>, Double> adjacentVertices;

    /**
     * @param data - the data to be stored in the vertex
     */
    public Vertex(T data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }

    /**
     * @param data - the data to be stored in the vertex
     * @param adjacentVertices - the adjacent vertices with their edge weights
     */
    public Vertex(T data, Map<Vertex<T>, Double> adjacentVertices) {
        this.data = data;
        this.adjacentVertices = adjacentVertices;
    }

    /**
     * @return - returns the data stored in the vertex
     */
    public T getData() {
        return data;
    }

    /**
     * @param data - sets the data to be stored in the vertex
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return - returns the adjacent vertices with their edge weights
     */
    public Map<Vertex<T>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }

    /**
     * @param adjacentVertices - adjacentVertices the adjacent vertices with their edge weights
     */
    public void setAdjacentVertices(Map<Vertex<T>, Double> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vertex<?> vertex = (Vertex<?>) obj;
        return Objects.equals(data, vertex.data);
    }
}
