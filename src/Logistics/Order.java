package Logistics;

import Food.Roll;
import Food.defaultRollFactory;
import Food.extraFilling;

import java.util.ArrayList;
import java.util.Random;

public class Order {

    int orderNumber;
    private ArrayList<OrderItem> items;
    double orderTotal;
    boolean fulfilled;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.items = new ArrayList<>();
        this.orderTotal = 0;
        this.fulfilled = false;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    //Form an order and add toppings based on RollKey and quantity of rolls
    public void addItems(String rollKey, int quantity) {

        defaultRollFactory rollFactory = new defaultRollFactory();

        for (int i = 0; i < quantity; i++) {
            //For each roll, add toppings
            Roll newRoll = rollFactory.createRoll(rollKey);

            Roll wrappedRoll = addToppings(newRoll);

            items.add(new OrderItem(wrappedRoll, 1));
        }

        //this.items.add(new OrderItem(roll, quantity));
    }

    public void displayOrder() {

        this.orderTotal = 0;
        for (OrderItem item : this.items) {
            System.out.println(item.quantity + " - " + item.roll.getName() + ": " + item.roll.cost());
            orderTotal += item.roll.cost();
        }
    }

    private Roll addToppings(Roll rollToWrap){ //wrap roll with decorators

        //Wrapping roll with random choice for fillings

        Random rand = new Random();
        int fillings = rand.nextInt(3); //Options of 0 and 1 filling

        //if fillings = 0, should not wrap
        //if fillings = 1, wrap once
        for (int i = 0; i < (fillings-1); i++){
            rollToWrap = new extraFilling(rollToWrap);
        }

        //Wrapping roll with random choice for toppings

        //Wrapping roll with random choice for sauces

        return rollToWrap;
    }
}