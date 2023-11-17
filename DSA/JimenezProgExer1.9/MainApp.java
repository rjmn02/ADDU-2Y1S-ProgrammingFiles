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
                         break;
               }
          }
     }


    static void showSoftware(SoftwareBST tree){
        tree.showTree();
    }
    static void sellSoftware(SoftwareBST tree){
        System.out.println("Enter Software Name and Version Number");
        String name = in.nextLine();
        String ver = in.nextLine();

        System.out.println("Quantity: ");
        int quantity = Integer.parseInt(in.nextLine());

        tree.sellSoftware(new Software(name, ver, quantity, 0));
        
    }
    static void addSoftware(SoftwareBST tree){
        System.out.println("Enter Software Name, Version Number and Price:");
        String name = in.nextLine();
        String ver = in.nextLine();
        double price = Double.parseDouble(in.nextLine());

        System.out.println("Quantity: ");
        int quantity = Integer.parseInt(in.nextLine());
        
        tree.addSoftware(new Software(name, ver, quantity, price));
    }

    static void inputData(SoftwareBST tree){
        try {
            FileReader fr = new FileReader("software.txt");
            Scanner scan = new Scanner(fr);
            while(scan.hasNextLine()){
               String name = scan.nextLine();
               String ver = scan.nextLine();
               int quantity = Integer.parseInt(scan.nextLine());
               double price = Double.parseDouble(scan.nextLine());
                
               Software software = new Software(name, ver, quantity, price);
               tree.insertData(software);
                
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}