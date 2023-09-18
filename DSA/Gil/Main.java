import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        try {
        Scanner in = new Scanner (new FileReader("student.txt"));
            while(in.hasNextLine()){
                String id = in.nextLine();
                String lastName = in.nextLine();
                String firstName = in.nextLine();
                char gender = in.nextLine().charAt(0);
                String course = in.nextLine();
                int yearLevel = Integer.parseInt(in.nextLine());
                
                students.add(new Student(lastName, firstName, id, course, gender, yearLevel));
            }                   
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Collections.sort(students, new StudentComparator());
        for (Student student : students)
            student.display();


       
    }
        
}




