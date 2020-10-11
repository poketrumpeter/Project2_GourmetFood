package Food;

public class extraSauce extends rollDecorator{

    Roll roll;

    public extraSauce(Roll roll) {
        super(roll.getType() + ", extra Sauce");
        this.roll = roll;
    }

    @Override
    public double cost() {
        return roll.cost() + .30;
    }
}
