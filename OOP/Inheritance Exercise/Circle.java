import java.util.*;
import java.io.*;

public class Circle {
    private double radius;

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
        return Math.PI*(this.radius*this.radius);
    }

    public double circumference(){
        return 2*Math.PI*this.radius;
    }

}