//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BinarySearchTree Tree1 = new BinarySearchTree();

        Tree1.Insert(new Node(7));
        Tree1.Insert(new Node(4));
        Tree1.Insert(new Node(6));
        Tree1.Insert(new Node(8));
        Tree1.Insert(new Node(1));
        Tree1.Insert(new Node(5));
        Tree1.Insert(new Node(2));
        Tree1.Insert(new Node(9));
        Tree1.Insert(new Node(3));

        //Tree1.Remove(1);
        //System.out.println(Tree1.Search(1));
        Tree1.Display();
    }
}