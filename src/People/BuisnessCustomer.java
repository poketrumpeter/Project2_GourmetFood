package People;

import Food.Roll;
import Logistics.Order;
import Logistics.Store;

import java.util.ArrayList;

public class BuisnessCustomer extends defaultCustomer{

    public BuisnessCustomer(String name) {
        super("buisness", name);
    }

    //Buisness Customer specific method of buying Rolls
    //Will Seek to buy 2 of each type of Roll
    //Pass in collection of Roll Objects?
    //Return Bool if Order was fulfilled or not

    @Override
    public void orderItems(Order currentOrder) {

        currentOrder.addItems("jelly", 2);
        currentOrder.addItems("sausage", 2);
        currentOrder.addItems("pastry", 2);
        currentOrder.addItems("spring", 2);
        currentOrder.addItems("egg", 2);

    }


    //Method to respond to Roll Outages
    //Will be called in BuyRolls

    @Override
    public void rollOutage() {

    }
}
