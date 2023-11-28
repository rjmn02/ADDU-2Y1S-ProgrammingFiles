import java.io.*;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        GraphImp graph = new GraphImp();
        inputData(graph);
        graph.displayAdjList();
        graph.displayIncidenceList();
    }

    static void inputData(GraphImp graph){
        try(BufferedReader br = new BufferedReader(new FileReader("graph.txt"))) {
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] verts = line.split(" ");
                if(verts.length == 1){
                    graph.addVertex(new Vertex(verts[0].charAt(0)));   
                }else if(verts.length == 2){
                    //get vertex from graph
                    //add edges 
                    Vertex v1 = graph.getVertex(verts[0].charAt(0));
                    Vertex v2 = graph.getVertex(verts[1].charAt(0));
                    if(v1 != null && v2 != null){
                        graph.addEdge(v1, v2);
                    }
                }
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


}
