public class IntDLNode {
    public int info;
    public IntDLNode next, prev;

    IntDLNode(int i){
        this(i, null, null);
    }

    IntDLNode(int i, IntDLNode n, IntDLNode p){
        this.info = i;
        this.next = n;
        this.prev = p;
    }
}
