public class RimBrake extends Brake{

    public RimBrake(String brand) {
        super(brand);
    }

    @Override
    public String getName(){return "RimBrake";}

    @Override
    public String getGermanName(){return "Felgenbremse";}
}
