import Logistics.Announcer;
import Logistics.GourmetFoodShop;
import Logistics.Order;
import Logistics.StockStatus;
import People.BusinessCustomer;
import People.CasualCustomer;
import People.CateringCustomer;
import People.Customer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
//java.util.Random;

public class MainShop {

    //public static void main(String[] args) {
    public static void main(String[] args) throws FileNotFoundException {

        //output logging
        PrintStream fileOutput = new PrintStream(new File("30dayfoodsimulation.out"));

        PrintStream originalOutput = System.out;

        System.setOut(fileOutput);

        // create instance of factory
        //defaultRollFactory rollFactory = new defaultRollFactory();

        //begin store program
        GourmetFoodShop shop = new GourmetFoodShop(); // instantiates 30 of each roll type on day 1

        float totalRevenue = 0;
        int totalOutageImpact = 0;
        int totalRollsSold = 0;

        Announcer announcer = new Announcer();

        // for loop for 30 days
        for(int i = 1; i <= 30; i++) {
            // open shop and checks to restock
            shop.addObserver(announcer);
            shop.open(i);
            System.out.println();
            System.out.println("++++++++++ Day Number: " + i + " +++++++++");
            System.out.println();

            System.out.println("Inventory Start at the start of the day: "); // prints out inventory at start of the day
            shop.displayStock();

            //customer vector with ID's given
            Vector<Integer> customers = new Vector<>();

            // random 1-12 casual customers (ID: 1), 1-3 business customers (ID: 2), 1-3 catering customers (ID: 3)
            // casual (ID: 1)
            int casualRand = (int)(Math.random() * 12 + 1); // 1-12 random casual
            for(int j = 0; j < casualRand; j++) {
                customers.add(1);
            }
            // business (ID: 2)
            int businessRand = (int)(Math.random() * 3 + 1); // 1-3 random business
            for(int j = 0; j < businessRand; j++) {
                customers.add(2);
            }
            // catering (ID: 3)
            int caterRand = (int)(Math.random() * 3 + 1); // 1-12 random catering
            for(int j = 0; j < caterRand; j++) {
                customers.add(3);
            }

            Map<String, Integer> customerRollOutages = new HashMap<>(); // number of each customers who dealt with roll outages
            customerRollOutages.put("casual", 0);
            customerRollOutages.put("business", 0);
            customerRollOutages.put("catering", 0);

            //System.out.println("customers pre shuffle: ");
            //System.out.println(customers);
            // shuffle customers out of order
            Collections.shuffle(customers);
            //System.out.println("customers post shuffle: ");
            //System.out.println(customers);

            //Order order1 = new Order(j);

            // customer orders in new shuffled order
            for(int j = 0; j < customers.size(); j++) {
                // new Order object given to store from each customer
                //System.out.println("Order Number: " + j);

                StockStatus status = new StockStatus(true, 0);

                Customer currentCustomer = new CasualCustomer("");

                if (customers.get(j) == 1) { //  create a casual customer

                    currentCustomer = new CasualCustomer(Integer.toString(i));
                }

                if (customers.get(j) == 2) { // create a business customer
                    currentCustomer = new BusinessCustomer(Integer.toString(i));

                }

                if (customers.get(j) == 3) { // catering
                    currentCustomer = new CateringCustomer(Integer.toString(i));
                }
                // implement where if customer does not get their original order, we take a note of it

                //If stocks all drop to zero, continue to next day
                if (shop.shouldClose() == true) {
                    shop.close();
                    //continue;
                }

                if (shop.isOpen()) { // checks if store is closed due to no inventory
                    System.out.println("Store is still currently open!");
                    System.out.println();
                    System.out.println("Order Number: " + j + " Customer Type: " + currentCustomer.getType() + " customer arrives at the Shop");
                    Order order1 = new Order(j);
                    currentCustomer.orderItems(order1); // order1 should get overwritten
                    //While loop for when order is not fulfilled

                    while (!order1.isFulfilled()) {
                        status = shop.respondToOrder(order1);

                        if (!status.getStockAvailible()) {
                            //need to roll outage
                            currentCustomer.rollOutage(order1, status);

                            String customerType = currentCustomer.getType();
                            customerRollOutages.replace(customerType, customerRollOutages.get(customerType) + 1);
                            totalOutageImpact++;
                        }

                        System.out.println("Order: ");
                        order1.displayOrder();
                        System.out.println();
                        shop.displayStock();
                        totalRollsSold += order1.getNumberOfRolls();
                        totalRevenue += order1.getOrderTotal();
                    }
                }
            }

            // at the end of every day
            System.out.println("Inventory End: "); // prints out inventory at end of the day
            shop.displayStock();

            System.out.println("Customers Impacted by Outage: ");
            System.out.println("Casual:   " + customerRollOutages.get("casual"));
            System.out.println("Business: " + customerRollOutages.get("business"));
            System.out.println("Catering: " + customerRollOutages.get("catering"));

            System.out.println("------------------");
            shop.removeObserver(announcer);
        }
        // at the end of 30 days
        System.out.println("Total Number of Rolls Sold:          " + totalRollsSold);
        System.out.print("Total Revenue:                         ");
        System.out.printf("%.2f", totalRevenue);
        System.out.println();
        System.out.println("Total Number of Roll Outage Impacts: " + totalOutageImpact);

    }
}
