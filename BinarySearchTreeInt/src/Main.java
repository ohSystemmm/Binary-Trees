import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        Random random = new Random();
        int[] data = new int[20];

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(1000);
            tree.Insert(new Node(data[i]));
        }

       tree.Display();
    }
}