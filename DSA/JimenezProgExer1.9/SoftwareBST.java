public class SoftwareBST {
    
    private Node root;

    private static CompareSoftware comp = new CompareSoftware();
    
    //addSoftware
    public void addSoftware(Software key){

        //search if key exist
        //if it does update the quantity
        //if it doesnt insert key to tree

        Node node = search(this.root, key);
        
        if(node != null){
            int newQuantity = node.data.getQuantity() + key.getQuantity();
        
            if(newQuantity > 0){
                node.data.setQuantity(newQuantity);
            }else{
                this.root = deleteNode(this.root, node.data);
            }

        } else{
            this.root = insertNode(this.root, key);
        }
    }
    //sellSoftware
    public void sellSoftware(Software key){

        //search if key exist
        //if it does update the quantity
        //else do nothing

        Node node = search(this.root, key);
        if(node != null){
            int newQuantity = node.data.getQuantity() - key.getQuantity();
        
            if(newQuantity > 0){
                node.data.setQuantity(newQuantity);
            }else{
                this.root = deleteNode(this.root, node.data);
            }
        }
    }

    //insertNode
    public void insertData(Software key){
        this.root = insertNode(this.root, key);
    }
    
    private Node insertNode(Node root, Software key){

        if(root == null){
            Node nodeKey = new Node(key);
            root = nodeKey;
            return root;
        }else if(comp.compare(root.data, key) < 0){
            root.right = insertNode(root.right, key);
        } else {
            root.left = insertNode(root.left, key);
        }

        return root;
    }
    //deleteNode
    private Node deleteNode(Node root, Software key){
        
        if(root == null){
            return null;
        }else if(comp.compare(root.data, key) == 0){
            //leaf
            if(root.left == null && root.right == null){
                root = null;
            }
            //1 children
            else if(root.left == null || root.right == null){
                root = (root.left != null) ? deleteNode(root.left, key) : deleteNode(root.right, key);
            }
            //2 children
            else {
                //find min in right subtree
                Node temp = findMin(root.right);
                root.data = temp.data;
                root.right = deleteNode(root.right, key);
            }
        }else if(comp.compare(root.data, key) < 0){
            root.right = deleteNode(root.right, key);
        }else{
            root.left = deleteNode(root.left, key);
        }
        return root;
    }

    private Node findMin(Node p){
        while(p.left != null){
            p = p.left;
        }
        return p;
    }

    //search
    private Node search(Node root, Software key){
        if(root == null){
            return null;
        }else if (comp.compare(root.data, key) == 0){
            return root;
        }else if(comp.compare(root.data, key) < 0){
            return search(root.right, key);
        } else {
            return search(root.left, key);
        }
    }


    public void showTree(){
        inorder(this.root);
    }

    private void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.data.toString());
            inorder(root.right);
        }
    }

}