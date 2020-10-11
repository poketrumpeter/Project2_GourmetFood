package People;

import Food.Roll;
import Logistics.Order;

import java.util.ArrayList;
import java.util.Random;

public class CasualCustomer extends defaultCustomer{

    public CasualCustomer(String name) {
        super("casual", name);
    }

    /*
    Casual customer method for buying rolls
    Customer will buy 1-3 Rolls of varying type
    *ASSUMPTION* 1-3 rolls of each type instead of 1-3 rolls of a sing type
    randomly choose each type of roll
     */

    @Override
    public Order makeOrder(Order currentOrder) {

        ArrayList<Roll> newRolls = new ArrayList<>();
        //Randomly choose 1-3 as number of rolls to buy
        Random rand = new Random();

        int amountToBuy = rand.nextInt(3);
        //3 possibilities, 0 - 1 roll, 1 - 2 rolls, 2 - 3 rolls
        for(int i = 0; i <= amountToBuy; i++){
            //order Random Roll
            newRolls.add(orderRoll());
        }
        currentOrder.setRolls(newRolls);

        return currentOrder;
    }

    @Override
    public void rollOutage() {

    }
}
