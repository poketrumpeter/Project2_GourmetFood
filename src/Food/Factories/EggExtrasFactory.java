package Food.Factories;

import Food.Decorators.*;
import Food.Roll;

public class EggExtrasFactory extends ExtrasFactory{

    @Override
    public extraFilling addFilling(Roll roll) {
        return new EggFilling(roll);
    }

    @Override
    public extraTopping addTopping(Roll roll) {
        return new EggTopping(roll);
    }

    @Override
    public extraSauce addSauce(Roll roll) {
        return null;
    }
}
