public class SoftwareBST {
    
    private Node root;

    static CompareSoftware comp = new CompareSoftware();
    //insert
    public void insertSoftware(Software key){
        this.root = insertRec(this.root, new Node(key));
    }

    private Node insertRec(Node root, Node key){
        if(root == null){
            root = key;
            return root;
        } else if(comp.compare(root.data, key.data) == 0){
            //update quantity

        } else if(comp.compare(root.data, key.data) < 0){
            root = insertRec(root.right, key);
        } else {
            root = insertRec(root.left, key);
        }

        return root;
    }

    //search
    public boolean search(Software key){
        return searchRec(this.root, key) != null;
    }

    private Node searchRec(Node root, Software key){
        
        if(comp.compare(root.data, key) == 0){
            return root;
        } else if(comp.compare(root.data, key) < 0){
            searchRec(root.right, key);
        } else {
            searchRec(root.left, key);
        }
        return root;
    }

    //delete
    public void delete(Software key){
        if (!search(key))
            this.root = deleteByCopy(this.root, key);
    }
    
    private Node deleteByCopy(Node root, Software key) {
        if(comp.compare(root.data, key) == 0){
            //leaf
            if(root.left == null && root.right == null){
                //update quant
                return root;
            }
            //1 child
            else if(root.left == null || root.right == null){
                Node temp = root;
                root = (root.left != null) ? deleteByCopy(root.left, key) : deleteByCopy(root.right, key);

                return root;
            }
            //2 children
            else{
                Node temp = findMin(root.left);
                root.data = temp.data;
                root.left = deleteByCopy(temp, key);
            }


            return root;
        } else if(comp.compare(root.data, key) < 0){
            root = deleteByCopy(root.right, key);
        } else {
            root = deleteByCopy(root.left, key);
        }
        return root;
    }

    //findmin
    private Node findMin(Node p){
        while(p.right != null)
            p = p.right;

        return p;
    }

    //update quantity
    private void updateQuantity(Node root, Software key){
        if(comp.compare(root.data, key) == 0){
            if(root.data.getQuantity() >= key.getQuantity()){
                root.data.setQuantity(key.getQuantity());
                if(root.data.getQuantity() == 0){
                    delete(root.data);
                }
            }
        } else if(comp.compare(root.data, key) < 0){
            updateQuantity(root.right, key);
        } else {
            updateQuantity(root.left, key);
        }
    }

}