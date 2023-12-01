import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class DWGraph {
    private Map<Vertex, LinkedList<Edge>> adjList;

    public DWGraph(){
        adjList = new LinkedHashMap<>();
    }
    
    //add vertex
    public void addVertex(char key){
        Vertex v = new Vertex(key);
        adjList.put(v, new LinkedList<>());
    }
    //add edge
    public void addEdge(char src, char dst, int w){
        Vertex srcV = getVertex(src);
        Vertex dstV = getVertex(dst);

        if(srcV != null && dstV != null){
            adjList.get(srcV).add(new Edge(dstV, w));
        }
    }

    public Vertex getVertex(char key){
        for(Vertex v : adjList.keySet()){
            if(v.getData() == key){
                return v;
            }
        }
        return null;
    }

    public void displayGraph(){
        System.out.println("ADJACENCY LIST: ");
        for(Vertex v: adjList.keySet()){
            System.out.print("| " + v.toString() + " | ");
            for(Edge e: adjList.get(v)){
                System.out.print(e.toString() + " ");
            }
            System.out.println();
        }
    }
}