package Food;

import Food.Factories.SpringExtrasFactory;

public class springRoll extends defaultRoll{

    public springRoll() {
        super("spr", "spring roll, a special for Spring time",
                "spring roll", new SpringExtrasFactory());
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
