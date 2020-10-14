package Food;

public class eggRoll extends defaultRoll{

    public eggRoll() {
        super("egg", "Egg Roll made with special eggs", "egg roll");
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
