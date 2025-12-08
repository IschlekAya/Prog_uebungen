public class DiscBrake extends Brake{

    public DiscBrake(String brand) {
        super(brand);
    }

    @Override
    public String getName(){return "DiscBrake";}

    @Override
    public String getGermanName(){return "Scheibenbremsen";}
}
