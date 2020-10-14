package People;

import Logistics.Order;
import Logistics.StockStatus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class CateringCustomer extends defaultCustomer{

    public CateringCustomer(String name) {
        super("catering", name);
    }


    /*
    Catering customer method for buying rolls
    will buy 5 rolls of 3 different types
    15 total
     */

    @Override
    public void orderItems(Order currentOrder) {

        int uniqueRolls = 0;
        Collection orderedRolls = new ArrayList<String>();
        while (uniqueRolls < 3){

            String newRoll = orderRoll();

            if (!orderedRolls.contains(newRoll)){
                orderedRolls.add(newRoll);
                currentOrder.addItems(newRoll, 5);
                uniqueRolls++;
            }

        }
    }

    /*
        if order can't be fulfilled, they will take any number of rolls for a max of 15
        need to know roll amount that they were able to buy before this method
         */

    @Override
    public void rollOutage(Order currentOrder, StockStatus status) {

        /*
        If order can't be fulfilled, they dont care final order, so we are going to take the first
        part of the list in which there were a good amount of rolls and cut the rest
         */

        //remove the OutofStock OrderItem
        int problemIndex = status.getIndex();

        for (int i = problemIndex; i < currentOrder.getItems().size(); i++){
            currentOrder.setOrderTotal(currentOrder.getOrderTotal() - currentOrder.currentCost(i));
            currentOrder.getItems().remove(i);
        }

        //get the current amount of rolls in this order.
        int totalItems = currentOrder.getItems().size();

        for (int i = totalItems; i <= 15; i++){
            //random roll and add to the Order
            String newRollID = orderRoll();

            currentOrder.addItems(newRollID, 1);
        }



    }
}
