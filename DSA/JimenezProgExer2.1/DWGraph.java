import java.lang.reflect.Array;
import java.util.ArrayList;
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
    
    public void dijkstraAlgorithm(char startVer){
        System.out.println("SHORTEST PATH DJIKSTRA'S ALGORITHM: ");
        Vertex first = getVertex(startVer);
        System.out.println("Starting Vertex: " + first.toString());
        dijkstraHelper(adjList, first);
    }

    private void dijkstraHelper(Map<Vertex, LinkedList<Edge>> digraph, Vertex first){
        Map<Vertex, Integer> currDist = new LinkedHashMap<>();

        for(Vertex v: digraph.keySet()){
            currDist.put(v, Integer.MAX_VALUE);
        }
        currDist.put(first, 0);
        
        ArrayList<Vertex> toBeChecked = new ArrayList<>(digraph.keySet());
        while(!toBeChecked.isEmpty()) {
            Vertex v = findMin(toBeChecked, currDist);
            toBeChecked.remove(v);
            for(Edge e: digraph.get(v)){
                Vertex u = e.getConnectedVertex();
                if(toBeChecked.contains(u)){
                    if(currDist.get(u) > currDist.get(v) + e.getWeight()){
                        currDist.put(u, currDist.get(v) + e.getWeight());
                    }
                }
            }
            
        }

        printDijkstra(currDist);
        
    }

    private Vertex findMin(ArrayList<Vertex> toBeChecked, Map<Vertex, Integer> currDist){
        Vertex minVer = null;
        int minDist = Integer.MAX_VALUE;

        for (Vertex v : toBeChecked) {
            int distance = currDist.get(v);
            if (distance <= minDist) {
                minDist = distance;
                minVer = v;
            }
        }

        return minVer;
    }

    private void printDijkstra(Map<Vertex, Integer> graph){
        for (Vertex v : graph.keySet()) {
            System.out.println(v.toString() + " " +graph.get(v));
        }
    }
    
}