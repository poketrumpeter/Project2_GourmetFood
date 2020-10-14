package Food.Factories;

import Food.Decorators.JellyFilling;
import Food.Decorators.extraFilling;
import Food.Decorators.extraSauce;
import Food.Decorators.extraTopping;
import Food.Roll;

public class JellyExtrasFactory extends ExtrasFactory{

    @Override
    public extraFilling addFilling(Roll roll) {

        return new JellyFilling(roll);
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
