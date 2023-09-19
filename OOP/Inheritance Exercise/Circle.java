

public class Circle {
    private double radius;
    protected final double pi = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double diameter(){
        return this.radius*2;
    }

    public double area(){
        return pi*(this.radius*this.radius);
    }

    public double circumference(){
        return 2*pi*this.radius;
    }

}