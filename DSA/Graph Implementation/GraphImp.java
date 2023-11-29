import java.util.*;
public class GraphImp{

    private Map<Vertex, LinkedList<Vertex>> adjList;
    private ArrayList<Vertex> vertices;

    public GraphImp() {
        adjList = new LinkedHashMap<>();
        vertices = new ArrayList<>();
    }

    //addvertex(data)
    public void addVertex(Vertex v){
        vertices.add(v);
        adjList.put(v, new LinkedList<>());
    }

    //addedge() undirected
    public void addEdge(Vertex v1, Vertex v2){

        //if v1 is not in adjlist addvertex
        //if v2 is not in adjlist addvertex

        if(!adjList.containsKey(v1))
            addVertex(v1);
        if(!adjList.containsKey(v2))
            addVertex(v2);
        
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1);
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

    public void displayIncidenceList() {

        printLines();
        System.out.println("Incidence List: ");
        printLines();

        for(Vertex v : adjList.keySet()){
            System.out.print("| " + v.toString() + " | ");
            for(Vertex adjV : adjList.get(v)){
                System.out.print(v.toString() + adjV.toString() + " ");
            }
            System.out.println();
        }
        printLines();
    }

    //traversals
    // public void DFS(char start){
    //     Vertex startV = getVertex(start);

    //     DFSRec(startV, )
    // }
    // private void DFSRec(){

    // }
    // public void BFS(){}

    private void printLines(){
        System.out.println("---------------------------------------");
    }
}
