package People;

import Food.Roll;
import Logistics.Order;
import Logistics.OrderItem;

import java.util.ArrayList;
import java.util.Random;

public class CasualCustomer extends defaultCustomer{

    public CasualCustomer(String name) {
        super("casual", name);
    }

    /*
    Casual customer method for buying rolls
    Customer will buy 1-3 Rolls of a random type
    randomly choose a type of roll
     */

    @Override
    public void orderItems(Order currentOrder){

        //Randomly choose 1-3 as number of rolls to buy
        Random rand = new Random();

        int amountToBuy = rand.nextInt(3);
        String rollChoice = orderRoll();
        //3 possibilities, 0 - 1 roll, 1 - 2 rolls, 2 - 3 rolls

        currentOrder.addItems(rollChoice, amountToBuy+1);

    }

    @Override
    public void rollOutage() {

    }
}
