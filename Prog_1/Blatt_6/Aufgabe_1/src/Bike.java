import java.util.Scanner;

abstract public class Bike {
    private static Scanner scanner = new Scanner(System.in);
    private Frame frame;
    private Brake brake;
    private Gear gear;
    private Wheels wheels;
    private boolean electric;
    private String name;

    public Bike(Frame frame0, Brake brake0, Gear gear0, Wheels wheels0, boolean electric0, String name0){
        frame = frame0;
        brake = brake0;
        gear = gear0;
        wheels = wheels0;
        electric = electric0;
        name = name0;
    }

    // return bike subclass's name
    abstract public String getType();

    // return bike subclass's name in german
    abstract public String getGermanType();


    // return String of the wanted bike subclass
    private static String askBikeType(){
        int bikeType = 0;
        do {
            System.out.print("Was für ein Fahrrad wollen sie haben?\n1: Rennrad\n2: Mountainbike\n3: Stadtrad\n(1/2/3) > ");
            bikeType = scanner.nextInt();
        } while(bikeType > 3 || bikeType < 1);

        switch (bikeType){
            case 1: return "RacingBike";
            case 2: return "Mountainbike";
            case 3: return "Citybike";
            default:
                System.out.println("\nAn error occured in method askBikeType with an uncovered input integer bikeType\n");
                return "error";
        }
    }

    // get new Bike subclass object from String
    public static Bike getBike(String bikeType, Frame frame, Brake brake, Gear gear, Wheels wheels, boolean electric, String name){
        switch (bikeType){
            case "RacingBike": return new RacingBike(frame, brake, gear, wheels, electric, name);
            case "Mountainbike": return new Mountainbike(frame, brake, gear, wheels, electric, name);
            case "Citybike": return new Citybike(frame, brake, gear, wheels, electric, name);
            default:
                System.out.println("\nAn error occured in method getBike with an unknown parameter bikeType\n");
                return null;
        }
    }

    // return String of the wanted frame subclass
    public static String askFrameType() {
        int frameType = 0;
        do {
            System.out.print("Was für einen Rahmen wollen sie haben?\n1: Carbon\n2: Aluminium\n(1/2) > ");
            frameType = scanner.nextInt();
        } while(frameType > 2 || frameType < 1);

        switch (frameType){
            case 1: return "CarbonFrame";
            case 2: return "AluminiumFrame";
            default:
                System.out.println("\nAn error occured in method askFrameType with an uncovered input integer frameType\n");
                return "error";
        }
    }

    // get new Frame subclass object from String
    public static Frame getFrame(String frameType, String color){
        String brand = "";
        System.out.print("Geben sie die erwünschte Marke ihres Rahmens an\n> ");
        brand = scanner.next();
        switch (frameType){
            case "CarbonFrame": return new CarbonFrame(brand, color);
            case "AluminiumFrame": return new AluminiumFrame(brand, color);
            default:
                System.out.println("\nAn error occured in method getFrame with an unknown parameter frameType\n");
                return null;
        }
    }

    // return String of the wanted brake subclass
    public static String askBrakeType(){
        int brakeType = 0;
        do {
            System.out.print("Was für Bremsen wollen sie haben?\n1: Felgenbremsen\n2: Scheibenbremsen\n3: Trommelbremsen\n(1/2/3) > ");
            brakeType = scanner.nextInt();
        } while(brakeType > 3 || brakeType < 1);

        switch (brakeType){
            case 1: return "RimBrake";
            case 2: return "DiscBrake";
            case 3: return "DrumBrake";
            default:
                System.out.println("\nAn error occured in method aksBrakeType with an uncovered input integer brakeType\n");
                return "error";
        }
    }

    // get new Brake subclass object from String
    public static Brake getBrake(String brakeType){
        String brand = "";
        System.out.print("Geben sie die erwünschte Marke ihrer Bremsen an\n> ");
        brand = scanner.next();
        switch (brakeType){
            case "RimBrake": return new RimBrake(brand);
            case "DiscBrake": return new DiscBrake(brand);
            case "DrumBrake": return new DrumBrake(brand);
            default:
                System.out.println("\nAn error occured in method getBrake with an unknown parameter brakeType\n");
                return null;
        }
    }

    // return String of the wanted gear subclass
    public static String askGearType(){
        int gearType = 0;
        do {
            System.out.print("Was für eine Schaltung wollen sie haben?\n1: Kettenschaltung\n2: Narbenschaltung\n(1/2) > ");
            gearType = scanner.nextInt();
        } while(gearType > 2 || gearType < 1);

        switch (gearType){
            case 1: return "ChainGear";
            case 2: return "HubGear";
            default:
                System.out.println("\nAn error occured in method askGearType with an uncovered input integer gearType\n");
                return "error";
        }
    }

