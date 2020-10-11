package Food;

public class extraTopping extends rollDecorator{

    Roll roll;

    public extraTopping(Roll roll) {
        super(roll.getType() + ", extra topping");
        this.roll = roll;
    }

    @Override
    public double cost() {
        return roll.cost() + .50;
    }
}
