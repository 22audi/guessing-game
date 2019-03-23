import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void game() {
        Scanner input = new Scanner(System.in);
        Random randomNumberGenerator = new Random();
        int secretNumber = randomNumberGenerator.nextInt(100) + 1;
        int guessedNumber = 0;
        int counter = 0;
        int turn = counter;
        do {
            guessedNumber=input.nextInt();
            if (guessedNumber>secretNumber){
                System.out.println("you guessed to high");


            }
            else if (guessedNumber<secretNumber){
                System.out.println("you guessed to low");


            }
            else{
                System.out.println("you guessed the same number!");
                System.out.println("You guessed it in " + counter + " tries!");
            }
            counter+=1;
            System.out.println("you are on turn " + counter);
        } while (guessedNumber!=secretNumber && counter<7);
        if (counter>=7) {
            System.out.println("you ran out of turns good luck next time");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello player guess a number between 1 and 100'");

        Scanner input = new Scanner(System.in);
        String playAgain;

        do {
            game();
            System.out.println("do you want to play again?");
            playAgain = input.nextLine();
        } while("no" != playAgain);

    }
}