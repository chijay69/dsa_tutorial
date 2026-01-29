
class Node {
    int data;
    Node left;
    Node right;

    public Node(int d) {
        this.data = d;
    }
}

class BinarySearchTree {
    Node root;
    public BinarySearchTree(){
        root = null;
        System.out.println("BinarySearchTree instantiated.");
    }

    public void insert(int data) {
        root = insertRecursion(root, data);
    }

    public Node insertRecursion(Node root, int data){
        if (root == null) {
            root = new Node(data);
        }
        else if (data > root.data) {
            root.right = insertRecursion(root.right, data);
        } else if (data < root.data) {
            root.left = insertRecursion(root.left, data);
        }

        return root;
    }

    public void inorder(){
        inorderRecursion(root);
    }

    public void inorderRecursion(Node root){
        if (root != null) {
            inorderRecursion(root.left);
            System.out.print(root.data + " ");
            inorderRecursion(root.right);
        }
    }


    public void preorder(){
        preorderRecursion(root);
    }

    public void preorderRecursion(Node root){
        if (root != null) {
            System.out.print(root.data + " ");
            inorderRecursion(root.left);
            inorderRecursion(root.right);
        }
    }


    public void postorder(){
        postorderRecursion(root);
    }

    public void postorderRecursion(Node root){
        if (root != null) {
            inorderRecursion(root.right);
            System.out.print(root.data + " ");
            inorderRecursion(root.left);
        }
    }
}
