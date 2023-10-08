import java.util.LinkedList;

public class StackLL{
    LinkedList<Object> list = new LinkedList<>();

    public void clear(){
        list.clear();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(Object el){
        list.addLast(el);
    }

    public Object pop(){
        if(!isEmpty()){
            return list.removeLast();
        }
        return null;
    }

    public Object topEl(){
        return list.getLast();
    }
}