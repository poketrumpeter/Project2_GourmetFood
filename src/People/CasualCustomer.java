package People;

public class CasualCustomer extends defaultCustomer{

    public CasualCustomer(String name) {
        super("casual", name);
    }

    /*
    Casual customer method for buying rolls
    Customer will buy 1-3 Rolls of varying type
    *ASSUMPTION* 1-3 rolls of each type instead of 1-3 rolls of a sing type
    randomly choose each type of roll
     */

    @Override
    public boolean buyRolls() {
        return false;
    }

    @Override
    public void rollOutage() {

    }
}
