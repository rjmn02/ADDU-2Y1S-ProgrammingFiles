
public class IntSLList {
    protected IntSLLNode head, tail;

    public IntSLList(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addToTail(int element){
        if(!isEmpty()){
            
            tail.next = new IntSLLNode(element);
            tail = tail.next;
            
        }else{
            tail = new IntSLLNode(element);
            head = tail;
        }
    }

    public void addToHead(int element){
        head = new IntSLLNode(element, head);
        if(tail == null){
            tail = head;
        }
        
    }

    public int deleteFromHead(){
        int element = head.info;
        if(head == tail){
            head = tail = null;
        }else {
            head = head.next;
        }

        return element;
    }

    public int deleteFromTail(){
        int element = tail.info;
        if(head == tail){
            head = tail = null;
        }else {
            IntSLLNode temp;
            for(temp = head; temp != tail; temp = temp.next);
            tail = temp;
            tail.next = null;
        }
        return element;
    }

    public void printAll(){

        for(IntSLLNode temp = head; temp != null; temp = temp.next){
            System.out.println(temp.info + " ");
        }
    }
}
