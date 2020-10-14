package Logistics;

import Food.Extras;

public interface Store {

    void open(int day); //Specific Method to open the store

    void close(); ///Method to close the store for the day

    //Function to make rolls based on an order
    StockStatus respondToOrder(Order newOrder);

    //void addItem(String customerId, String typeOfRoll, int quantity, Extras extras);

}
