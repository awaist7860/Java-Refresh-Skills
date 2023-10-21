import java.util.Scanner;

public class addingNumbers {

    public void adding() {
        int x = 5;
        int y = 6;
        int total = x + y;

        System.out.println("Answer is " + total);
    }

    public void userAdding() {
        int x, y, total;

        Scanner readLine = new Scanner(System.in);
        System.out.println("Enter first number");

        x = readLine.nextInt();

        System.out.println("Enter second number number");

        y = readLine.nextInt();

        total = x + y;

        System.out.println("Total is - " + total);

        readLine.close();
    }

}
