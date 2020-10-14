package Logistics;


import Food.*;

import java.util.ArrayList;
import java.util.HashMap;

//import sun.jvm.hotspot.oops.HeapPrinter;

public class GourmetFoodShop implements Store, Subject {
  
    Inventory inventory;
    ArrayList<Order> dailyOrders;
    int dailyCustomers;
    public int dayNumber;
    String day;
    int numOrders;
    public boolean openForBusiness;

    private ArrayList<Observer> observers;

    public GourmetFoodShop() {
        inventory = new Inventory(new HashMap<>());
        inventory.addInventory(new jellyRoll(), 30);
        inventory.addInventory(new sausageRoll(), 30);
        inventory.addInventory(new eggRoll(), 30);
        inventory.addInventory(new pastryRoll(), 30);
        inventory.addInventory(new springRoll(), 30);

        this.dailyOrders = new ArrayList<>();
        this.dayNumber = 1;
        this.dailyCustomers = 0;
        openForBusiness = true;

        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        //Check to make sure we have a valid index
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers(String message) {

        //This will count through all the observers and notify them by calling update
        for(Observer observer : observers){
            observer.update(this, message);
        }

    }

    public boolean isOpenForBusiness() {
        return openForBusiness;
    }

    @Override
    public void open(int day) {
        notifyObservers("open");
        this.dayNumber = day;
        this.openForBusiness = true;

        //if the day isn't the first day, check to restock
        if(day != 1) {

            //Inventory method for checking each Items stock making sure if its 0, restock it
            inventory.checkEmpty();

        }

    }


    //dont think we need this
    @Override
    public void close() {

        //Close the shop and increment the day and replenish stock if it is out
        //dayNumber++;
        notifyObservers("closed");
        this.openForBusiness = false;
        //count through stock checking to see if any is out
    }

    @Override
    public StockStatus respondToOrder(Order newOrder) {

        /*
        method to check stock to make sure we could fulfill the order, If true, respond to Customer
        to let them buy the rolls and so we can record the order

        If false, allow them to use their respond to roll outage function.
         */

        notifyObservers("responding to order");

        boolean stockAvailable = true;

        StockStatus status = new StockStatus(true, 0);

        for(OrderItem item : newOrder.getItems()){
            //want to get stock of current roll type
            status = inventory.decrementInventory(item.roll.getKey(), item.quantity);
        }
        //if there was stock to complete the order, save order
        //System.out.println();
        //displayStock();

        if (status.getStockAvailible()){
            newOrder.setFulfilled(true);
            this.dailyOrders.add(newOrder);
            //System.out.println();
            //displayStock();
            return status;
        }
        else{

            newOrder.setFulfilled(false);
            //check to see if everything is out
            if (inventory.checkAllEmpty()){
                newOrder.setFulfilled(true);
                this.close();
            }
            return status;
        }
    }

    public boolean shouldClose() {
        boolean closeShop = true;

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
        openForBusiness = !closeShop;
        return closeShop;
    }

    public boolean isOpen() {
        return openForBusiness;
    }

    public void displayStock(){
        notifyObservers("displaying the current stock");
        System.out.println("Inventory Count: ");
        inventory.displayInventory();

    }
}
