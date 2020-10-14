package Food.Decorators;

import Food.Roll;

public class EggSauce extends extraSauce{

    Roll roll;

    public EggSauce(Roll roll) {
        super(roll);
        this.roll = roll;
    }

    @Override
    public String getName() {
        return this.roll.getName() + ", egg sauce";
    }

    @Override
    public double cost() {
        return this.roll.cost() + .70;
    }
}
