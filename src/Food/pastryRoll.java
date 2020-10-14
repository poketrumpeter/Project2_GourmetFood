package Food;

public class pastryRoll extends defaultRoll{

    public pastryRoll() {
        super("pas", "Roll stuffed with Icing and smothered with specialty creme",
                "pastry roll");
    }

    @Override
    public double cost() {
        return 3.29;
    }
}
