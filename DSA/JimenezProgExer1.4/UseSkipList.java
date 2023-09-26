import java.util.*;
import java.io.*;
public class UseSkipList {
    public static void main(String[] args) {
        IntSkipList list = new IntSkipList();
        writeNumbers();
        readFile(list);
        
    }

    static void userInput(){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter an integer to search on the list");
        int input = Integer.parseInt(console.nextLine()); 
    }
    static void readFile(IntSkipList list){
        try {
            FileReader fr = new FileReader("data.txt");
            Scanner in = new Scanner(fr);
            while(in.hasNextLine()){
                int val = Integer.parseInt(in.nextLine());
                list.skipListInsert(val);
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void writeNumbers(){
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

