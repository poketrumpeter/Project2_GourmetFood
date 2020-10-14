package Food;

public class jellyRoll extends defaultRoll{

    public jellyRoll() {
        super("jel", "Roll stuffed full of Jelly", "jelly roll");
    }

    @Override
    public double cost() {
        return 2.69;
    }
}
