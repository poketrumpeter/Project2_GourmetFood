package Food.Factories;

import Food.Decorators.SpringFilling;
import Food.Decorators.extraFilling;
import Food.Decorators.extraSauce;
import Food.Decorators.extraTopping;
import Food.Roll;

public class SpringExtrasFactory extends ExtrasFactory{

    @Override
    public extraFilling addFilling(Roll roll) {
        return new SpringFilling(roll);
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
