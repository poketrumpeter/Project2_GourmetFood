package Food;

import Food.Factories.PastryExtrasFactory;

public class pastryRoll extends defaultRoll{

    public pastryRoll() {
        super("pas", "Roll stuffed with Icing and smothered with specialty creme",
                "pastry roll", new PastryExtrasFactory());
    }

    @Override
    public double cost() {
        return 3.29;
    }
}
