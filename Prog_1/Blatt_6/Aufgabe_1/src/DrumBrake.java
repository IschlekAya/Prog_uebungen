public class DrumBrake extends Brake{

    public DrumBrake(String brand) {
        super(brand);
    }

    @Override
    public String getName(){return "DrumBrake";}

    @Override
    public String getGermanName(){return "Trommelbremse";}
}
