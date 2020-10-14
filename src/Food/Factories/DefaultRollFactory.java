package Food.Factories;

// Factory implemented (no abstract as there are no families with differences in procedures yet)

import Food.*;

public class DefaultRollFactory { //extends defaultRoll {

    // method to create new roll
    public Roll createRoll(String type) {
        if(type.equals("spring")) {
            return new springRoll();
        }
        if(type.equals("egg")) {
            return new eggRoll();
        }
        if(type.equals("pastry")) {
            return new pastryRoll();
        }
        if(type.equals("sausage")) {
            return new SausageRoll();
        }
        if(type.equals("jelly")) {
            return new jellyRoll();
        }
        return null;
    }

}