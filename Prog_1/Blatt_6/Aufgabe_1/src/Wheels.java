public class Wheels {
    private float radius;
    private float width;
    private String brand;

    public Wheels(float radius0, float width0, String brand0){
        radius = radius0;
        width = width0;
        brand = brand0;
    }

    @Override
    public String toString(){return "Rad mit Radius " + getRadius() + ", dem Durchmesser " + getWidth() + " und der Marke " + getBrand();}

    public String getBrand(){return brand;}
    public float getRadius(){return radius;}
    public float getWidth(){return width;}
}
