public class UseBST{
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(35);
        tree.insert(10);
        tree.insert(5);
        tree.insert(24);
        tree.insert(58);
        tree.insert(57);
        tree.insert(65);
        tree.insert(68);
        //35,10,5,24,58,57,65,68

        System.out.println(tree.search(0));
        System.out.println(tree.search(68));
        
    }
}