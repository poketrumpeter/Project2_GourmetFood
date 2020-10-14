package Food.Decorators;

import Food.Roll;

public class SpringSauce extends extraSauce{
    public SpringSauce(Roll roll) {
        super(roll);
    }

    @Override
    public String getName() {
        return roll.getName() + ", spring sauce";
    }

    @Override
    public double cost() {
        return roll.cost() + .98;
    }
}
