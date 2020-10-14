package Food.Factories;

import Food.Decorators.*;
import Food.Roll;

public class SpringExtrasFactory extends ExtrasFactory{

    @Override
    public extraFilling addFilling(Roll roll) {
        return new SpringFilling(roll);
    }

    @Override
    public extraTopping addTopping(Roll roll) {
        return new SpringTopping(roll);
    }

    @Override
    public extraSauce addSauce(Roll roll) {
        return new SpringSauce(roll);
    }
}
