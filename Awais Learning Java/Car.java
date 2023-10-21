abstract class Cars {
    public String fname = "John";
    public int age = 24;

    public abstract void drives(); // abstract method
}

public class Car extends Main {

    int v;
    String mainName;

    public Car(int y, String name) {
        v = y;
        mainName = name;
    }

    public void fullThrottle() {
        System.out.println("The car is going at max speed");

    }

    public void speed(int maxSpeed) {
        System.out.println("The max speed is " + maxSpeed);
    }

    public void drives() {
        System.out.println("Volvo XC90 car");
    }

}
