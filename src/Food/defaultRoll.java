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



}
