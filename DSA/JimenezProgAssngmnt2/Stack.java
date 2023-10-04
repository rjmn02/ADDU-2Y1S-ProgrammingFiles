import java.util.LinkedList;

public class Stack {
    LinkedList<Object> list = new LinkedList<>();

    //is empty
    public boolean isEmpty(){
        return list.isEmpty();
    }  
    //push
    public void push(Object element){
        list.addLast(element);
    }
    //pop
    public void pop(){
        if(!isEmpty()){
            list.removeLast();
        }
    }

    public void clear(){
        list.clear();
    }

    public Object topEL(){
        return list.getLast();
    }

    public String toString(){
        return list.toString();
    }
}
