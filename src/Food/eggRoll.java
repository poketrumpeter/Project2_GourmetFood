package Food;

import Food.Factories.EggExtrasFactory;

public class eggRoll extends defaultRoll{

    public eggRoll() {
        super("egg",
                "Egg Roll made with special eggs", "egg roll",
                new EggExtrasFactory());
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
