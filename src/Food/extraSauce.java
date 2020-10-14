package Food;

public class extraSauce implements Roll{

    Roll roll;

    public extraSauce(Roll roll) {
        this.roll = roll;
    }

    @Override
    public String getName() {
        return roll.getName() + ", extra sauce";
    }

    @Override
    public String getKey() {
        return roll.getKey();
    }

    @Override
    public double cost() {
        return roll.cost() + .30;
    }
}
