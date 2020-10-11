package Logistics;

import Food.Roll;

import java.util.ArrayList;

public class Order {

    int orderNumber;
    ArrayList<Roll> rolls;
    double orderTotal;
    boolean fulfilled;

    public Order(int orderNumber, double orderTotal, boolean fulfilled) {
        this.orderNumber = orderNumber;
        this.rolls = new ArrayList<Roll>();
        this.orderTotal = orderTotal;
        this.fulfilled = fulfilled;
    }
}
