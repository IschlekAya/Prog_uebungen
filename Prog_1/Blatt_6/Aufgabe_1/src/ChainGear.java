// "Kettenschaltung", correct translation: "derailleur (gear system)"
public class ChainGear extends Gear {

    public ChainGear(String brand) {
        super(brand);
    }

    @Override
    public String getName(){return "ChainGear";}

    @Override
    public String getGermanName(){return "Kettenschaltung";}
}
