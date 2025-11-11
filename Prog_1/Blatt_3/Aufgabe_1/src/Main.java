import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNum = sc.nextInt();
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimalNum = sc.next();

        int decimalDigitSum = Quersumme.getDigitSum(decimalNum);
        String hexDigitSum = Quersumme.getHexDigitSum(hexadecimalNum);
        System.out.println("Digit sum of the decimal number: "+ decimalDigitSum +
                "\nDigit sum of the hexadecimal number: " + hexDigitSum);
        sc.close();
    }
}
