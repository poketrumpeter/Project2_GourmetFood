package Food;

public class extraTopping implements Roll{

    Roll roll;

    public extraTopping(Roll roll) {
        this.roll = roll;
    }

    @Override
    public String getName() {
        return roll.getName() + ", extra topping ";
    }

    @Override
    public String getKey() {
        return roll.getKey();
    }

    @Override
    public double cost() {
        return roll.cost() + .50;
    }
}
