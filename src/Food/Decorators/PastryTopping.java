package Food.Decorators;

import Food.Roll;

public class PastryTopping extends extraTopping{

    public PastryTopping(Roll roll) {
        super(roll);
    }

    @Override
    public String getName() {
        return roll.getName() + ", pastry topping";
    }

    @Override
    public double cost() {
        return roll.cost() + .46;
    }
}
