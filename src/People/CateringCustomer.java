package People;

import Logistics.Order;

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
    public Order makeOrder(Order currentOrder) {
        return null;
    }

    /*
    if order can't be fulfilled, they will take any number of rolls for a max of 15
    need to know roll amount that they were able to buy before this method
     */
    @Override
    public void rollOutage() {

    }
}
