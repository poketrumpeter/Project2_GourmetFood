package Food.Decorators;

import Food.Factories.ExtrasFactory;
import Food.Roll;

public abstract class extraFilling implements Roll {

    Roll roll;

    public extraFilling(Roll roll) {
        this.roll = roll;
    }

    public abstract String getName();

    public abstract double cost();

    @Override
    public String getKey() {
        return roll.getKey();
    }

    @Override
    public ExtrasFactory getExtrasFactory() {
        return null;
    }
}
