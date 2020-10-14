package Logistics;

import Food.*;
import People.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GourmetFoodShop implements Store{

    Map<String, Order> customerOrders;
    ArrayList<Order> dailyOrders;
    Inventory inventory;
    int dayNumber;
    int totalRevenue;
    int springSales;
    int eggSales;
    int pastrySales;
    int sausageSales;
    int jellySales;
    int rollSales;
    int impactedOrders;

    public GourmetFoodShop() {
        inventory = new Inventory(new HashMap<>());
        inventory.addInventory(new jellyRoll(), 30);
        inventory.addInventory(new SausageRoll(), 30);
        inventory.addInventory(new eggRoll(), 30);
        inventory.addInventory(new pastryRoll(), 30);
        inventory.addInventory(new springRoll(), 30);


        this.customerOrders = new HashMap<>();
        this.dailyOrders = new ArrayList<>();
        this.dayNumber = 1;
    }

    @Override
    public void open() {
	//clear dailyOrder array to reset it for the day
	
	//part of observer, print out day number

	//part of observer, print out starting roll stock
	
    }

    @Override
    public void close() {
        //Close the shop and increment the day
        dayNumber++;

	//for observer, loop through daily orders to print info

	//part of observer, print out roll inventory

	//part of observer, print out total payment by customer type

	//part of observer, print out number of orders affected by an outage ny customer type



	//*print inventory orders by rolls type

    }

    @Override
    public void respondToOrder(Order newOrder) {

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

	//print out order details

        System.out.println();
        displayStock();
    }

    public void displayStock(){
        inventory.displayInventory();
    }
}
