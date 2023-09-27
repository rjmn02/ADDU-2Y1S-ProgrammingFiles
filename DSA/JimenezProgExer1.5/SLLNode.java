

public class SLLNode {
    public Student info;
    public SLLNode next;

    public SLLNode(Student info){
        this(info, null);
    } 

    public SLLNode(Student info, SLLNode next){
        this.info = info;
        this.next = next;
    }
}
