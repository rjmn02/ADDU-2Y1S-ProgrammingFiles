
import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        int courseComparison = student1.getCourse().compareTo(student2.getCourse());
        if (courseComparison != 0) {
            return courseComparison;
        }

        int lastNameComparison = student1.getLastname().compareTo(student2.getLastname());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        return student1.getFirstname().compareTo(student2.getFirstname());
    }
}



