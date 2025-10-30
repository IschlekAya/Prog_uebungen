import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give me an interger you fleshbag!");
        int i = input.nextInt();
        System.out.println("Zhe quersumme is "+Quersumme.quersumme(i));
        System.out.println("and Zhis is zhe recursive quersumme "+Quersumme.recQuersumme(i) );
    }
}