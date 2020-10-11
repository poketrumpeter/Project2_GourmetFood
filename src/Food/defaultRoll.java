package Food;

public abstract class defaultRoll implements Roll{

    int stock;
    String type;

    public defaultRoll(String type) {
        this.stock = 30;
        this.type = type;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public String getType() {
        return type;
    }

    //When a roll is ordered, need a function to make a role and have it sold
    //Function to call when making and selling rolls -- Returns the Cost for the specific Roll Order
    int makeSell(int amount){
        return 0;
    }

    //Function to call to add extras, Will be the same for all Rolls
    public abstract void addExtras();

    //FUnction to order more inventory for restock
    void newInventory(){

    }



}
