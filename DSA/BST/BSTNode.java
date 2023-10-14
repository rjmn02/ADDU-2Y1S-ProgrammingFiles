public class BSTNode {
    protected int data;
    protected BSTNode left;
    protected BSTNode right;

    public BSTNode(int data){
        this(data, null, null);
    }

    public BSTNode(int data, BSTNode l, BSTNode r){
        this.left = l;
        this.right = r;
        this.data = data;
    }
}
