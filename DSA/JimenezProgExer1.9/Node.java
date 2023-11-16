public class Node {
    protected Software data;
    protected Node left;
    protected Node right;

    public Node(Software data) {
        this(data, null, null);
    }

    public Node(Software data, Node l, Node r) {
        this.data = data;
        this.left = l;
        this.right = r;
    }

}

