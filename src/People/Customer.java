package People;

import Logistics.Order;
import Logistics.OrderItem;
import Logistics.Store;

import java.util.ArrayList;

public interface Customer {

    void arrive();
    void leave();
    void orderItems(Order currentOrder);
    void rollOutage();

}
