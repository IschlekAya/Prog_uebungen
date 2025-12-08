abstract public class Brake {
    String brand;

    public Brake(String brand) {
        this.brand = brand;
    }

    public String getBrand(){return brand;}

    abstract public String getName();

    abstract public String getGermanName();
}
