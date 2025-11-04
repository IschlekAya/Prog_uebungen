import java.util.Scanner;

class Grill{
	int d;			//diameter
	double radius;
	double area;
	//double areaCalcOne;

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
class Persons{
	int adult;
	int child;
	double amountNeeded;	//amount of Halloumi pieces they'll eat
	Persons(int a0, int c0){
		adult = a0;
		child = c0;
		amountNeeded = 2*adult + child;
	}
}

class Babaku_b{
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
		pieces = getPieces(Grill.area, Halloumi.area);
		String answer = "A maximum of " + pieces + " Halloumi can fit on the grill at once";
		System.out.println(answer);

		System.out.print("Enter the amount of adults: ");
		int a = sc.nextInt();
		System.out.print("Enter the amount of children: ");
		int c = sc.nextInt();
		System.out.println("");
		
		Persons Persons = new Persons(a, c);
		int refillsNeeded = (int) (Persons.amountNeeded/pieces);
		String answer2 = "A total of " + refillsNeeded + " whole refills are needed to satiate everyone";
		System.out.println(answer2);

/* debug
		System.out.println("Grill.area: " + Grill.area + "\n" + "Halloumi.area: " + Halloumi.area);
		System.out.println("Grill.radius: " + Grill.radius);
		System.out.println("pieces: " + pieces);
*/
	}
	static double getPieces(double a, double b){
		return (double) ((int)((a/b)*100))/100;	//round pieces to two decimal places
	}
}
