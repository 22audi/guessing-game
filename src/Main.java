import java.util.Random;

public class Main {



    public static void main(String[] args) {
       System.out.println("Hello player guess a number between 1 and 100'");

       Random randomNumberGenerator = new Random();
       int secretNumber = randomNumberGenerator.nextInt(100) + 1;
       System.out.println(secretNumber);
    }
}
