import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        DWGraph dwGraph = new DWGraph();
        inputData(dwGraph);
        dwGraph.displayGraph();
        dwGraph.dijkstraAlgorithm('A');
    }

    static void inputData(DWGraph dwGraph){
        try(BufferedReader br = new BufferedReader(new FileReader("graph.txt"))) {
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] verts = line.split(" ");
                if(verts.length == 1){
                    dwGraph.addVertex(verts[0].charAt(0));   
                } else{
                    char src = verts[0].charAt(0);
                    char dst = verts[1].charAt(0);
                    int w = Integer.parseInt(verts[2]);
                    dwGraph.addEdge(src, dst, w);
                }
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
