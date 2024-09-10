//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(new Node(16));
        binarySearchTree.insert(new Node(23));
        binarySearchTree.insert(new Node(56));
        binarySearchTree.insert(new Node(34));
        binarySearchTree.insert(new Node(55));
        binarySearchTree.display();
    }
}