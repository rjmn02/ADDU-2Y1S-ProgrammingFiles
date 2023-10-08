import java.util.LinkedList;

public class LLQueue {
    LinkedList<Object> LList = new LinkedList<>();

    public void clear(){
        LList.clear();
    }

    public boolean isEmpty(){
        return LList.isEmpty();
    }

    public Object enqueue(Object el){
        LList.addLast(el);
        return el;
    }

    public Object dequeue(){
        return LList.removeFirst();
    }

    public Object firstEl(){
        return LList.getFirst();
    }
}
