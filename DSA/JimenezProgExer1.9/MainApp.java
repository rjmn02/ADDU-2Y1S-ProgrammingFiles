import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    static Scanner in = new Scanner(System.in);
     public static void main(String[] args) {
          SoftwareBST tree = new SoftwareBST();
          inputData(tree);

          String choice;
          boolean selection = true;
          while(selection) {
               System.out.println("1: Show Software");
               System.out.println("2: Add Software");
               System.out.println("3: Sell");
               System.out.println("4: Exit");

               System.out.println("Enter choice: ");
               choice = in.nextLine();

               switch(choice){
                    case "1":
                         showSoftware(tree);
                         break;
                    case "2":
                         addSoftware(tree);
                         break;
                    case "3":
                         sellSoftware(tree);
                         break;
                    case "4":
                         selection = false;
                         break;
                    default: 
                        System.out.println("Invalid input. \n");
                         break;
               }
          }
     }


    static void showSoftware(SoftwareBST tree){
        tree.showTree();
    }
    static void sellSoftware(SoftwareBST tree){
        tree.showTree();
        System.out.println("----------------------------Enter Software's Details----------------------------");
        System.out.print("Name: ");
        String name = in.nextLine().trim();
        System.out.print("Version: ");
        String ver = in.nextLine().trim();
        System.out.print("Price of the Software: ");
        double price = Double.parseDouble(in.nextLine().trim());

        System.out.println("Quantity To Sell: ");
        int quantity = Integer.parseInt(in.nextLine().trim());

        tree.sellSoftware(new Software(name, ver, quantity, price));
        
    }
    static void addSoftware(SoftwareBST tree){
        tree.showTree();
        System.out.println("----------------------------Enter Software's Details----------------------------");
        System.out.print("Name: ");
        String name = in.nextLine().trim();
        System.out.print("Version: ");
        String ver = in.nextLine().trim();
        System.out.print("Price of the Software: ");
        double price = Double.parseDouble(in.nextLine().trim());

        System.out.println("Quantity To Add: ");
        int quantity = Integer.parseInt(in.nextLine().trim());
        
        tree.addSoftware(new Software(name, ver, quantity, price));
    }

    static void inputData(SoftwareBST tree){
        try {
            FileReader fr = new FileReader("software.txt");
            Scanner scan = new Scanner(fr);
            while(scan.hasNextLine()){
               String name = scan.nextLine().trim();
               String ver = scan.nextLine().trim();
               int quantity = Integer.parseInt(scan.nextLine().trim());
               double price = Double.parseDouble(scan.nextLine().trim());
                
               Software software = new Software(name, ver, quantity, price);
               tree.fillTree(software);
                
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}