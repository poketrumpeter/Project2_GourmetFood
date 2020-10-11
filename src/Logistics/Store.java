package Logistics;

public interface Store {

    void open(); //Specific Method to open the store

    void close(); ///Method to close the store for the day

    //Function to make rolls based on an order
    void respondToOrder(Order newOrder);

}
