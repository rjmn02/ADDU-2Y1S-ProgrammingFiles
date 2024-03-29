import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
public class Graph{

    private HashMap<Vertex, LinkedList<Vertex>> adjList;
    private ArrayList<Vertex> vertices;

    public Graph() {
        adjList = new HashMap<>();
        vertices = new ArrayList<>();
    }

    //addvertex(data)
    public void addVertex(Vertex v){
        vertices.add(v);
        adjList.put(v, new LinkedList<>());
    }

    //addedge() directed
    public void addEdge(Vertex v1, Vertex v2){

        //if v1 is not in adjlist addvertex
        //if v2 is not in adjlist addvertex

        if(!adjList.containsKey(v1))
            addVertex(v1);
        if(!adjList.containsKey(v2))
            addVertex(v2);
        
        adjList.get(v1).add(v2);
    }
    
    
    public Vertex getVertex(char key){
        for(Vertex v : vertices){
            if(v.getData() == key){
                return v;
            }
        }
        return null;
    }

    //display adj list
    public void displayAdjList() {

        printLines();
        System.out.println("Adjacency List: ");
        printLines();

        for(Vertex v : adjList.keySet()){
            System.out.print("| " + v.toString() + " | ");
            for(Vertex adjV : adjList.get(v)){
                System.out.print(adjV.toString() + " ");
            }
            System.out.println();
        }
        printLines();

    }
    
    public void DFS(Vertex start){
        ArrayList<Vertex> visitedVertices = new ArrayList<>();
        DFSRecursion(start, visitedVertices);

    }

    private void DFSRecursion(Vertex v, ArrayList<Vertex> visitedVertices){

        visitedVertices.add(v);
        System.out.print(v.getData() + "-");
        
        //store adjacent vertices of v
        LinkedList<Vertex> adjVerts = this.adjList.get(v);

        for(Vertex adjV : adjVerts){
            if(!(visitedVertices.contains(adjV))){
                DFSRecursion(adjV, visitedVertices);
            }
        }
    }

    private void printLines(){
        System.out.println("---------------------------------------");
    }
}
