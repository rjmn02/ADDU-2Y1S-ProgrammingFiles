import java.util.*;
import java.io.*;

public class Main {
    static Scanner console = new Scanner(System.in);

    //comment
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        IntSLList list1 = new IntSLList();

        
        int input;
        while(true){
            input = Integer.parseInt(console.nextLine());
            if(input == 0){
                break;
            }else if(input % 2 != 0){
                list1.addToHead(input);
            }else{
                list1.addToTail(input);
            }
        }

        list1.printAll();

    }

}
