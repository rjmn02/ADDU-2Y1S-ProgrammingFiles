public class Item{
    private String item_name;
    private int quantity;
    private double price;
    
    //constructor
    public Item(String item_name, int quantity, double price){
        this.item_name = item_name;
        this.quantity = quantity;
        this.price = price;
    }
    
    //setter
    public void setItemName(String item_name){
        this.item_name = item_name;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(double price){
        this.price = price;
    } 
    
    //getter
    public String getItemName(){
        return this.item_name;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getPrice(){
        return this.price;
    }
    
    @Override
    public String toString(){
        return this.item_name + "\t\t" + this.quantity + "\t" + this.price + "\t\t";
    }
    
}