public class BinarySearchTree {

    Node root;

    public void Insert(Node node) {

        root = InsertHelper(root, node);
    }

    private Node InsertHelper(Node root, Node node) {

        double data = node.data;

        if (root == null) {
            root = node;
            return root;
        }
        else if (data < root.data) {
            root.left = InsertHelper(root.left, node);
        }
        else if (data > root.data) {
            root.right = InsertHelper(root.right, node);
        }

        return root;
    }

    public void Display() {
        DisplayHelper(root);
    }

    private void DisplayHelper(Node root) {

        if (root != null) {
            DisplayHelper(root.left);
            System.out.println(root.data);
            DisplayHelper(root.right);
        }
    }
}
