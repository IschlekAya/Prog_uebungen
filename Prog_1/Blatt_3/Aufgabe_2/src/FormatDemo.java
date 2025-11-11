import java.util.Scanner;

public class FormatDemo{
    public static void main(String[] args){
        int[] intFormat = {100, 1023, 0xFFF1234, -3};
        double[] doubleFormat = {2.5, 3.141592653, 1e12, -0.0001234};
        for (int x : intFormat) intFormatDemo(x);
        for (double x : doubleFormat) doubleFormatDemo(x);
    }

    static void intFormatDemo(int x){
        System.out.println("Integer " + x + ":");
        System.out.format("%+d\n", x);
        System.out.printf("0x%08x\n", x);
        String binary = String.format("%32s", Integer.toBinaryString(x)).replace(" ", "0");
        System.out.printf("0b%s\n", binary);
        System.out.printf("[%-10d]\n",x);
        System.out.printf("[%10d]\n", x);

        System.out.println();

    }

    static void doubleFormatDemo(double d){
        System.out.printf("Double %f: \n", d);
        System.out.printf("%25.2f\n", d);
        System.out.printf("%25E\n", d);
        String hex = String.format("%25A", d).replace("X", "x");
        System.out.println(hex);
    }
}
