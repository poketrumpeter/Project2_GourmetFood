package Food;

public class SausageRoll extends defaultRoll{

    public SausageRoll() {
        super("sausage roll");
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
