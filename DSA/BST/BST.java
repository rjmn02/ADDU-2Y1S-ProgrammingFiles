import java.util.*;
public class BST {

    protected BSTNode root;
    protected int count;

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

    // public boolean search(int key) {
    //     return searchRecursion(this.root, key) != null;
    // }

    // private BSTNode searchRecursion(BSTNode root, int key) {
    //     if (root == null) {
    //         return null;
    //     } else if (root.data == key) {
    //         return root;
    //     } else if (root.data > key) {
    //         return searchRecursion(root.left, key);
    //     } else {
    //         return searchRecursion(root.right, key);
    //     }
    // }
    public boolean search(int key){
        return searchHelper(this.root, key) != null;
    }


    public BSTNode searchHelper(BSTNode p, int key) {
        while (p != null) {
            count++;
            if (key == p.data)
                return p;
            else if (key < p.data)
                p = p.left;
            else
                p = p.right;
        }
        return null;
    }
    

    public void deleteByMerging(int el) {
        BSTNode tmp, node, p = root, prev = null;
        while (p != null && p.data != el) { // find the node p
            prev = p; // with element el;
            if (p.data < el)
                p = p.right;
            else
                p = p.left;
        }
        node = p;
        if (p != null && p.data == el) {
            if (node.right == null) // node has no right child: its left
                node = node.left; // child (if any) is attached to its
            // parent;
            else if (node.left == null) // node has no left child: its right
                node = node.right; // child is attached to its parent;
            else { // be ready for merging subtrees;
                tmp = node.left; // 1. move left
                while (tmp.right != null) // 2. and then right as far as
                    tmp = tmp.right; // possible;
                tmp.right = // 3. establish the link between
                        node.right; // the rightmost node of the left
                // subtree and the right subtree;
                node = node.left; // 4.
            }
            if (p == root)
                root = node;
            else if (prev.left == p)
                prev.left = node;
            else
                prev.right = node; // 5.
        } else if (root != null)
            System.out.println("key " + el + " is not in the tree");
        else
            System.out.println("the tree is empty");
    }
    
    public void deleteByCopying(int el) {
        BSTNode node, p = root, prev = null;
        while (p != null && p.data != el) { // find the node p
            prev = p; // with element el;
            if (p.data < el)
                p = p.right;
            else
                p = p.left;
        }
        node = p;
        if (p != null && p.data == el) {
            if (node.right == null) // node has no right child;
                node = node.left;
            else if (node.left == null) // no left child for node;
                node = node.right;
            else {
                BSTNode tmp = node.left; // node has both children;
                BSTNode previous = node; // 1.
                while (tmp.right != null) { // 2. find the rightmost
                    previous = tmp; // position in the
                    tmp = tmp.right; // left subtree of node;
                }
                node.data = tmp.data; // 3. overwrite the reference
                // of the key being deleted;
                if (previous == node) // if node's left child's
                    previous.left = tmp.left; // right subtree is null;
                else
                    previous.right = tmp.left; // 4.
            }
            if (p == root)
                root = node;
            else if (prev.left == p)
                prev.left = node;
            else
                prev.right = node;
        } else if (root != null)
            System.out.println("key " + el + " is not in the tree");
        else
            System.out.println("the tree is empty");
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