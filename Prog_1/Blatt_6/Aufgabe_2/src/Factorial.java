import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive whole number\n> ");
        int n = scanner.nextInt();
        BigInteger factorial = BigInteger.valueOf(n);

        for (int i = n-1; i > 1; i--){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The factorial of " + n +
                " is:\n" + factorial);
    }
}
