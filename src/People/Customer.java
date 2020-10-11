package People;

import Logistics.Order;

public interface Customer {

    void arrive();
    void leave();
    Order makeOrder(Order currentOrder);
    void rollOutage();

}
