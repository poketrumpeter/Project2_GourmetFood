package Food.Decorators;

import Food.Roll;

public class PastrySauce extends extraSauce{

    public PastrySauce(Roll roll) {
        super(roll);
    }

    @Override
    public String getName() {
        return roll.getName() + ", pastry sauce";
    }

    @Override
    public double cost() {
        return roll.cost() + .85;
    }
}
