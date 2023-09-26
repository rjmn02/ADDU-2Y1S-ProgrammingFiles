import java.util.*;
import java.io.*;
public class UseSkipList {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        IntSkipList list = new IntSkipList();
        writeNumbers(); //write numbers in data.txt
        readFile(list);

        
        System.out.println("Enter an integer to search on the list: ");
        int input = Integer.parseInt(console.nextLine());
        console.close();
        int node = list.skipListSearch(input);
        if(input != 0){
            System.out.println("Nodes searched: " + node);
        }else{
            System.out.println("Not found");
        }

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
            for(int i = 1; i <= 100; i++){  //write 1-100
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            bw.close();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}

