import java.util.*;
import java.io.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<Item> shoppingCart = new ArrayList<>();
        
        String menuItems = "y";
        boolean selection = true;
        
        while(selection) {
            System.out.println("A: Add Items in cart");
            System.out.println("V: View cart");
            System.out.println("E: Edit item");
            System.out.println("D: Delete item");
            System.out.println("C: Compute total and Clear the cart");
            System.out.println("Q: Quit");
            
            System.out.println("Enter choice: ");
            menuItems = in.nextLine();
            
            switch(menuItems.toUpperCase()){
                case "A":
                    addItemtoCart(shoppingCart);
                    break;
                case "V":
                    viewCart(shoppingCart);
                    break;
                case "E":
                    editItem(shoppingCart);
                    break;
                case "D":
                    deleteItem(shoppingCart);
                    break;
                case "C":
                    checkout(shoppingCart);
                    break;
                case "Q":
                    selection = false;
                    break;
            }
            
        }
        
    }
    
    static void addItemtoCart(ArrayList<Item> shoppingCart) {
        
        String item_name;
        int quantity;
        int quantityOfItems;
        double price;
        
        System.out.println("----------------ADDING ITEMS TO CART----------------");
        System.out.println("How many items do you want to add?");
        quantityOfItems = Integer.parseInt(in.nextLine());
        
        System.out.println("");
        for(int i = 0; i < quantityOfItems; i++){
            System.out.println("Enter item name: ");
            item_name = in.nextLine();
            
            System.out.println("Enter quantity: ");
            quantity = Integer.parseInt(in.nextLine());
            
            System.out.println("Enter price: ");
            price = Double.parseDouble(in.nextLine());
            
            shoppingCart.add(new Item(item_name, quantity, price));
        }
        System.out.println("");
        
    }
    
    static void viewCart(ArrayList<Item> shoppingCart) {
        
        System.out.println("-----------------------------------------------------");
        
        for(Item item: shoppingCart){
            System.out.printf("%s %.2f \n", item.toString(), (item.getPrice() * item.getQuantity()));
        }
        
        System.out.println("-----------------------------------------------------\n");

    }
    
    static void editItem(ArrayList<Item> shoppingCart) {
        
        
        System.out.println("-----------------------------------------------------");
        int i = 0;
        for(Item item: shoppingCart){
            System.out.printf("%d %s %.2f \n", i, item.toString(), (item.getPrice() * item.getQuantity()));
            i++;
        }
        
        System.out.println("-----------------------------------------------------\n");
        
        
        int itemIndex;
        String itemData;
        
        System.out.println("Enter item index to edit: ");
        itemIndex = Integer.parseInt(in.nextLine());
            
        System.out.println("Enter new name");
        String newName = in.nextLine();
            
        System.out.println("Enter new quantity");
        int newQuantity = Integer.parseInt(in.nextLine());

        System.out.println("Enter new price");
        double newPrice = Double.parseDouble(in.nextLine());
            
        shoppingCart.set(itemIndex, new Item(newName, newQuantity, newPrice));
        
    }
    
    static void deleteItem(ArrayList<Item> shoppingCart) {
        
        int itemIndex;
        
        System.out.println("-----------------------------------------------------");
        int i = 0;
        for(Item item: shoppingCart){
            System.out.printf("%d %s %.2f \n", i, item.toString(), (item.getPrice() * item.getQuantity()));
            i++;
        }
        
        System.out.println("-----------------------------------------------------\n");
        
        System.out.println("Enter item index to remove: ");
        
        itemIndex = Integer.parseInt(in.nextLine());
        
        shoppingCart.remove(itemIndex);
        
    }
    
    static void checkout(ArrayList<Item> shoppingCart) {
        double total = totalPrice(shoppingCart);
        
        System.out.println("-----------------------------------------------------");
        for(Item item: shoppingCart){
            System.out.printf("%s %.2f \n", item.toString(), (item.getPrice() * item.getQuantity()));
        }
        System.out.printf("Total amount in shopping cart: %.2f \n", total);
        System.out.println("-----------------------------------------------------");
        
        //shoppingCart = new ArrayList<>();
        //correction:
        shoppingCart.clear();
    }
    
    static double totalPrice(ArrayList<Item> shoppingCart){
        
        double total = 0;
        
        for(int i = 0; i < shoppingCart.size(); i++){
            double price = shoppingCart.get(i).getPrice();
            int quantity = shoppingCart.get(i).getQuantity();
            
            total += (price*quantity);
        }
        
        return total;
    }
    
}