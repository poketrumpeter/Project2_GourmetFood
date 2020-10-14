package Food;

public class extraFilling implements Roll{

    Roll roll;

    public extraFilling(Roll roll) {
        this.roll = roll;
    }


    @Override
    public String getName() {
        return roll.getName() + ", extra filling";
    }

    @Override
    public String getKey() {
        return roll.getKey();
    }

    @Override
    public double cost() {
        return roll.cost() + .70;
    }
}
