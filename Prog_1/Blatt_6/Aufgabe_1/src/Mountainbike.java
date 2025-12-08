public class Mountainbike extends Bike{

    public Mountainbike(Frame frame0, Brake brake0, Gear gear0, Wheels wheels0, boolean electric0, String name0) {
        super(frame0, brake0, gear0, wheels0, electric0, name0);
    }

    @Override
    public String getType(){return "Mountainbike";}

    @Override
    public String getGermanType(){return "Mountainbike";}

}
