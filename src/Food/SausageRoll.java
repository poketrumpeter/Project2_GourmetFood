package Food;

public class SausageRoll extends defaultRoll{

    public SausageRoll() {
        super("sau", "Roll wrapped around a plump sausage", "sausage roll");
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
