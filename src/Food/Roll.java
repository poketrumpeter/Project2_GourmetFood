package Food;

public interface Roll {

    //Rolls will have a cost, Type, and Stock
    String getType();

    int getStock();

    //function to keep track of cost for roll and any toppings
    double cost();

    //Function to call when making and selling rolls -- Returns the Cost for the specific Roll Order
    int makeSell(int amount);

    //Function to call to add extras, Will be the same for all Rolls
    void addExtras();

    //FUnction to order more inventory for restock
    void newInventory();

}
