import java.util.*;// imports the scanner and random functions (may be a waste of memory)

public class Computer extends User {
    public void computerGuess() {
        int compScore = 0;// increases each time the computer wins a game
        int userScore = 0; // increases each time the user wins a game
        int guesses = 0; // this increases each time the user guesses wrong
        int counter = 0;// this will increase when  either the computer or user has won
        Random rand = new Random();//this is used to generate random numbers
        Scanner input = new Scanner(System.in);
        int compNumber; // used to store the computers number
        compNumber = rand.nextInt(5) ;// used to assign a random number to the computers number
        System.out.println("Computer has chosen its number");
        while (counter == 0) {
            System.out.println("Choose your number: ");
            int userChoice = input.nextInt();
            if (userChoice == compNumber) {
                System.out.println("You have selected the number: " + userChoice);
                System.out.println("Well done you guessed the number!");
                userScore++; //increases users score
                System.out.println(name + " has got: " + userScore + " point(s)"); /*prints out the users name plus
                 how many points they've got*/
                if (userScore == 1) {
                    counter++;
                    System.out.println( "\n"+name+" beat the computer!!");
                }
            } else if (userChoice > compNumber) {
                System.out.println("Sorry kiddo that number is too high");
                compScore++;
                System.out.println("Computer has got: " + compScore + " point(s)");
                guesses++;
                if (guesses == 3) {
                    System.out.println("The number was: " + compNumber);
                    counter++;
                    System.out.println("The computer wins!!");
                }

            } else if (userChoice < compNumber) {
                System.out.println("Sorry kiddo that number is too low");
                compScore++;
                System.out.println("Computer has got: " + compScore + " point(s)");
                guesses++;
                if (guesses == 3) {
                    System.out.println("The number was: " + compNumber);
                    counter++;
                    System.out.println("The computer wins!!");
                }
            }
        }
    }
}
