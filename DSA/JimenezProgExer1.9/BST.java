public class BST {

    protected Node root;

    public void insert(Software key) {
        Node node = new Node(key);
        this.root = insertRecursion(this.root, node);
    }

    private Node insertRecursion(Node root, Node node) {
        CompareSoftware comp = new CompareSoftware();

        if (root == null) {
            root = node;
            return root;
        } else if (comp.compare(root.data, node.data) < 0) {
            root.right = insertRecursion(root.right, node);
        } else {
            root.left = insertRecursion(root.left, node);
        }
        return root;
    }

    public boolean search(Software key) {
        return searchRecursion(this.root, key) != null;
    }

    private Node searchRecursion(Node root, Software key) {
        CompareSoftware comp = new CompareSoftware();


        if (root == null) {
            return null;
        } else if (root.data == key) {
            return root;
        } else if (comp.compare(root.data, key) > 0) {
            return searchRecursion(root.left, key);
        } else {
            return searchRecursion(root.right, key);
        }
    }

    public void delete(Software key){
        this.root = deleteByCopyingRecursion(this.root, key);
    }
    
    private Node deleteByCopyingRecursion(Node root, Software key){
        CompareSoftware comp = new CompareSoftware();


        if(search(key)){
            if(comp.compare(root.data, key) < 0){
                root.right = deleteByCopyingRecursion(root.right, key);
            }else if(comp.compare(root.data, key) > 0){
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
        System.out.print(root.data.toString() + "\n");
        inorderRecursion(root.right);

    }
}