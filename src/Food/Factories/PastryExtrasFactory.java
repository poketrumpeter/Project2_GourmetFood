package Food.Factories;

import Food.Decorators.PastryFilling;
import Food.Decorators.extraFilling;
import Food.Decorators.extraSauce;
import Food.Decorators.extraTopping;
import Food.Roll;

public class PastryExtrasFactory extends ExtrasFactory{

    @Override
    public extraFilling addFilling(Roll roll) {
        return new PastryFilling(roll);
    }

    @Override
    public extraTopping addTopping(Roll roll) {
        return null;
    }

    @Override
    public extraSauce addSauce(Roll roll) {
        return null;
    }
}
