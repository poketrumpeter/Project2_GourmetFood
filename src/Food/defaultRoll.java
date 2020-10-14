package Food;

public abstract class defaultRoll implements Roll{

    String key;
    String name;
    String description;

    public defaultRoll(String key, String description, String name) {

        this.name = name;
        this.key = key;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getKey() {
        return key;
    }





}
