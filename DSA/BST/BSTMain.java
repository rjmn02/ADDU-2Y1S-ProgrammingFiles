import java.io.FileReader;
import java.util.Scanner;

public class BSTMain{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BST tree = new BST();
        inputData(tree);
        System.out.println("Number to search: ");
        int key = Integer.parseInt(console.nextLine());

        if(tree.search(key)){
            System.out.println("Value is in the tree");
            System.out.println("Nodes searched: " + tree.count);
        }
        else{
            System.out.println("Value is not in the tree.");
            System.out.println("Nodes searched: " + tree.count);
        }
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