import java.util.LinkedList;

public class LLStack {
    LinkedList<Object> list = new LinkedList<>();

    //is empty
    public boolean isEmpty(){
        return list.isEmpty();
    }  
    //push
    public void push(Object element){
        list.addFirst(element);
    }
    //pop
    public void pop(){
        if(!isEmpty()){
            list.removeFirst();
        }
    }

    public void clear(){
        list.clear();
    }

    public Object topEL(){
        return list.getFirst();
    }

    public String toString(){
        return list.toString();
    }
}
