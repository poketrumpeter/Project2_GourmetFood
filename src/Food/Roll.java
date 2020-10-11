package Food;

public interface Roll {

    //Rolls will have a cost, Type, and Stock
    String getType();

    int getStock();

    //function to keep track of cost for roll and any toppings
    double cost();

    //Function to call when making and selling rolls
    void makeSell();

    //FUnction to order more inventory for restock
    void newInventory();

}
