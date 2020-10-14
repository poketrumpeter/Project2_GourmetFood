package People;

import Logistics.Order;
import Logistics.OrderItem;
import Logistics.StockStatus;
import Logistics.Store;

import java.util.ArrayList;

public interface Customer {

    void arrive();
    void leave();
    String getType();
    void orderItems(Order currentOrder);
    void rollOutage(Order currentOrder, StockStatus status);

}
