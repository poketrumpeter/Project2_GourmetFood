package Logistics;


import Food.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//import sun.jvm.hotspot.oops.HeapPrinter;

public class GourmetFoodShop implements Store{

    Map<String, Order> customerOrders;
    ArrayList<Order> dailyOrders;
    Inventory inventory;
    int dailyCustomers;
    int dayNumber;
    String day;
    int numOrders;

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
        //openForBusiness = true;
    }

    @Override
    public void open(int day) {
        this.dayNumber = day;

        //if the day isn't the first day, check to restock
        if(day != 1) {
            //loop through stocks

            //for(Map.Entry<String, InventoryItem> rollTypeStock : inventory) {
                //if that roll type is out of stock
            if(inventory.checkStock("jel") == 0) {
                //restock
                inventory.restockItem("jel");
            }
            if(inventory.checkStock("sau") == 0) {
                //restock
                inventory.restockItem("sau");
            }
            if(inventory.checkStock("egg") == 0) {
                //restock
                inventory.restockItem("egg");
            }
            if(inventory.checkStock("pas") == 0) {
                //restock
                inventory.restockItem("pas");
            }
            if(inventory.checkStock("spr") == 0) {
                //restock
                inventory.restockItem("spr");
            }
            //}

        }
    }


    // Don't think we need this
    @Override
    public void close() {
        //Close the shop and increment the day and replenish stock if it is out
        dayNumber++;
    }

    @Override
    public boolean respondToOrder(Order newOrder) {
       /*
        method to check stock to make sure we could fulfill the order, If true, respond to Customer
        to let them buy the rolls and so we can record the order

        If false, allow them to use their respond to roll outage function.
         */

        boolean stockAvailable = true;

        for(OrderItem item : newOrder.getItems()){
            //want to get stock of current roll type

            if(inventory.decrementInventory(item.roll.getKey(), item.quantity) == false) {
                stockAvailable = false;
            }
            //The code below might will always return true if the last item is in stock, but if a previous item is out of stock
            // stockAvailable = inventory.decrementInventory(item.roll.getKey(), item.quantity);
        }
        //if there was stock to complete the order, save order
        if (stockAvailable){
            this.dailyOrders.add(newOrder);
        }

        //System.out.println("Inventory: ");
        displayStock();

        return stockAvailable;
    }

    public boolean shouldClose() {
        boolean closeShop = true;
        /*
        for(Map.Entry<String, InventoryItem> rollTypeStock : inventory) {
            if(inventory.checkStock(rollTypeStock.getKey()) >= 0) {
                closeShop = false;
            }
        }
        */
        if(inventory.checkStock("jel") >= 0) {
            closeShop = false;
        }
        if(inventory.checkStock("sau") >= 0) {
            closeShop = false;
        }
        if(inventory.checkStock("egg") >= 0) {
            closeShop = false;
        }
        if(inventory.checkStock("pas") >= 0) {
            closeShop = false;
        }
        if(inventory.checkStock("spr") >= 0) {
            closeShop = false;
        }
        return closeShop;
    }

    public void displayStock(){
        inventory.displayInventory();
    }
}
