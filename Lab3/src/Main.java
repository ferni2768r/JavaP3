
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public int computeWeight(ArrayList<Fruit> fruits) {
        int weigh = 0;
        for (Fruit fruit : fruits) { weigh += fruit.weight; }
        return weigh;
    }

    public int computeSugarContent(ArrayList<Fruit> fruits) {
        int sugar = 0;
        for (Fruit fruit : fruits) { sugar += fruit.sugar; }
        return sugar;
    }

    public void prepareFruit(ArrayList<Fruit> fruits) {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Peelable) {
                ((Peelable) fruit).peelOff();
            }

            if (fruit instanceof SeedRemovable) {
                ((SeedRemovable) fruit).removeSeeds();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}