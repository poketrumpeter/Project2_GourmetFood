package Food.Decorators;

import Food.Roll;

public class EggTopping extends extraTopping{

    Roll roll;
    public EggTopping(Roll roll) {
        super(roll);
        this.roll = roll;

    }

    @Override
    public String getName() {
        return roll.getName() + ", egg topping";
    }

    @Override
    public double cost() {
        return roll.cost() + .24;
    }
}
