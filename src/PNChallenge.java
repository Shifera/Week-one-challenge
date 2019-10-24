import java.util.Scanner;

public class PNChallenge {
    public static void main (String[]args) {
        int ok;
        boolean isPrime=true;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = keyboard.nextInt();
        keyboard.close();
        for(int i=2;i<=num/2;i++) {
            ok=num%i;
            if(ok==0) {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + "is a prime number");
        else
            System.out.println(num + "is not a prime number");
    }
}
