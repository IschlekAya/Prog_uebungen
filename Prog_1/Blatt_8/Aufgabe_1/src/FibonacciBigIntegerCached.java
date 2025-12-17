import java.math.BigInteger;

/**
 * Reads an Integer i from the console and calculates the Fibonacci-number after i Iterations{@literal .}
 * Prints the solution to the console{@literal .}
 */
public class FibonacciBigIntegerCached {
    /**
     * Calculates the n-th Fibonacci-number using a for-loop
     * @param n Amount of iterations
     * @return Fibonacci-number after n iterations as Integer
     */
    public static BigInteger fibonacciIter(int n){
        long iterStartTime = System.nanoTime();

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

        long iterEndTime = System.nanoTime();
        double timeInMilliseconds = (iterEndTime-iterStartTime)/1000000.0;
        System.out.printf("fibonacciIter took %.3f milliseconds to complete\n", timeInMilliseconds);

        return c;
    }

    /**
     * Calculates the n-th Fibonacci-number using a recursive function
     * @param n Amount of iterations
     * @return Fibonacci-number after n iterations as BigInteger
     */
    public static BigInteger fibonacciRec(int n){
        if (n > 0){
            long recStartTime = System.nanoTime();

            BigInteger[] cache = new BigInteger[n];
            BigInteger solution =  fibonacciRec(cache, 0);

            long recEndTime = System.nanoTime();
            double timeInMilliseconds = (recEndTime-recStartTime)/1000000.0;
            System.out.printf("fibonacciRec took %.3f milliseconds to complete\n", timeInMilliseconds);

            return solution;
        }
        return BigInteger.valueOf(0);
    }

    /**
     * Coming from a Fibonacci-number-index, meaning k as in the k-th Fibonacci-number, calculates the Fibonacci-number that comes next{@literal .}
     * After calculating the Fibonacci-number, calls itself to calculate the next number{@literal .}
     * By calling itself, this process is repeated until the cache is full, where now the last entry of the cache is returned
     * @param cache Cache containing all already calculated Fibonacci-numbers, its capacity representing the searched n-th Fibonacci-number
     * @return Itself if the cache isn't full, else the last entry of the cache
     */
    private static BigInteger fibonacciRec(BigInteger[] cache, int currentCount){
        // default condition, already reached the n-th Fibonacci-number, return said number
        if (cache.length == currentCount){
            // for (BigInteger x : cache) System.out.println(x);
            return cache[currentCount-1];
        }
        // cache doesnt contain two previous Fibonacci-numbers -> but we know Fibonacci-number one and two are 1
        if (currentCount < 2) {cache[currentCount] = BigInteger.valueOf(1);}
        // Fibonacci-number n = Fibonacci-number n-2 + Fibonacci-number n-1
        else {cache[currentCount] = cache[currentCount -2 ].add(cache[currentCount -1]);}
        return fibonacciRec(cache, currentCount +1);
    }

    public static void main(String[] args) {
        int fibonacciSequenceIndex = (Integer.parseInt(args[0])); // 9715;
        System.out.println(fibonacciIter(fibonacciSequenceIndex));
        System.out.println(fibonacciRec(fibonacciSequenceIndex));
    }
}
