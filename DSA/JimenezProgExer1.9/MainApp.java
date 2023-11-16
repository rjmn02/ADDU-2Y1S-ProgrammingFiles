import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BST tree = new BST();
        inputData(tree);
        showSoftware(tree);
        // String choice;
        // boolean selection = true;

        // while(true) {
        //     System.out.println("1: Show Software");
        //     System.out.println("2: Add Software");
        //     System.out.println("3: Sell");
        //     System.out.println("4: Exit");
            
        //     System.out.println("Enter choice: ");
        //     choice = in.nextLine();
            
        //     switch(choice){
        //         case "1":
        //             showSoftware(tree);
        //         case "2":
        //             addSoftware(tree);
        //             break;
        //         case "3":
        //             sellSoftware(tree);
        //             break;
        //         case "4":
        //             selection = false;
        //             break;
        //     }
        // }

    }


    static void showSoftware(BST tree){
        tree.inorder();
    }
    static void sellSoftware(BST tree){
        
    }
    static void addSoftware(BST tree){

    }

    static void inputData(BST tree){
        try {
            FileReader fr = new FileReader("software.txt");
            Scanner scan = new Scanner(fr);
            while(scan.hasNextLine()){
                String name = scan.nextLine();
                String ver = scan.nextLine();
                int quantity = Integer.parseInt(scan.nextLine());
                double price = Double.parseDouble(scan.nextLine());
                
                Software software = new Software(name, ver, quantity, price);
                tree.insert(software);

            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
