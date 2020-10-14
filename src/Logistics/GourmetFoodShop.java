package Logistics;


import Food.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//import sun.jvm.hotspot.oops.HeapPrinter;

public class GourmetFoodShop implements Store{
  
    Inventory inventory;
    int dailyCustomers;
    int dayNumber;
    String day;
    int numOrders;
    boolean openForBusiness;

    public GourmetFoodShop() {
        inventory = new Inventory(new HashMap<>());
        inventory.addInventory(new jellyRoll(), 30);
        inventory.addInventory(new sausageRoll(), 30);
        inventory.addInventory(new eggRoll(), 30);
        inventory.addInventory(new pastryRoll(), 30);
        inventory.addInventory(new springRoll(), 30);


        this.customerOrders = new HashMap<>();
        this.dailyOrders = new ArrayList<>();
        this.dayNumber = 1;
        this.dailyCustomers = 0;
        openForBusiness = true;
    }

    @Override
    public void open(int day) {
        this.dayNumber = day;

        //if the day isn't the first day, check to restock
        if(day != 1) {
            //loop through stocks
            for(int i = 0; i < 5; i++) {
                //if that roll type is out of stock
                if(rollStock[i] == 0) {
                    //restock
                    rollStock[i] = 30;
                }
            }
        }

    }


    //dont think we need this
    @Override
    public void close() {

        //Close the shop and increment the day and replenish stock if it is out
        dayNumber++;

        //count through stock checking to see if any is out
    }

    @Override
    public void respondToOrder(Order newOrder) {
        /*
        method to check stock to make sure we could fulfill the order, If true, respond to Customer
        to let them buy the rolls and so we can record the order
        If false, allow them to use their respond to roll outage function.
         */


        //boolean stockAvailable = false;
        for(Roll currentRoll: newOrder.getRolls()){
            //index of rollType to rollStock
            int index = -1;
            for(int i = 0; i < rollType.size(); i++) {
                if(rollType.get(i).getType().equals(currentRoll.getType())) {
                    index = i;
                }
            }
            //want to get stock of current roll type
            //if(this.rollStock.get(currentRoll.getType()) != 0){
            if(this.rollStock[index] != 0){
                //Roll is in stock
                System.out.println("In Stock");
                // daily Order being updated
                //dailyOrders.add();
                //this.rollStock.computeIfPresent(currentRoll.getType(), (k, v) -> v-1);
            }
        }
        System.out.println();
        displayStock();

    }


        /*
        method to check stock to make sure we could fulfill the order, If true, respond to Customer
        to let them buy the rolls and so we can record the order

        If false, allow them to use their respond to roll outage function.
         */

        boolean stockAvailable = true;

        for(OrderItem item : newOrder.getItems()){
            //want to get stock of current roll type
            stockAvailable = inventory.decrementInventory(item.roll.getKey(), item.quantity);
        }
        //if there was stock to complete the order, save order
        if (stockAvailable){
            this.dailyOrders.add(newOrder);
        }

        System.out.println();
        displayStock();
    }

    public void displayStock(){
        inventory.displayInventory();

    }
}
