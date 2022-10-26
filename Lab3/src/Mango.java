public class Mango extends Fruit implements Peelable, SeedRemovable {
    public Mango(Integer weight, Integer sugar, Integer water) {
        super(weight, sugar, water, Color.Yellow);
    }

    @Override
    public boolean hasPeel() { return !peeled; }

    @Override
    public void peelOff() { peeled = true; }
    public boolean hasSeeds() { return hasSeeds; }

    @Override
    public void removeSeeds() { hasSeeds = false; }
}
