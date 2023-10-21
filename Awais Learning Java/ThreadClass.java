public class ThreadClass extends Main implements Runnable {

    public static int amount = 0;

    public void run() {
        System.out.println("This code is running in a thread");
        amount++;
    }

}
