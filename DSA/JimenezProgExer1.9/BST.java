public class BST {

    protected Node root;

    public void insert(Software key) {
        Node node = new Node(key);
        this.root = insertRecursion(this.root, node);
    }

    private Node insertRecursion(Node root, Node node) {
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

    private Node searchRecursion(Node root, Software key) {
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

    public void delete(Software key){
        this.root = deleteByCopyingRecursion(this.root, key);
    }
    
    private Node deleteByCopyingRecursion(Node root, Software key){
        if(search(key)){
            if(root.data < key){
                root.right = deleteByCopyingRecursion(root.right, key);
            }else if(root.data > key){
                root.left = deleteByCopyingRecursion(root.left, key);
            }else {
                //case 1: node is a leaf
                if(root.left == null && root.right == null){
                    return null;
                }
                //case 2: node has one child
                else if(root.left != null){
                    return root.left;

                }else if(root.right != null){
                    return root.right;
                }
                //case 3: node has two children
                else{
                    Node temp = findMin(root.left);
                    root.data = temp.data;
                    root.right = deleteByCopyingRecursion(root.right, temp.data);
                    
                }
            
            }
            return root;
        }
        return null;
    }

    private Node findMin(Node node){
        while(node.right != null){
            node = node.right;
        }
        return node;
    }

    public void inorder() {
        inorderRecursion(this.root);
    }

    private void inorderRecursion(Node root) {
        if (root == null) {
            return;
        }

        inorderRecursion(root.left);
        System.out.print(root.data.toString());
        inorderRecursion(root.right);

    }
}