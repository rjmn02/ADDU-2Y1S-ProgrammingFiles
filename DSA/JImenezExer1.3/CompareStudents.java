import java.util.Comparator;

public class CompareStudents implements Comparator<Student>{

    @Override
    public int compare(Student a, Student b) {

        if(!(a.getCourse().equals(b.getCourse()))){
            return a.getCourse().compareTo(b.getCourse());
        }else if(!(a.getLastname().equals(b.getLastname()))){
            return a.getLastname().compareTo(b.getLastname());
        }else{
            return a.getFirstname().compareTo(b.getFirstname());
        }
        
    }

}
