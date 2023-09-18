public class Invoice{
    private String part_number;
    private String part_description;
    private int quantity;
    private double price_per_item;
    
    
    //constructor
    public Invoice(String part_number, String part_description, int quantity, double price_per_item){
        this.part_number = part_number;
        this.part_description = part_description;
        this.quantity = quantity;
        this.price_per_item = price_per_item;
    }
    
    //getters
    public String getPartNumber(){
        return this.part_number;
    }
    
    public String getPartDescription(){
        return this.part_description;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public double getPricePerItem(){
        return this.price_per_item;
    }
    
    //setters
    public void setPartNumber(String partNum){
        this.part_number = partNum;
    }
    
    public void setPartDescription(String partDesc){
        this.part_description = partDesc;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public void setPricePerItemI(double pricePerItem){
        this.price_per_item = pricePerItem;
    }
    
    //getInvoice method
    public double getInvoiceAmount(){
        return this.quantity * this.price_per_item;
    }
    
}