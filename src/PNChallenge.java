import java.util.Scanner;
import java.util.Random;

public class PNChallenge {
    public static void main(String[] args) {
        Random r = new Random();
        int x = 1 + r.nextInt(250);
        System.out.println(x);

                int ok;
        boolean isPrime = true;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any number between 1 and 250");
        System.out.println("Enter the random number");
        int num = keyboard.nextInt();
        keyboard.close();
        for (int i = 2; i <= num / 2; i++) {
            ok = num % i;
            if (ok == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}




