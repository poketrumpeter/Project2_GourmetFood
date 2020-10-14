import Logistics.GourmetFoodShop;
import Logistics.Order;
import Logistics.StockStatus;
import People.BuisnessCustomer;
import People.CasualCustomer;
import People.CateringCustomer;
import People.Customer;

import java.util.Collections;
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
            System.out.println();
            System.out.println("++++++++++ Day Number: " + i + " +++++++++");
            System.out.println();


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
                System.out.println("Order Number: " + j);

                StockStatus status = new StockStatus(true, 0);

                Customer currentCustomer = new CasualCustomer("");

                if(customers.get(j) == 1) { //  create a casual customer

                    currentCustomer = new CasualCustomer(Integer.toString(i));
                }

                if(customers.get(j) == 2) { // create a business customer
                    currentCustomer = new BuisnessCustomer(Integer.toString(i));

                }

                if(customers.get(j) == 3) { // catering
                    currentCustomer = new CateringCustomer(Integer.toString(i));
                }
                // implement where if customer does not get their original order, we take a note of it
                // implement where if stocks all drop to zero, continue to next day

                System.out.print("A new " + currentCustomer.getType() + " customer arrives at the Shop");
                Order order1 = new Order(j);
                currentCustomer.orderItems(order1); // order1 should get overwritten
                //While loop for when order is not filfilled

                while (!order1.isFulfilled()){
                    status = shop.respondToOrder(order1);

                    if(!status.getStockAvailible()){
                        //need to roll outage
                        currentCustomer.rollOutage(order1, status);
                    }

                }
            }
        }


    }
}
