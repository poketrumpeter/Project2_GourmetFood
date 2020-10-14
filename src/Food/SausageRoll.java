package Food;

import Food.Factories.SausageExtrasFactory;

public class SausageRoll extends defaultRoll{

    public SausageRoll() {
        super("sau", "Roll wrapped around a plump sausage",
                "sausage roll", new SausageExtrasFactory());
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
