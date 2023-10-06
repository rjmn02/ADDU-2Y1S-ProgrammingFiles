import java.util.LinkedList;

public class LLStack {
    LinkedList<Object> LList = new LinkedList<>();

    public LLStack(){}

    public boolean isEmpty(){
        return LList.isEmpty();
    }

    public void push(Object val){
        LList.addFirst(val);
    }

    public Object pop(){
        if(!isEmpty()){
            LList.removeFirst();
            return LList.getFirst();
        }
        else{
            return null;
        }
    }

    public void clear(){
        LList.clear();
    }

    public String toString(){
        return LList.toString();
    }

    public Object topEl(){
        if(!isEmpty())
            return LList.getFirst();
        else
            return null;
    }
    
}
