abstract public class Brake {
    String brand;

    public Brake(String brand) {
        this.brand = brand;
    }

    public String getBrand(){return brand;}

    @Override
    public String toString(){return getGermanName() + " der Marke " + getBrand();}

    abstract public String getName();

    abstract public String getGermanName();
}
