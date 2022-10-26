public class Banana extends Fruit implements Peelable {
    public Banana(Integer weight, Integer sugar, Integer water) {
        super(weight, sugar, water, Color.Yellow);
    }

    @Override
    public boolean hasPeel() { return !peeled; }

    @Override
    public void peelOff() { peeled = true; }
}
