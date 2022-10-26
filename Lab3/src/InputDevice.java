import java.util.ArrayList;

public class InputDevice {
    ArrayList<Fruit> fruits = new ArrayList<>();

    private ArrayList<Fruit> createArray() {
        return fruits;
    }

    public ArrayList<Fruit> readFruits(Fruit f) {
        return createArray();
    }

}
