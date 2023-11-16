public class Software {
    
    private String name;
    private String version;
    private int quantity;
    private double price;

    public Software(String name, String version, int quantity, double price) {
        this.name = name;
        this.version = version;
        this.quantity = quantity;
        this.price = price;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", version='" + getVersion() + "'" +
            ", quantity='" + getQuantity() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }
