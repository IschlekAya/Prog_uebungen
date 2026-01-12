import java.math.BigInteger;
/**
 * Reads an Integer i from the console and calculates the Fibonacci-number after i Iterations{@literal .}
 * Prints the solution to the console{@literal .}
 */
public class FibonacciBigInteger {
    /**
     * Calculates the n-th Fibonacci-number using a for-loop
     * @param n Amount of iterations
     * @return Fibonacci-number after n iterations as Integer
     */
    public static BigInteger fibonacciIter(int n){
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(0);
        BigInteger c = BigInteger.valueOf(0);
        for (int i = 0; i < n; i++){
            c = a.add(b);
//            System.out.printf("%d + %d = %d\n", a, b, c);
            a = b;
            b = c;
//            System.out.printf("new a = %d, new b = %d\n", a, b);
        }
        return c;
    }

    /**
     * Calculates the n-th Fibonacci-number using a recursive function
     * @param n Amount of iterations
     * @return Fibonacci-number after n iterations as BigInteger
     */
    public static BigInteger fibonacciRec(int n){
        if (n > 0) return fibonacciRec(n, BigInteger.valueOf(1), BigInteger.valueOf(0));
        return BigInteger.valueOf(0);
    }

    /**
     * Coming from a fibonacci number, calculates the Fibonacci-number following after n-more iterations using a recursive function
     * @param n Amount of iterations to follow
     * @param a one part of the previous Fibonacci-number
     * @param b other part of the previous Fibonacci-number
     * @return Fibonacci-number after n more iterations as BigInteger
     */
    private static BigInteger fibonacciRec(int n, BigInteger a, BigInteger b){
        if (n == 1) return a.add(b);
        return  fibonacciRec((n-1), b, a.add(b));
    }

    public static void main(String[] args) {
        System.out.println("Iterative: " + fibonacciIter(Integer.parseInt(args[0])) +
                "\nRecursive: " + fibonacciRec(Integer.parseInt(args[0])));
    }
}
