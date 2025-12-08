abstract class Frame {
    String brand;
    String color;

    public Frame(String brand0, String color0) {
        brand = brand0;
        color = color0;
    }

    public String getBrand(){return brand;}

    public String getColor(){return color;}

    // return String of the wanted Color IN GERMAN
    public String colorToGerman(){
        String germanColor = "";
        switch(color){
            case "Black": return "Schwarzes";
            case "White": return "Weißes";
            case "Red": return "Rotes";
            case "Blue": return "Blaues";
            case "Green": return "Grünes";
            default:
                System.out.println("\nAn error occured in method colorToGerman with an unknown parameter color\n");
                return "error";
        }

    }

    @Override
    public String toString(){return colorToGerman() + " " + getGermanName() + " von der Marke " + getBrand();}

    abstract public String getName();

    abstract public String getGermanName();
}
