public class IntegerTest {
    public static void main(String[] args) {
        printIntValues();

        printMethods();
    }

    private static void printIntValues() {
        System.out.printf("Integer values:" +
                        "\nSize in Bytes = %d" +
                        "\nMax value = %d" +
                        "\nMin value = %d" +
                        "\nSize in Bits = %d" +
                        "\nClass = %s\n", Integer.BYTES, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.SIZE, Integer.TYPE);
    }
    private static void printRotateLeft(int i){
        int k = 4;
        System.out.printf("%d rotated to the left by %d bits: %d\n", i, k, Integer.rotateLeft(i, k));
    }
    private static void printBitCount(int i){
        System.out.printf("%d has a bit count of %d one-bits\n", i, Integer.bitCount(i));
    }
    private static void printTrailingZeros(int i){
        System.out.printf("%d has %d trailing zeros\n", i, Integer.numberOfTrailingZeros(i));
    }
    private static void printReverse(int i){
        System.out.printf("%d with its bitorder reversed: %d\n", i, Integer.reverse(i));
    }

    private static void printMethods() {
        printBitCount(100);
        printBitCount(-100);
        printRotateLeft(100);
        printRotateLeft(-100);
        printTrailingZeros(100);
        printReverse(100);
        printReverse(-100);
    }
}
