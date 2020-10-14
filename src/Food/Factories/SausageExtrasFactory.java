package Food.Factories;

import Food.Decorators.*;
import Food.Roll;

public class SausageExtrasFactory extends ExtrasFactory{
    @Override
    public extraFilling addFilling(Roll roll) {
        return new SausageFilling(roll);
    }

    @Override
    public extraTopping addTopping(Roll roll) {
        return new SausageTopping(roll);
    }

    @Override
    public extraSauce addSauce(Roll roll) {
        return new SausageSauce(roll);
    }
}
