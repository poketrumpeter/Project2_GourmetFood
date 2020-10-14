package Logistics;

import Food.Roll;

public class OrderItem {
    Roll roll;
    int quantity;

    public OrderItem(Roll roll, int quantity) {
        this.roll = roll;
        this.quantity = quantity;
    }
}
