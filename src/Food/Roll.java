package Food;

import Food.Factories.ExtrasFactory;

public interface Roll {

    //Rolls will have a cost, Type, and Stock
    String getName();
    String getKey();
    ExtrasFactory getExtrasFactory();

    //function to keep track of cost for roll and any toppings
    double cost();



}
