package Logistics;

import Food.Roll;

import java.util.ArrayList;

public class Order {

    int orderNumber;
    private ArrayList<Roll> rolls;
    double orderTotal;
    boolean fulfilled;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.rolls = new ArrayList<Roll>();
        this.orderTotal = 0;
        this.fulfilled = false;
    }

    public ArrayList<Roll> getRolls() {
        return rolls;
    }

    public void setRolls(ArrayList<Roll> rolls) {
        this.rolls = rolls;
    }

    public void displayOrder(){

        for(Roll currentRoll: rolls){

            System.out.println(currentRoll.getType() + ": " + currentRoll.cost());

            orderTotal += currentRoll.cost();

        }

        System.out.println("Current Order Total: " + orderTotal);

    }
}
