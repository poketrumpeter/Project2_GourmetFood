package Food.Decorators;

import Food.Roll;

public class SpringFilling extends extraFilling{

    Roll roll;

    public SpringFilling(Roll roll) {
        super(roll);
        this.roll = roll;
    }

    @Override
    public String getName() {
        return roll.getName() + ", extra spring filling";
    }

    @Override
    public double cost() {
        return roll.cost() + .12; //what is filling in spring roll??
    }
}
