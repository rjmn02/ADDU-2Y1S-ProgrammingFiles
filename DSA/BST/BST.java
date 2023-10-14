
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

    public void remove(int key){
        if(search(key)){
            this.root = removeHelper(this.root, key);
        }
    }
    private BSTNode removeHelper(BSTNode root, int key){
        if(root == null){
            return null;
        }else if(root.data < key){
            root.right = removeHelper(root.right, key);
        }else if (root.data > key){
            root.left = removeHelper(root.left, key);
        }else{
            if(root.left == null && root.right == null){
                root = null;
            }else if(){

            }
        }

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
}