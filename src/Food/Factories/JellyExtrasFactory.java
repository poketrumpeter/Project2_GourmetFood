package Food.Factories;

import Food.Decorators.*;
import Food.Roll;

public class JellyExtrasFactory extends ExtrasFactory{

    @Override
    public extraFilling addFilling(Roll roll) {

        return new JellyFilling(roll);
    }

    @Override
    public extraTopping addTopping(Roll roll) {
        return new JellyTopping(roll);
    }

    @Override
    public extraSauce addSauce(Roll roll) {
        return new JellySauce(roll);
    }
}
