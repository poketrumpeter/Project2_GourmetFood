package Food;

public class extraFilling extends rollDecorator{

    Roll roll;

    public extraFilling(Roll roll) {
        super(roll.getType() + ", extra filling");
        this.roll = roll;
    }

    @Override
    public double cost() {
        return roll.cost() + .70;
    }
}
