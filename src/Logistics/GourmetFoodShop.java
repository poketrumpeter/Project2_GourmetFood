package Logistics;

//import Food.Roll;
import Food.Roll;
import Food.defaultRollFactory;

import java.util.ArrayList;

//import sun.jvm.hotspot.oops.HeapPrinter;

public class GourmetFoodShop implements Store{

    ArrayList<Order> dailyOrders;
    //ArrayList<Roll> stock;
    ArrayList<Roll> rollType = new ArrayList<>();
    int[] rollStock = new int[5];
    //Map<String, Integer> stock;
    int dayNumber;
    //String day;
    boolean openForBusiness;


    public GourmetFoodShop() {
        //this.stock = new HashMap<>();
        //this.stock.put(new jellyRoll().getType(), 30);
        //this.stock.put(new pastryRoll().getType(), 30);
        //this.stock.put(new eggRoll().getType(), 30);
        //this.stock.put(new springRoll().getType(), 30);
        //this.stock.put(new sausageRoll().getType(), 30);
        //this.dayNumber = 1;
        //this.day = "01";

        defaultRollFactory rollFactory = new defaultRollFactory();

        rollType.add(rollFactory.createRoll("jelly"));
        rollType.add(rollFactory.createRoll("pastry"));
        rollType.add(rollFactory.createRoll("egg"));
        rollType.add(rollFactory.createRoll("spring"));
        rollType.add(rollFactory.createRoll("sausage"));

        rollStock[0] = 30;
        rollStock[1] = 30;
        rollStock[2] = 30;
        rollStock[3] = 30;
        rollStock[4] = 30;

        openForBusiness = true;
        //this.rollType = {"jelly", "pastry", "egg", "spring", "sausage"};
        //this.rollStock = {30, 30, 30, 30, 30};
        //this.dayNumber = 1;
    }

    @Override
    public void open(int day) {
        this.dayNumber = day;

        //if the day isn't the first day, check to restock
        if(day != 1) {
            //loop through stocks
            for(int i = 0; i < 5; i++) {
                //if that roll type is out of stock
                if(rollStock[i] == 0) {
                    //restock
                    rollStock[i] = 30;
                }
            }
        }
    }


    //dont think we need this
    @Override
    public void close() {
        openForBusiness = false;
    }

    @Override
    public void respondToOrder(Order newOrder) {
        /*
        method to check stock to make sure we could fulfill the order, If true, respond to Customer
        to let them buy the rolls and so we can record the order
        If false, allow them to use their respond to roll outage function.
         */


        //boolean stockAvailable = false;
        for(Roll currentRoll: newOrder.getRolls()){
            //index of rollType to rollStock
            int index = -1;
            for(int i = 0; i < rollType.size(); i++) {
                if(rollType.get(i).getType().equals(currentRoll.getType())) {
                    index = i;
                }
            }
            //want to get stock of current roll type
            //if(this.rollStock.get(currentRoll.getType()) != 0){
            if(this.rollStock[index] != 0){
                //Roll is in stock
                System.out.println("In Stock");
                // daily Order being updated
                //dailyOrders.add();
                //this.rollStock.computeIfPresent(currentRoll.getType(), (k, v) -> v-1);
            }
        }
        System.out.println();
        displayStock();

    }

    public void displayStock(){
        //for(Map.Entry<String, Integer> entry: this.stock.entrySet()){
        for(int i = 0; i < 5; i++) {
            System.out.println("Stock for " + rollType.get(i).getType() + ": " + rollStock[i]);
            //System.out.println("Stock for " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
