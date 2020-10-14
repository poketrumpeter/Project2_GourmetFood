package Food.Decorators;

import Food.Roll;

public class JellySauce extends extraSauce{

    Roll roll;
    public JellySauce(Roll roll) {
        super(roll);
        this.roll = roll
    }

    @Override
    public String getName() {
        return roll.getName() + ", jelly sauce";
    }

    @Override
    public double cost() {
        return roll.cost() + .47;
    }
}
