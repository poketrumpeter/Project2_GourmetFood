package Food;

public class eggRoll extends defaultRoll{

    public eggRoll() {
        super("egg roll");
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
