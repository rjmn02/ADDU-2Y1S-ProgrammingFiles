
public class UseBST {
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

        System.out.println(tree.search(35));
        System.out.println(tree.search(0));
        tree.inorder();
    }
}
