public class BinarySearchTree {
    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }
    private Node insertHelper(Node root, Node node) {
        int data = node.data;

        if (root == null) {
            root = node;
            return root;
        }
        else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        }
        else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }
    private void displayHelper(Node root) {
        if (root == null) {
            return;
        }
        displayHelper(root.left);
        System.out.println(root.data);
        displayHelper(root.right);
    }
}
