package Food.Decorators;

import Food.Roll;

public class EggFilling extends extraFilling{
    Roll roll;

    public EggFilling(Roll roll) {
        super(roll);
        this.roll = roll;
    }

    @Override
    public String getName() {
        return roll.getName() + ", extra egg filling";
    }

    @Override
    public double cost() {
        return roll.cost() + .58;
    }
}
