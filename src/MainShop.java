import Logistics.GourmetFoodShop;
import Logistics.Order;
import People.BuisnessCustomer;
import People.CasualCustomer;
import People.CateringCustomer;
import People.Customer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
//java.util.Random;

public class MainShop {

    //public static void main(String[] args) {
    public static void main(String[] args) { // throws FileNotFoundException {

        //output logging
        //PrintStream originalOutput = System.out;
        //PrintStream fileOutput = new PrintStream("30dayfoodsimulation.out");

        //System.setOut(fileOutput);

        // create instance of factory
        //defaultRollFactory rollFactory = new defaultRollFactory();

        //begin store program
        GourmetFoodShop shop = new GourmetFoodShop(); // instantiates 30 of each roll type on day 1

        // for loop for 30 days
        for(int i = 1; i <= 30; i++) {
            // open shop and checks to restock
            shop.open(i);
            System.out.println("------------------");
            System.out.println("Day Number: " + i);
            System.out.println();

            System.out.println("Inventory Start: "); // prints out inventory at start of the day
            shop.displayStock();

            Map<String, Integer> customerRollOutages = new HashMap<String, Integer>(); // number of each customers who dealt with roll outages
            customerRollOutages.put("casual", 0);
            customerRollOutages.put("business", 0);
            customerRollOutages.put("cater", 0);

            //customer vector with ID's given
            Vector<Integer> customers = new Vector<>();

            // random 1-12 casual customers (ID: 1), 1-3 business customers (ID: 2), 1-3 catering customers (ID: 3)
            // casual (ID: 1)
            int casualRand = (int)(Math.random() * 12 + 1); // 1-12 random casual
            for(int j = 0; j < casualRand; j++) {
                customers.add(1);
            }
            // business (ID: 2)
            int businessRand = (int)(Math.random() * 3 + 1); // 1-12 random casual
            for(int j = 0; j < businessRand; j++) {
                customers.add(2);
            }
            // catering (ID: 3)
            int caterRand = (int)(Math.random() * 3 + 1); // 1-12 random casual
            for(int j = 0; j < caterRand; j++) {
                customers.add(3);
            }

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
                System.out.println("--------");
                System.out.println("Order Number: " + j);

                if(shop.shouldClose() == true) {
                    continue;
                }

                if(customers.get(j) == 1) { // casual
                    Order order1 = new Order(j);
                    Customer casual = new CasualCustomer(Integer.toString(i));
                    casual.orderItems(order1);
                    //shop.respondToOrder(order1);

                    boolean done = false;
                    done = shop.respondToOrder(order1);

                    if(done == false) {
                        casual.rollOutage(); // order1 should get overwritten somehow
                        customerRollOutages.replace("casual", customerRollOutages.get("casual")+1);
                    }
                    // prints out final order of rolls
                    System.out.println("Order: ");
                    order1.displayOrder();
                }

                if(shop.shouldClose() == true) {
                    continue;
                }

                if(customers.get(j) == 2) { // business
                    Order order1 = new Order(j);
                    Customer business = new BuisnessCustomer(Integer.toString(i));
                    business.orderItems(order1); // order1 should get overwritten
                    //shop.respondToOrder(order1);

                    boolean done = false;
                    done = shop.respondToOrder(order1);

                    if(done == false) {
                        business.rollOutage(); // order1 should get overwritten somehow
                        customerRollOutages.replace("business", customerRollOutages.get("business")+1);
                    }
                }

                if(shop.shouldClose() == true) {
                    continue;
                }

                if(customers.get(j) == 3) { // catering
                    Order order1 = new Order(j);
                    Customer cater = new CateringCustomer(Integer.toString(i));
                    cater.orderItems(order1); // order1 should get overwritten
                    shop.respondToOrder(order1);

                    boolean done = false;
                    done = shop.respondToOrder(order1);

                    if(done == false) {
                        cater.rollOutage(); // order1 should get overwritten somehow
                        customerRollOutages.replace("cater", customerRollOutages.get("cater")+1);
                    }
                }
                // implement where if stocks all drop to zero, continue to next day
                // implement output file
            }

            System.out.println("Inventory End: "); // prints out inventory at end of the day
            shop.displayStock();

            System.out.println("Total Revenue: "); // IMPLEMENT

            System.out.println("Customers Impacted by Outage: ");
            System.out.println("Casual:   " + customerRollOutages.get("casual"));
            System.out.println("Business: " + customerRollOutages.get("business"));
            System.out.println("Catering: " + customerRollOutages.get("cater"));

            System.out.println("------------------");

            // implement where if customer does not get their original order, we take a note of it

            /*
            for (Map.Entry<String, Object> entry : customerRollOutages.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue().toString());
            }
            */
        }
    }

}
