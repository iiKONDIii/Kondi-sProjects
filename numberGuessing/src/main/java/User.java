import java.util.Scanner;

public class User {
    Scanner input = new Scanner(System.in);
    public String name; // by making this public it can be accessed in the computer class

    public User() {
        System.out.println("Hello what is your name: ");
        name = input.nextLine();
        System.out.println("Hello " + name + ", welcome to the guessing game. The range is 1 to 5" +
                "\nYou have three guesses make them count!!");
    }
}
