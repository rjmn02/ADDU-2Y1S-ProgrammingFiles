import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        readInput(students);

        students.sort(new CompareStudents());

        for (Student student : students) {
            student.display();
        }
    }

    static void readInput(ArrayList<Student> students){

        try {
            FileReader fr = new FileReader("student.txt");
            Scanner scan = new Scanner(fr);
            
            while(scan.hasNextLine()){
                String studentid = scan.nextLine();
                String lastname = scan.nextLine();
                String firstname = scan.nextLine();
                char gender = scan.nextLine().charAt(0);
                String course = scan.nextLine();
                int yearlevel = Integer.parseInt(scan.nextLine());

                students.add(new Student(lastname, firstname, studentid, course, gender, yearlevel));

            }
            scan.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
