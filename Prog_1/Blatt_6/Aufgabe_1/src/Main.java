public class Main {
    public static void main(String[] args) {
        /* Important  note:
        The class Bike and it's components were made with the method Bike.createBike() in mind.
        Whilst manually creating a new Bike object (as seen below) is possible, it is not recommended
        and misses a lot of the functionality asked for by the task (e.g. RacingBike can't also be an electrical Bike).
        Therefore, creating a new Bike object without the use of Bike.createBike() can and is only supposed
        to be used for testing purposes and is not a proper representation of this program's capabilities.
        **/
        Bike redRacer = new RacingBike(new CarbonFrame("Canyon", "Red"), new RimBrake("Shimano"), new ChainGear("Shimano"), new Wheels(105.0F, 25.0F, "Continental"), false, "Bernd");
        Bike blackEMTB = new Mountainbike(new AluminiumFrame("Giant", "Black"), new DiscBrake("Shimano"), new ChainGear("Shimano"), new Wheels(120.0F, 55.0F, "Continental"), true, "Thomas");
        Bike whiteECibi = new Citybike(new AluminiumFrame("Giant", "White"), new DrumBrake("Shimano"), new HubGear("Shimano"), new Wheels(90.0F, 40.0F, "notContinental"), true, "Michael");
        System.out.println(redRacer);
        System.out.println(blackEMTB);
        System.out.println(whiteECibi);


//        Bike bike = Bike.createBike();
//        Bike nextBike = Bike.createBike();
//        Bike nextNextBike = Bike.createBike();
//
//        System.out.println("__".repeat(75));
//        System.out.println(bike);
//        System.out.println(nextBike);
//        System.out.println(nextNextBike);
    }
}
