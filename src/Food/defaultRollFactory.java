package Food;

// Factory implemented (no abstract as there are no families with differences in procedures yet)

public class defaultRollFactory { //extends defaultRoll {

    // method to create new roll
    public defaultRoll createRoll(String type) {
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
            return new sausageRoll();
        }
        if(type.equals("jelly")) {
            return new jellyRoll();
        }
        return null;
    }

}
