package Food;

public class sausageRoll extends defaultRoll{

    public sausageRoll() {
        super("sausage roll");
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
