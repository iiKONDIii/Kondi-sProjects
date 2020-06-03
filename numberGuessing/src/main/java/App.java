import java.util.*;

public class App {
    public static void main(String[] args) {
        boolean continueGame = true;// function allows the user to keep playing the game
        Scanner input = new Scanner(System.in);// allows the input for Y or N to continue game
        Computer newGame = new Computer(); // loads in the game
        newGame.computerGuess();// starts the game
        while (continueGame) {
            //this is where the user chooses between starting the game again or not
            System.out.println("Do you want to play again:\nPress Y for yes\nPress N for no");
            String choice = input.nextLine();
            if (choice.equals("Y") || choice.equals("y")) {
                //allows the user to use upper case or lower case
                newGame.computerGuess();
            }
            if (choice.equals("N") || choice.equals("n")) {
                continueGame = false;// when equals false the boolean statement
                System.out.println("See you space cowboy");
            }
        }
    }
}




