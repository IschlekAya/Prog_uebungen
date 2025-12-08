public class Citybike extends Bike{

    public Citybike(Frame frame0, Brake brake0, Gear gear0, Wheels wheels0, boolean electric0, String name0) {
        super(frame0, brake0, gear0, wheels0, electric0, name0);
    }

    @Override
    public String getType(){return "Citybike";}

    @Override
    public String getGermanType(){return "Stadtrad";}
}
