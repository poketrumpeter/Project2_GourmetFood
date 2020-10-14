package Food.Decorators;

import Food.Roll;

public class PastryFilling extends extraFilling{

    Roll roll;

    public PastryFilling(Roll roll) {
        super(roll);
        this.roll = roll;
    }

    @Override
    public String getName() {
        return roll.getName() + ", extra pastry filling";
    }

    @Override
    public double cost() {
        return roll.cost() + 1.22;
    }
}
