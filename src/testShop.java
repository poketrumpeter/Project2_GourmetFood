import Food.Roll;
import Food.extraFilling;
import Food.jellyRoll;
import Food.pastryRoll;

public class testShop {

    public static void main(String[] args) {


        Roll jelly = new jellyRoll();
        Roll pastry = new pastryRoll();


        System.out.println(jelly.getType());
        System.out.println(jelly.cost());
        
        jelly = new extraFilling(jelly);

        System.out.println(jelly.getType());
        System.out.println(String.format("%.2f ", jelly.cost()));
    }
}
