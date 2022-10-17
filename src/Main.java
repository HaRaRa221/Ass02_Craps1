import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        boolean morePlay = true;
        String donePlay;


        do {
            int diceRoll1 = rnd.nextInt(6) + 1;
            int diceRoll2 = rnd.nextInt(6) + 1;
            int crapsRolls = diceRoll1 + diceRoll2;
            System.out.println("First roll of game: " + diceRoll1 + " + " + diceRoll2 + " = " + crapsRolls);

            if (crapsRolls == 2 || crapsRolls == 3 || crapsRolls == 12) {
                System.out.println("You crapped out. You lose!");
                System.out.println("Do you want to play again? [Y/N]");
                donePlay = in.nextLine();
                if (donePlay.equalsIgnoreCase("Y")) {
                    continue;
                } else if (donePlay.equalsIgnoreCase("N")) {
                    System.out.println("Enjoy your day. Come next time.");
                    System.exit(0);
                } else {
                    System.out.println("You got an input that is invalid.");
                    System.exit(0);
                }
                return;
            }
            if (crapsRolls == 7 || crapsRolls == 11) {
                System.out.println("You are naturally good. Victory is yours!");
                System.out.println("Do you want to play again? [Y/N]");
                donePlay = in.nextLine();
                if (donePlay.equalsIgnoreCase("Y")) {
                    continue;
                } else if (donePlay.equalsIgnoreCase("N")) {
                    System.out.println("Enjoy your day. Come next time.");
                    System.exit(0);
                } else {
                    System.out.println("You got an input that is invalid.");
                    System.exit(0);
                }
                return;
            }

            System.out.println("The goal for pointer is: " + crapsRolls + "\n");

            int secondCraps = 0;
            while (secondCraps != crapsRolls && secondCraps != 7)
            {
                diceRoll1 = rnd.nextInt(6) + 1;
                diceRoll2 = rnd.nextInt(6) + 1;
                secondCraps = diceRoll1 + diceRoll2;
                System.out.println("Second roll of game: " + diceRoll1 + " + " + diceRoll2 + " = " + secondCraps);
            }
            if (secondCraps == crapsRolls)
            {
                System.out.println("Victory is yours!");
            }
            else {
                System.out.println("You lost the game. Better luck next time.");
            }
            System.out.println("Do you want to play the game again? [Y/N]");
            donePlay=in.nextLine();
            System.out.println("\n");
            if (donePlay.equalsIgnoreCase("Y"))
            {
                continue;
            }
            else if (donePlay.equalsIgnoreCase("N"))
            {
                System.out.println("Thanks for your time. See you again.");
                System.out.println(0);
            }
            else {
                System.out.println("You got an invalid input of game. Game is exiting.");
                System.exit(0);
            }
        }
        while (morePlay);
    }
}