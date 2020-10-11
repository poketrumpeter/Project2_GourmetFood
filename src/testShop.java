import Food.Roll;
import Food.extraFilling;
import Food.jellyRoll;
import Food.pastryRoll;
import Logistics.Order;
import People.CasualCustomer;
import People.Customer;

public class testShop {

    public static void main(String[] args) {


        Roll jelly = new jellyRoll();
        Roll pastry = new pastryRoll();


        System.out.println(jelly.getType());
        System.out.println(jelly.cost());
        
        jelly = new extraFilling(jelly);

        System.out.println(jelly.getType());
        System.out.println(String.format("%.2f ", jelly.cost()));

        Customer tim = new CasualCustomer("Tim");

        Order order1 = new Order(101);
        tim.makeOrder(order1); //Will randomly choose rolls and then order Rolls

        order1.displayOrder();
    }
}
