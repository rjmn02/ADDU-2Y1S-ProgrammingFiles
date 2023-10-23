public class UseBST{
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(13);
        tree.insert(10);
        tree.insert(2);
        tree.insert(12);
        tree.insert(25);
        tree.insert(20);
        tree.insert(31);
        tree.insert(29);

        System.out.println(tree.search(2));
        System.out.println(tree.search(68));
        System.out.println(tree.search(20));

        System.out.println("Preorder: ");
        tree.preorder();
        System.out.println("\nInorder: ");
        tree.inorder();
        System.out.println("\nPostorder: ");
        tree.postorder();
        System.out.println("\nBreadth-First: ");
        tree.breadthFirst();
        
    }
}