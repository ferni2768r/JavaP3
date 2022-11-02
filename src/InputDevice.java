import fruits.Apple;
import fruits.Banana;
import fruits.Fruit;
import fruits.Mango;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class InputDevice {

    public String getType(){
        return "random";
    }

    public int[] getNumbers(int n){
        int[] numbers = new int[n];
        for(int idx = 0; idx < n;idx++){
            numbers[idx] = this.nextInt();
        }

        return numbers;
    }

    public String getLine() {
        return "The quick brown fox jumps over the lazy dog";
    }

    public int nextInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public ArrayList<Fruit> readFruit() {
        return new ArrayList<>(
                Arrays.asList(new Banana(15, 3, 25), new Banana(25, 19, 21),
                        new Apple(11, 4, 8, Fruit.Color.RED), new Mango(20, 4, 4, Fruit.Color.GREEN)));
    }
}
