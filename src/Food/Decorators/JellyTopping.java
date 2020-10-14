package Food.Decorators;

import Food.Roll;

public class JellyTopping extends extraTopping{

    public JellyTopping(Roll roll) {
        super(roll);
    }

    @Override
    public String getName() {
        return roll.getName() + ", jelly topping";
    }

    @Override
    public double cost() {
        return roll.cost() + .68;
    }
}
