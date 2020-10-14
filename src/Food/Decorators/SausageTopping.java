package Food.Decorators;

import Food.Roll;

public class SausageTopping extends extraTopping{
    public SausageTopping(Roll roll) {
        super(roll);
    }

    @Override
    public String getName() {
        return roll.getName() + ", sausage topping";
    }

    @Override
    public double cost() {
        return roll.cost() + .74;
    }
}

