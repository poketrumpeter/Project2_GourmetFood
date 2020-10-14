package Food.Decorators;

import Food.Roll;

public class SpringTopping extends extraTopping{
    public SpringTopping(Roll roll) {
        super(roll);
    }

    @Override
    public String getName() {
        return roll.getName() + ", spring topping";
    }

    @Override
    public double cost() {
        return roll.cost() + .23;
    }
}
