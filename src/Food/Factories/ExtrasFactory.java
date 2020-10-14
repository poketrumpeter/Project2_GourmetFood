package Food.Factories;

import Food.Decorators.extraFilling;
import Food.Decorators.extraSauce;
import Food.Decorators.extraTopping;
import Food.Roll;

public abstract class ExtrasFactory {

    public abstract extraFilling addFilling(Roll roll);

    public abstract extraTopping addTopping(Roll roll);

    public abstract extraSauce addSauce(Roll roll);

}
