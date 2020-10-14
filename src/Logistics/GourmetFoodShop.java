package Logistics;


import Food.*;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//import sun.jvm.hotspot.oops.HeapPrinter;

public class GourmetFoodShop implements Store, Subject{

  
    Inventory inventory;
    ArrayList<Order> dailyOrders;
    int dailyCustomers;
    public int dayNumber;
    String day;
    int numOrders;
    public boolean openForBusiness;
    int totalRevenue;
    int springSales;
    int eggSales;
    int pastrySales;
    int sausageSales;
    int jellySales;
    int rollSales;
    int impactedOrders;
    //Part of Observer Design Pattern implementation
    private List<Observer> observer_list = new ArrayList<Observer>();

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
        this.totalRevenue = 0;
        this.springSales = 0;
        this.eggSales = 0;
        this.pastrySales = 0;
        this.sausageSales = 0;
        this.jellySales = 0;
        this.rollSales = 0;
        this.impactedOrders = 0;
    }
    //Part of Observer Design Pattern implementation
    public void registerObserver(Observer observer)
    {
        observer_list.add(observer);		
    }

    //Part of Observer Design Pattern implementation
    public void removeObserver(Observer observer)
    {
        observer_list.remove(observer);		
    }

    //Part of Observer Design Pattern implementation
    public void notifyObservers(String message)
    {
        for (Observer observer : observer_list) 
        {
           observer.update(message);
        }
     }

    @Override
    public void open(int day) {

	//need to clear dailyOrders array

	//Part of Observer Design Pattern implementation
	String dayString = String.valueOf(day);
        String message = "Day Number "+ dayString + "\n";
        this.notifyObservers(message);


        this.dayNumber = day;

        //if the day isn't the first day, check to restock
        if(day != 1) {

            //Inventory method for checking each Items stock making sure if its 0, restock it
            inventory.checkEmpty();

        }

    }


    @Override
    public void close() {
	//have to go through loop of daily orders and display various info at end of day

        //Close the shop and increment the day and replenish stock if it is out
        dayNumber = dayNumber + 1;
    }

    @Override
    public StockStatus respondToOrder(Order newOrder) {

        /*
        method to check stock to make sure we could fulfill the order, If true, respond to Customer
        to let them buy the rolls and so we can record the order

        If false, allow them to use their respond to roll outage function.
         */

        boolean stockAvailable = true;

        StockStatus status = new StockStatus(true, 0);

        for(OrderItem item : newOrder.getItems()){
            //want to get stock of current roll type
            status = inventory.decrementInventory(item.roll.getKey(), item.quantity);
        }
        //if there was stock to complete the order, save order
        System.out.println();
        displayStock();

        if (status.getStockAvailible()){
            this.dailyOrders.add(newOrder);
            return status;
        }
        else{//case that order wasnt filled?
            return status;
        }
    }

    public void displayStock(){
        inventory.displayInventory();

    }
}
