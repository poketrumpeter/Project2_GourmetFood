package Food;

public class springRoll extends defaultRoll{

    public springRoll() {
        super("spr", "spring roll, a special for Spring time", "spring roll");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
