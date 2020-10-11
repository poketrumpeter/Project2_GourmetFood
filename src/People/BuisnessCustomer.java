package People;

public class BuisnessCustomer extends defaultCustomer{

    public BuisnessCustomer(String name) {
        super("buisness", name);
    }

    //Buisness Customer specific method of buying Rolls
    //Will Seek to buy 2 of each type of Roll
    //Pass in collection of Roll Objects?
    //Return Bool if Order was fulfilled or not
    @Override
    public boolean buyRolls() {
        return false;
    }

    //Method to respond to Roll Outages
    //Will be called in BuyRolls

    @Override
    public void rollOutage() {

    }
}
