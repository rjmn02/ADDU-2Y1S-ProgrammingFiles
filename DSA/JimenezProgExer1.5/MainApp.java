import java.util.*;
import java.io.*;
public class MainApp {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        readFile(list);
    }

    static void readFile(LinkedList<Student> list){
        try {
            FileReader fr = new FileReader("students.txt");
            Scanner scan = new Scanner(fr);
            while(scan.hasNextLine()){
                String lastName = scan.nextLine();
                String firstName = scan.nextLine();
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static boolean startsWithVowel(char[] lastName){
        char firstLetter = lastName[lastName.length - 1];
        if(firstLetter == 'a'|| firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' ||
        firstLetter == 'u'){
            return true;
        }else{
            return false;
        }
    }
}
