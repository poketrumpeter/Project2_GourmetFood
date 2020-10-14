package Food.Decorators;

import Food.Factories.ExtrasFactory;
import Food.Roll;

public abstract class extraTopping implements Roll {

    Roll roll;

    public extraTopping(Roll roll) {
        this.roll = roll;
    }

    public abstract String getName() ;

    @Override
    public String getKey() {
        return roll.getKey();
    }

    public abstract double cost();

    @Override
    public ExtrasFactory getExtrasFactory() {
        return null;
    }
}
