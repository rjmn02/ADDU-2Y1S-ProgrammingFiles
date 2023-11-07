import java.util.*;
public class BST {

    protected BSTNode root;

    public void insert(int key) {
        BSTNode node = new BSTNode(key);
        this.root = insertRecursion(this.root, node);
    }

    private BSTNode insertRecursion(BSTNode root, BSTNode node) {
        if (root == null) {
            root = node;
            return root;
        } else if (root.data < node.data) {
            root.right = insertRecursion(root.right, node);
        } else {
            root.left = insertRecursion(root.left, node);
        }
        return root;
    }

    public boolean search(int key) {
        return searchRecursion(this.root, key) != null;
    }

    private BSTNode searchRecursion(BSTNode root, int key) {
        if (root == null) {
            return null;
        } else if (root.data == key) {
            return root;
        } else if (root.data > key) {
            return searchRecursion(root.left, key);
        } else {
            return searchRecursion(root.right, key);
        }
    }

    public void delete(int key){
        this.root = deleteRecursion(this.root, key);
    }
    
    private BSTNode deleteRecursion(BSTNode root, int key){
        if(search(key)){
            if(root.data < key){
                root.right = deleteRecursion(root.right, key);
            }else if(root.data > key){
                root.left = deleteRecursion(root.left, key);
            }else {
                //case 1: leaf
                if(root.left == null && root.right == null){
                    return null;
                }
                //case 2: one child
                else if(root.left != null){
                    return root.left;

                }else if(root.right != null){
                    return root.right;
                }
                //case 3: two children
                else{
                    BSTNode temp = findMin(root.left);
                    root.data = temp.data;
                    root.right = deleteRecursion(root.right, temp.data);
                    
                }
            
            }
            return root;
        }
        return null;
    }

    private BSTNode findMin(BSTNode node){
        while(node.right != null){
            node = node.right;
        }
        return node;
    }

    // breadth first traversal (print by level)
    public void breadthFirst() {
        BSTNode p = root;
        Queue<Object> queue = new LinkedList<>();
        if (p != null) {
            queue.add(p);
            while (!queue.isEmpty()) {
                p = (BSTNode) queue.remove();
                System.out.print(p.data + " ");;
                if (p.left != null)
                    queue.add(p.left);
                if (p.right != null)
                    queue.add(p.right);
            }
    }
}

    // depth first traversals
    public void inorder() {
        inorderRecursion(this.root);
    }

    private void inorderRecursion(BSTNode root) {
        if (root == null) {
            return;
        }

        inorderRecursion(root.left);
        System.out.print(root.data + " ");
        inorderRecursion(root.right);

    }

    public void preorder() {
        preorderRecursion(this.root);
    }

    private void preorderRecursion(BSTNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorderRecursion(root.left);
        preorderRecursion(root.right);

    }

    public void postorder() {
        postorderRecursion(this.root);
    }

    private void postorderRecursion(BSTNode root) {
        if (root == null) {
            return;
        }

        postorderRecursion(root.left);
        postorderRecursion(root.right);
        System.out.print(root.data + " ");

    }

}