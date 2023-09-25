import java.util.*;
import java.io.*;

public class Main {
    static Scanner console = new Scanner(System.in);

    //comment
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        IntSLList list1 = new IntSLList();;

        list1.addToHead(2);
        list1.addToHead(65);
        list1.addToHead(5);
        list1.addToHead(9);

        list1.printAll();
        System.out.println("\n");

        list1.delete(65);

        list1.printAll();
    }

}
