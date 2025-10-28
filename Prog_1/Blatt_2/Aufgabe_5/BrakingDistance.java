import java.util.Scanner;
public class BrakingDistance{
//reienfloge von den operatoren ist gleich wie bei mathe
static public int intBremsweg(int v){
return (v/10)*(v/10);}//grosser nachteil da es keine kommazahlen ausgeben kann

static public float floatBremsweg(float v){
return (v/10f)*(v/10f);}//kommastellen aber computer können nicht dividieren daher kommt es immer zur ungenauichkeiten

static public double doubleBremsweg(double v){
return (v/10)*(v/10);}//am genausten wegen der gröse des types

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Welche datentypen?\n1 für int\n2 für float\n3 für double\n");
int s = sc.nextInt();
System.out.print("Wie schnell ist das fahrzeug?\n");
switch (s){
case 1:
int vInt = sc.nextInt();
System.out.print(intBremsweg(vInt)+"\n");
break;

case 2:
float vFloat = sc.nextFloat();
System.out.print(floatBremsweg(vFloat)+"\n");
break;

case 3:
double vDouble = sc.nextDouble();
System.out.print(doubleBremsweg(vDouble)+"\n");
break;}
}
}
