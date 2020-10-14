package Food;

import Food.Factories.JellyExtrasFactory;

public class jellyRoll extends defaultRoll{

    public jellyRoll() {
        super("jel", "Roll stuffed full of Jelly", "jelly roll",
                new JellyExtrasFactory());
    }

    @Override
    public double cost() {
        return 2.69;
    }
}
