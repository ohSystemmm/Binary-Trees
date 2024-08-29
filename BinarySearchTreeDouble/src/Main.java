import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree Tree1 = new BinarySearchTree();
        Random Rand = new Random();
        double[] Data = new double[20];

        for (int i = 0; i < Data.length; i++) {
            double TempValue = Rand.nextDouble() * 10000;
            BigDecimal Round = new BigDecimal(TempValue).setScale(3, RoundingMode.HALF_UP);
            Data[i] = Round.doubleValue();
            Tree1.Insert(new Node(Data[i]));
        }
       Tree1.Display();
    }
}
