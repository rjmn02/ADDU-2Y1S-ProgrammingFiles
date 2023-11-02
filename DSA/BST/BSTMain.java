import java.io.FileReader;
import java.util.Scanner;

public class BSTMain{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BST tree = new BST();
        inputData(tree);
    }

    static void inputData(BST tree){
        try {
            FileReader fr = new FileReader("bst.txt");
            Scanner scan = new Scanner(fr);
            while(scan.hasNextLine()){
                tree.insert(Integer.parseInt(scan.nextLine()));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}