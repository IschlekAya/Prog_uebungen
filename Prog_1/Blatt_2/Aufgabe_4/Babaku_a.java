import java.util.Scanner;

class Grill{
	int d;			//diameter
	double radius;
	double area;
	double areaCalcOne;

	Grill(int d0){
		d = d0;
		radius = d/2.0D;
		area = Math.PI*radius*radius;			//calc area
//		area = (double) ((int) (areaCalcOne*100.00))/100.00;	//round area to two decimal places
	}
}
class Halloumi{
	int l;		//length
	int b;		//width
	double area;
	Halloumi(int l0, int b0){
		l = l0;
		b = b0;
		area = l*b;
	}
}

class Babaku_a{
	public static void main(String[] args){
		double pieces;			//halloumi pieces that fit on the grill
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the diameter of the grill: ");
		int d = sc.nextInt();
		System.out.print("Enter the length of the halloumi: ");
		int l = sc.nextInt();
		System.out.print("Enter the width of the halloumi: ");
		int b = sc.nextInt();
		System.out.println("");		//better terminal readability
		
		Grill Grill = new Grill(d);
		Halloumi Halloumi = new Halloumi(l, b);
		pieces = (double) ((int)((Grill.area/Halloumi.area)*100))/100;	//round pieces to two decimal places
		String answer = "A maximum of " + pieces + " Halloumi can fit on the grill at once";
		System.out.println(answer);
		

/* debug
		System.out.println("Grill.area: " + Grill.area + "\n" + "Halloumi.area: " + Halloumi.area);
		System.out.println("Grill.radius: " + Grill.radius);
		System.out.println("pieces: " + pieces);
*/
	}
}
