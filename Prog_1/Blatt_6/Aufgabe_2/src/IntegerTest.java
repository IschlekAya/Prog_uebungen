public class IntegerTest {
    public static void main(String[] args) {
        printIntValues();
        printBitCount(100, -100);
        printRotateLeft(100, -100);
    }


    private static void printIntValues() {
        System.out.printf("Integer values:" +
                        "\nSize in Bytes = %d" +
                        "\nMax value = %d" +
                        "\nMin value = %d" +
                        "\nSize in Bits = %d" +
                        "\nClass = %s\n", Integer.BYTES, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.SIZE, Integer.TYPE);
    }
    private static void printRotateLeft(int i, int j){
        int k = 4;
        System.out.printf("%d rotated to the left by %d bits: %d\n", i, k, Integer.rotateLeft(i, k));
        System.out.printf("%d rotated to the left by %d bits: %d\n", j, k, Integer.rotateLeft(j, k));
    }
    private static void printBitCount(int i, int j){
        System.out.printf("%d has a bit count of %d one-bits\n", i, Integer.bitCount(i));
        System.out.printf("%d has a bit count of %d one-bits\n", j, Integer.bitCount(j));
    }
}
