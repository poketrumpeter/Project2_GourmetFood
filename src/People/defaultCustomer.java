package People;

import Food.*;

import java.util.Random;

public abstract class defaultCustomer implements Customer{

    String name;

    String type;

    public defaultCustomer(String type, String name) {

        this.name = name;
    }

    @Override
    public void arrive() { //Method for arriving at Shop. Define number of customers daily in Shop Class

    }

    Roll orderRoll(){
        //Randomly pick a Roll to add to an order
        Random rand = new Random();

        int rollChoice = rand.nextInt(5); // Randomly returns number between 0 and 4, total of 5 options

        switch (rollChoice){

            case 0:
                return orderRoll("pastry");
            case 1:
                return orderRoll("sausage");
            case 2:
                return orderRoll("jelly");
            case 3:
                return orderRoll("spring");
            case 4:
                return orderRoll("egg");

        }
        return null;
    }
    Roll orderRoll(String type){

        switch (type){
            case "pastry":
                return new pastryRoll();
            case "sausage":
                return new SausageRoll();
            case "jelly":
                return new jellyRoll();
            case "spring":
                return new springRoll();
            case "egg":
                return new eggRoll();
        }
        return null;
    }

    @Override
    public void leave() { //Method to have Customer Leave Shop. Tracking customers in the shop

    }
}
