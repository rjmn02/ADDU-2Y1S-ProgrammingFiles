import java.util.*;
import java.io.*;

public class Main {
    static Scanner console = new Scanner(System.in);

    //comment
    public static void main(String[] args) {
        IntSLList list1 = new IntSLList();
        list1.addToHead(2);
        list1.addToHead(43);
        list1.addToHead(45);

        list1.printAll();
    }

}
