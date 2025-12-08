abstract public class Gear {
    String brand;

    public Gear(String brand) {
        this.brand = brand;
    }

    public String getBrand(){return brand;}

    abstract public String getName();

    abstract public String getGermanName();
}
