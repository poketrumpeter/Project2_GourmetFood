package Food.Factories;

import Food.Decorators.*;
import Food.Roll;

public class PastryExtrasFactory extends ExtrasFactory{

    @Override
    public extraFilling addFilling(Roll roll) {
        return new PastryFilling(roll);
    }

    @Override
    public extraTopping addTopping(Roll roll) {
        return new PastryTopping(roll);
    }

    @Override
    public extraSauce addSauce(Roll roll) {
        return new PastrySauce(roll);
    }
}
