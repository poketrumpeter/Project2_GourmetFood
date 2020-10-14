package Food.Decorators;

import Food.Roll;

public class JellyFilling extends extraFilling{

    Roll roll;

    public JellyFilling(Roll roll) {
        super(roll);
        this.roll = roll;
    }

    @Override
    public String getName() {
        return roll.getName() + ", extra jelly filling";
    }

    @Override
    public double cost() {
        return roll.cost() + .20;
    }
}
