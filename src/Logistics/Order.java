package Logistics;

import Food.Factories.ExtrasFactory;
import Food.Roll;
import Food.Factories.DefaultRollFactory;
import Food.Decorators.extraFilling;

import java.util.ArrayList;
import java.util.Random;

public class Order {

    float orderNumber;
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

        DefaultRollFactory rollFactory = new DefaultRollFactory();

        for (int i = 0; i < quantity; i++) {
            //For each roll, add toppings
            Roll newRoll = rollFactory.createRoll(rollKey);

            Roll wrappedRoll = addToppings(newRoll);
            //Roll wrappedRoll = newRoll;

            items.add(new OrderItem(wrappedRoll, 1));

            this.orderTotal += wrappedRoll.cost();
        }

        //this.items.add(new OrderItem(roll, quantity));
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public void displayOrder() {

        for (OrderItem item : this.items) {
            System.out.println(item.quantity + " - " + item.roll.getName() + ": " + item.roll.cost());
        }

        System.out.println("Total Order cost is: " + orderTotal);

        System.out.println();
    }

    private Roll addToppings(Roll rollToWrap){ //wrap roll with decorators

        //Wrapping roll with random choice for fillings

        //declare new extrasfactory based on rollType
        ExtrasFactory newExtras = rollToWrap.getExtrasFactory();

        Random rand = new Random();
        int fillings = rand.nextInt(2); //Options of 0 and 1 filling

        //if fillings = 0, should not wrap
        //if fillings = 1, wrap once
        for (int i = 0; i < (fillings); i++){
            rollToWrap = newExtras.addFilling(rollToWrap);
        }

        //Wrapping roll with random choice for toppings

        //Wrapping roll with random choice for sauces

        return rollToWrap;
    }
}