import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        InputDevice inputDevice = new InputDevice(System.in);
        OutputDevice outputDevice = new OutputDevice(System.out);

        outputDevice.writeMessage(args);
        Application mainApp = new Application(inputDevice, outputDevice, args[0]);
        mainApp.run();
    }
}
