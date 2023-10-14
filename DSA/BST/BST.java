
public class BST {

    protected BSTNode root;

    public void insert(int key){
        BSTNode node = new BSTNode(key);
        this.root = insertHelper(this.root, node);
    }
    private BSTNode insertHelper(BSTNode root, BSTNode node){
        if(root == null){
            root = node;
            return root;
        }else if(root.data < node.data){
            root.right = insertHelper(root.right, node);
        }else {
            root.left =  insertHelper(root.left, node);
        }  
        return root;
    }

    public boolean search(int key){
        return searchHelper(this.root, key) != null;
    }

    private BSTNode searchHelper(BSTNode root, int key){
        if(root == null){
            return null;
        }else if(root.data == key){
            return root;
        }else if(root.data > key){
            return searchHelper(root.left, key);
        }else {
            return searchHelper(root.right, key);
        }
    }

    //traversals
    public void inorder(){
        inorderHelper(this.root);
    }
    private void inorderHelper(BSTNode root) {
        if (root != null) {
            inorderHelper(root.left);
            System.out.print(root.data + " ");
            inorderHelper(root.right);
        }
    }

    public void preorder(){
        preorderHelper(this.root);
    }
    private void preorderHelper(BSTNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderHelper(root.left);
            preorderHelper(root.right);
        }
    }

    public void postorder(){
        postorderHelper(this.root);
    }
    private void postorderHelper(BSTNode root) {
        if (root != null) {
            postorderHelper(root.left);
            postorderHelper(root.right);
            System.out.print(root.data + " ");
        }
    }

}