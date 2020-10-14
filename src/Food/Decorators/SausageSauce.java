package Food.Decorators;

import Food.Roll;

public class SausageSauce extends extraSauce{

    public SausageSauce(Roll roll) {
        super(roll);
    }

    @Override
    public String getName() {
        return roll.getName() + ", sausage sauce";
    }

    @Override
    public double cost() {
        return roll.cost() + .28;
    }
}
