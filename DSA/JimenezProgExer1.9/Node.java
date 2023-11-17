public class Node {
    protected Software data;
    protected Node left, right;

    public Node(Software data){
        this(data, null, null);
    }

    public Node(Software data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

}

