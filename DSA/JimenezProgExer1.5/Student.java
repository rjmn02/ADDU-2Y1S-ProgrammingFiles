
public class Student {
    private String lastName;
    private String firstName;

    public Student(String ln, String fn){
        this.lastName = ln;
        this.firstName = fn;
    }
    
    public String toString(){
        return String.format("%s, %s", this.lastName, this.firstName);
    }
}
