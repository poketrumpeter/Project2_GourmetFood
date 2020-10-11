package People;

public abstract class defaultCustomer implements Customer{

    String name;

    String type;

    public defaultCustomer(String type, String name) {
        this.name = name;
    }

    @Override
    public void arrive() { //Method for arriving at Shop. Define number of customers daily in Shop Class

    }

    @Override
    public void leave() { //MEthod to have Customer Leave Shop. Tracking customers in the shop

    }
}
