import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello player guess a number between 1 and 100'");
        Scanner input = new Scanner(System.in);

        Random randomNumberGenerator = new Random();
        int secretNumber = randomNumberGenerator.nextInt(100) + 1;
        int guessedNumber = 0;

        do {
            //System.out.println(secretNumber);
            guessedNumber=input.nextInt();

            if (guessedNumber>secretNumber){
                System.out.println("you guessed to high");
            }
            else if (guessedNumber<secretNumber){
                System.out.println("you guessed to low");
            }
            else{
                System.out.println("you guessed the same number!");
            }
        } while (guessedNumber!=secretNumber);


    }

}
