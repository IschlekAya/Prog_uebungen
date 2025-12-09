public class Wheels {
    private float diameter;
    private float width;
    private String brand;

    public Wheels(float diameter0, float width0, String brand0){
        diameter = diameter0;
        width = width0;
        brand = brand0;
    }

    public String getBrand(){return brand;}
    public float getDiameter(){return diameter;}
    public float getWidth(){return width;}
}
