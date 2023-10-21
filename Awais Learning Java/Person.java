import java.util.Scanner;

public class Person extends Main {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void readUserInput() {

        // initilising the scanner object
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a username");

        String userName = myScanner.nextLine();
        System.out.println("username is - " + userName);
        myScanner.close();
    }

}
