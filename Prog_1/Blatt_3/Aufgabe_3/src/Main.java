import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Hello and Heron10!\n");
        double a =input.nextDouble();
        heron10(a);
        System.out.printf("Hello and HeronFixpoint!\n");
        heronfixpoint(a);

        }
        public static double heron10(double a)
        {
            double x=a;
            for(int i =0;i<10;i++)
            {
                x=0.5*(x+(a/x));
                System.out.println("x"+i+" = "+ x);
            }
            return a;
        }
        public static double heronfixpoint(double a) // kann nicht endlos laufen wegen floating point ungenauichkeit
    {
        double x=a;
        int i =0;

        while(x!=0.5*(x+(a/x)))
        {
            x=0.5*(x+(a/x));
            System.out.println("x"+i+" = "+ x);
            i++;
        }
        return a;
    }
    }
