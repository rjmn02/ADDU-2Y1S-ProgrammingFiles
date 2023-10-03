public class IntDLList {
    protected IntDLNode head, tail;

    IntDLList(){
        head = tail = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }


    //addtohead
    public void addtohead(int val){
        IntDLNode node = new IntDLNode(val);
        if(isEmpty()){
            head = tail = node;
        }else{
            head.prev = node;
            node.next = head;
            node.prev = null;
            head = node;
        }
    }

    //addtotail
    public void addToTail(int val){
        IntDLNode node = new IntDLNode(val);
        if(isEmpty()){
            head = tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            node.next = null;
            tail = node;
        }
    }
    //display
    public void display(){
        IntDLNode temp;
        for(temp = head; temp.next != null; temp = temp.next){
            System.out.print(temp.info + " ");
        }
    }
    
}

