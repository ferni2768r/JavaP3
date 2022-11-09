import fruits.Fruit;
import fruits.Peelable;
import fruits.SeedRemovable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Application {
    InputDevice inputDevice;
    OutputDevice outputDevice;
    String arg;

    public Application(InputDevice inputDevice, OutputDevice outputDevice, String arg) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
        this.arg = arg;
    }

    public void askUserForFile() {
        while (true) {
            try {
                String fileName = this.inputDevice.getLine();
                FileInputStream file = new FileInputStream(fileName);
                StringBuilder sb = new StringBuilder();
                for (int c; (c = file.read()) != -1; ) {
                    sb.append((char) c);
                }
                outputDevice.writeMessage(sb.toString());
                break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void sortNumbers(int[] numbers){
        Arrays.sort(numbers);
    }

    private void randomArraySort(){
        int[] numbers = this.inputDevice.getNumbers(10);
        System.out.println(Arrays.toString(numbers));
        this.sortNumbers(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private int[] wordSizeHistogram(String sentence){
        int[] histogram = new int[7];
        // Initialize to size of 7, then split the sentence on spaces and iterate through each word.
        for(String word: sentence.split(" ")){

            // Checks if the length of the word is greater than the length of the histogram array.
            // This is needed because if we have a word of length 7 it will try to store it at histogram[7], which for
            // Our declaration, is out of bounds, so we copy the histogram in a new array with the length + 1
            if (word.length() >= histogram.length){
                histogram = Arrays.copyOf(histogram, histogram.length + 1);
            }
            histogram[word.length()] += 1;
        }

        return histogram;
    }

    private void exampleHistogram() {
        System.out.println(Arrays.toString(this.wordSizeHistogram(inputDevice.getLine())));
    }

    private void testFruitStuff() {
        Fruit[] fruits = inputDevice.readFruit();

        outputDevice.writeMessage(Fruit.computeSugarContent(fruits));
        outputDevice.writeMessage(Fruit.computeWeight(fruits));
        Fruit.prepareFruit(fruits);

        for (Fruit f: fruits){
            if(f instanceof Peelable){
                System.out.println(((Peelable) f).hasPeel());
            }
            if(f instanceof SeedRemovable){
                System.out.println(((SeedRemovable) f).hasSeeds());
            }
        }
    }

    public void run(){

        if (arg.equals("words")){
            this.exampleHistogram();
        } else if (arg.equals("numbers")){
            this.randomArraySort();
        }

        this.testFruitStuff();



    }
}