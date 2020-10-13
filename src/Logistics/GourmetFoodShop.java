package Logistics;

import Food.*;
import sun.jvm.hotspot.oops.HeapPrinter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GourmetFoodShop implements Store{

    ArrayList<Order> dailyOrders;
    Map<String, Integer>stock;
    int dayNumber;
    String day;

    public GourmetFoodShop() {
        this.stock = new HashMap<>();
        this.stock.put(new jellyRoll().getType(), 30);
        this.stock.put(new pastryRoll().getType(), 30);
        this.stock.put(new eggRoll().getType(), 30);
        this.stock.put(new springRoll().getType(), 30);
        this.stock.put(new SausageRoll().getType(), 30);
        this.dayNumber = 1;
        this.day = "01";
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void respondToOrder(Order newOrder) {

        /*
        method to check stock to make sure we could fulfill the order, If true, respond to Customer
        to let them buy the rolls and so we can record the order

        If false, allow them to use their respond to roll outage function.
         */
        boolean stockAvailible = false;
        for(Roll currentRoll: newOrder.getRolls()){
            //want to get stock of current roll type
            if(this.stock.get(currentRoll.getType()) != 0){
                //Roll is in stock
                System.out.println("In Stock");
                this.stock.computeIfPresent(currentRoll.getType(), (k, v) -> v-1);
            }
        }
        System.out.println();
        displayStock();
    }

    public void displayStock(){
        for(Map.Entry<String, Integer> entry: this.stock.entrySet()){
            System.out.println("Stock for " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
