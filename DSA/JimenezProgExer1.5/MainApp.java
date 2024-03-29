import java.util.*;
import java.io.*;
public class MainApp {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        readFile(list);
        display(list);
    }

    static void readFile(LinkedList<Student> list){
        try {
            FileReader fr = new FileReader("students.txt");
            Scanner scan = new Scanner(fr);
            while(scan.hasNextLine()){
                String lastName = scan.nextLine();
                String firstName = scan.nextLine();
                
                if(startsWithVowel(lastName.toCharArray())){
                    list.addFirst(new Student(lastName, firstName));
                }else{
                    list.addLast(new Student(lastName, firstName));
                }
                
            }
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static boolean startsWithVowel(char[] lastName){
        
        String firstLetter = String.valueOf(lastName[0]);
        String str = "aeiouAEIOU";
        if(str.indexOf(firstLetter) != -1){
            return true;
        }else{
            return false;
        }
    
    }

    static void display(LinkedList<Student> list){
        for (Student student : list) {
            System.out.println(student.toString());
        }

    }
}
