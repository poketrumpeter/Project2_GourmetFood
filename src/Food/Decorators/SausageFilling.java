package Food.Decorators;

import Food.Roll;

public class SausageFilling extends extraFilling{

    Roll roll;

    public SausageFilling(Roll roll) {
        super(roll);
        this.roll = roll;
    }

    @Override
    public String getName() {
        return roll.getName() + ", extra sausage filling";
    }

    @Override
    public double cost() {
        return roll.cost() + 2.30; //extra sausages means more money
    }
}
