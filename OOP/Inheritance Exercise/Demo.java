
public class Demo {
    public static void main(String[] args) {
        Circle cr = new Circle(2.11);
        Cylinder cyl = new Cylinder(2.11, 9);

        System.out.println("Circle dia: " + cr.diameter());
        System.out.println("Circle circumference: " + cr.circumference());
        System.out.println("Circle area: " + cr.area() + "\n");

        System.out.println("Cyl surface area: " + cyl.surfaceArea());
        System.out.println("Cyl volume: " + cyl.volume());

    }
}
