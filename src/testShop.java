import Food.*;
import Logistics.GourmetFoodShop;
import Logistics.Order;
import Logistics.Store;
import People.BuisnessCustomer;
import People.CasualCustomer;
import People.CateringCustomer;
import People.Customer;

public class testShop {

    public static void main(String[] args) {


//        Roll jelly = new jellyRoll();
//        Roll pastry = new pastryRoll();
//
//
//        System.out.println(jelly.getName());
//        System.out.println(jelly.cost());
//
//        jelly = new extraFilling(jelly);
//        jelly = new extraSauce(jelly);
//        jelly = new extraTopping(jelly);
//
//        System.out.println(jelly.getName());
//        System.out.println(String.format("%.2f ", jelly.cost()));
//
//
//
        Customer tim = new CasualCustomer("Tim");
        Customer Chloe = new BuisnessCustomer("Chloe");
        Customer Artemis = new CateringCustomer("Artemis");

        Order order1 = new Order(101);
        Order order2 = new Order(102);
        Order order3 = new Order(103);
        Store newStore = new GourmetFoodShop();

        tim.orderItems(order1);
        Chloe.orderItems(order2);
        Artemis.orderItems(order3);

        order1.displayOrder();
        newStore.respondToOrder(order1);

        order2.displayOrder();
        newStore.respondToOrder(order2);

        //order3.displayOrder();
    }
}
