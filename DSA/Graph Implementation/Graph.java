import java.util.ArrayList;

public class Graph{
    ArrayList<Vertex> vertices = new ArrayList<>();
    private int[][] adjacencyMatrix;
    

    public Graph(int numVertices) {
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    //addvertex(data)
    public void addVertex(Vertex v){
        vertices.add(v);
    }
    //addedge()

}