    // get new Gear subclass object from String
    public static Gear getGear(String gearType){
        String brand = "";
        System.out.print("Geben sie die erwünschte Marke ihrer Schaltung an\n> ");
        brand = scanner.next();
        switch (gearType){
            case "ChainGear": return new ChainGear(brand);
            case "HubGear": return new HubGear(brand);
            default:
                System.out.println("\nAn error occured in method getGear with an unknown parameter gearType\n");
                return null;
        }
    }

    // retun wheels object with wanted specifications for size, width and brand
    public static Wheels askGetWheels(){
        float diameter = 0.0F;
        float width = 0.0F;
        String brand = "";
        // get radius
        do {
            System.out.print("Geben sie den erwünschten Durchmesser ihrer Räder in cm an\n> ");
            diameter = scanner.nextFloat();
        } while(diameter < 0.0);
        // get width
        do {
            System.out.print("Geben sie die erwünschte Breite ihrer Räder in mm an\n> ");
            width = scanner.nextFloat();
        } while(width < 0.0);
        // get brand
        System.out.print("Geben sie die erwünschte Marke ihrer Räder an\n> ");
        brand = scanner.next();

        return new Wheels(diameter, width, brand);
    }

    // return String of the wanted Color
    public static String askGetColor(){
        int color = 0;
        do {
            System.out.print("Was für eine Farbe soll dieser haben?\n1: Schwarz\n2: Weiß\n3: Rot\n4: Blau\n5: Grün\n(1/2/3/4/5) > ");
            color = scanner.nextInt();
        } while(color > 5 || color < 1);

        switch (color){
            case 1: return "Black";
            case 2: return "White";
            case 3: return "Red";
            case 4: return "Blue";
            case 5: return "Green";
            default:
                System.out.println("\nAn error occured in method askColor with an uncovered input integer color\n");
                return "error";
        }
    }

    // return true if user wants an electric bike, only Mountainbike and Citybike can be elctric
    public static boolean askGetElectric(String bikeType){
        // RacingBike bikes don't have an electric variant -> don*t bother asking
        if (bikeType.equals("RacingBike")) return false;

        String input = "";
        do {
            System.out.print("Wollen sie ein elektrisches Fahrrad haben y/n\n> ");
            input = scanner.next().toLowerCase();
        } while ( !( input.equals("y") || input.equals("n") ) );
        return input.equals("y");
    }

    // return String of the wanted name
    public static String askGetName(){
        System.out.print("Wie soll ihr Fahrrad heißen?\n > ");
        return scanner.next();
    }

    // returns new Bike with specifications provided by the user
    public static Bike createBike() {
        // gets bikeType in form of a String, checks for potential errors
        String bikeType = askBikeType();
        Boolean electricBike = askGetElectric(bikeType);

        Frame frame = getFrame(askFrameType(), askGetColor());
        Brake brake = getBrake(askBrakeType());
        Gear gear = getGear(askGearType());
        Wheels wheels = askGetWheels();

        String bikeName = askGetName();

        return getBike(bikeType, frame, brake, gear, wheels, electricBike, bikeName);
    }

    // returns name of the Bike object
    public String getName(){
        return name;
    }

    // sets the name of the Bike object
    public void setName(String name0){this.name = name0;}

    @Override
    // returns String describing the provided Bike object
    public String toString(){
        String bike = frame.colorToGerman() + " ";
        if (electric) bike += "E-";
        bike += this.getGermanType() + " mit dem Namen ";
        bike += this.getName() + ", mit ";
        bike += frame.getGermanName() + " der Marke ";
        bike += frame.getBrand() + ", ";
        bike += brake.getGermanName() + " der Marke ";
        bike += brake.getBrand() + " und ";
        bike += gear.getGermanName() + " der Marke ";
        bike += gear.getBrand();

        return bike;
    }

    // provides a detailed view of a bike and its components
    public void printDetails(){
        System.out.println("-".repeat(75));
        System.out.println("Name: " + this.name);
        System.out.println("toString: " + this);
        System.out.println("Frame: " + frame.getName() + ", brand: " + frame.getBrand() +", color: " + frame.getColor());
        System.out.println("Brake: " + brake.getName() + ", brand: " + brake.getBrand());
        System.out.println("Gear: " + gear.getName() + ", brand: " + gear.getBrand());
        System.out.printf("Wheels: Diameter = %fcm, Width = %fmm, brand = %s\n", wheels.getDiameter(), wheels.getWidth(), wheels.getBrand());
        System.out.println("Electric: " + this.electric);
        System.out.println("-".repeat(75) + "\n");
    }

}
