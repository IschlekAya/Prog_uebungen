/**
 * Reads an Integer i from the console and calculates the Fibonacci-number after i Iterations{@literal .}
 * Prints the solution to the console{@literal .}
 * Note: Only accurate up to and including the 46th Fibonacci-number
 */
public class Fibonacci {
    /**
     * Calculates the n-th Fibonacci-number using a for-loop
     * @param n Amount of iterations
     * @return Fibonacci-number after n iterations
     */
    public static int fibonacciIter(int n){
        int a = 1;
        int b = 0;
        int c = 0;
        for (int i = 0; i < n; i++){
            c = a+b;
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
     * @return Fibonacci-number after n iterations
     */
    public static int fibonacciRec(int n){
        if (n > 0) return fibonacciRec(n, 1, 0);
        return 0;
    }

    /**
     * Coming from a fibonacci number, calculates the Fibonacci-number following after n-more iterations using a recursive function
     * @param n Amount of iterations to follow
     * @param a one part of the previous Fibonacci-number
     * @param b other part of the previous Fibonacci-number
     * @return Fibonacci-number after n more iterations
     */
    private static int fibonacciRec(int n, int a, int b){
        if (n == 1) return a+b;
        return  fibonacciRec((n-1), b, a+b);
    }

    public static void main(String[] args) {
        System.out.println("Iterative: " + fibonacciIter(Integer.parseInt(args[0])) +
                "\nRecursive: " + fibonacciRec(Integer.parseInt(args[0])));
    }
}
