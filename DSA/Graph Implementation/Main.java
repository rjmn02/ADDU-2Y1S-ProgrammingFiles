import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int numVertices = 0;
        Graph graph = new Graph(numVertices);

        inputData(graph);

    }

    static void inputData(Graph graph) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("graph.txt"));
        Scanner scan = new Scanner(br);
        while (scan.hasNextLine()) {
            graph.add

        }
    }


}
