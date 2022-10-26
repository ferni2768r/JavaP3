public class Apple extends Fruit implements SeedRemovable{
    public Apple(Integer weight, Integer sugar, Integer water, Color color) {
        super(weight, sugar, water, color);
    }

    @Override
    public boolean hasSeeds() { return hasSeeds; }

    @Override
    public void removeSeeds() { hasSeeds = false; }
}
