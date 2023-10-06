import java.util.LinkedList;

public class LLStack {
    LinkedList<Object> LList = new LinkedList<>();

    public LLStack(){}

    public boolean isEmpty(){
        return LList.isEmpty();
    }

    public void push(Object val){
        LList.addLast(val);
    }

    public Object pop(){
        if(!isEmpty()){
            LList.removeLast();
            return LList.getLast();
        }
        else{
            return null;
        }
    }

    public void clear(){
        LList.clear();
    }

    public Object topEl(){
        if(!isEmpty())
            return LList.getFirst();
        else
            return null;
    }
    
    public void displayStack(){
        for (int i = 0; i < LList.size(); i++) {
            System.out.print(pop());
        }
    }
}
