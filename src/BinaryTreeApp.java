public class BinaryTreeApp {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(7);
        bst.insert(12);
        bst.insert(15);
        bst.insert(2);
        bst.insert(5);

//        bst.inorder();
//        bst.preorder();
        bst.postorder();
    }
}
