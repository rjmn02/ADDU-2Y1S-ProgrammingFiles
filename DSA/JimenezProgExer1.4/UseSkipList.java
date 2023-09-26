import java.util.*;
import java.io.*;
public class UseSkipList {
    public static void main(String[] args) {
        writeToFile();
    }

    static void writeToFile(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            for(int i = 1; i <= 100; i++){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            bw.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}

