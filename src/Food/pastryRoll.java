package Food;

public class pastryRoll extends defaultRoll{

    public pastryRoll() {
        super("pastry roll");
    }

    @Override
    public double cost() {
        return 3.29;
    }
}
