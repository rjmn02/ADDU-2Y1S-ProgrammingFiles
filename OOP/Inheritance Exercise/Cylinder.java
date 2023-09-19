
public class Cylinder extends Circle{
    private double height;

    public Cylinder(double r, double h){
        super(r);
        this.height = h;
    }

    public double volume(){
        return super.pi * (super.getRadius() * super.getRadius()) * this.height;
    }

    public double surfaceArea(){
        return (super.circumference() * this.height) + (2 * super.pi * (super.getRadius() *  super.getRadius()));
    }
    
}
