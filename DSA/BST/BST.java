
public class BST {

    protected BSTNode root;

    public void insert(int key){
        BSTNode node = new BSTNode(key);
        this.root = insertRecursion(this.root, node);
    }
    private BSTNode insertRecursion(BSTNode root, BSTNode node){
        if(root == null){
            root = node;
            return root;
        }else if(root.data < node.data){
            root.right = insertRecursion(root.right, node);
        }else {
            root.left =  insertRecursion(root.left, node);
        }  
        return root;
    }

    public boolean search(int key){
        return searchRecursion(this.root, key) != null;
    }

    private BSTNode searchRecursion(BSTNode root, int key){
        if(root == null){
            return null;
        }else if(root.data == key){
            return root;
        }else if(root.data > key){
            return searchRecursion(root.left, key);
        }else {
            return searchRecursion(root.right, key);
        }
    }

    public void remove(int key){
        if(search(key)){
            removeRecursion(this.root, key);
        }
    }

    public void removeRecursion(BSTNode root, int key){
        if(root.data < key){
            removeRecursion(root.right, key);
        }else if(root.data > key){
            removeRecursion(root.left, key);
        }else {
            if(root.right == null && root.left == null){
                root = null;
            }else if(root.right == null){
                //find predecessor
            }
        }
    }

    //traversals
    public void inorder(){
        inorderRecursion(this.root);
    }
    private void inorderRecursion(BSTNode root) {
        if (root != null) {
            inorderRecursion(root.left);
            System.out.print(root.data + " ");
            inorderRecursion(root.right);
        }
    }

    public void preorder(){
        preorderRecursion(this.root);
    }
    private void preorderRecursion(BSTNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRecursion(root.left);
            preorderRecursion(root.right);
        }
    }

    public void postorder(){
        postorderRecursion(this.root);
    }
    private void postorderRecursion(BSTNode root) {
        if (root != null) {
            postorderRecursion(root.left);
            postorderRecursion(root.right);
            System.out.print(root.data + " ");
        }
    }

}