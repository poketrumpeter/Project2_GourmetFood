package People;

import Logistics.Order;
import Logistics.StockStatus;

public class BusinessCustomer extends defaultCustomer{

    public BusinessCustomer(String name) {
        super("business", name);
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

    //Information on how to clear an Array list from
    // https://beginnersbook.com/2013/12/how-to-empty-an-arraylist-in-java/#:~:text=There%20are%20two%20ways%20to,the%20List%20is%20quite%20different.
    @Override
    public void rollOutage(Order currentOrder, StockStatus status) {
        System.out.println("Clearing Order");
        //If original order cant be fulfilled, order will be cancelled
        currentOrder.getItems().clear();
        currentOrder.setOrderTotal(0);

        currentOrder.setFulfilled(true);
    }
}
