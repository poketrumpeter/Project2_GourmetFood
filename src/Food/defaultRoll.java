package Food;

import Food.Factories.ExtrasFactory;

public abstract class defaultRoll implements Roll{

    String key;
    String name;
    String description;
    ExtrasFactory extrasFactory;

    public defaultRoll(String key, String description, String name, ExtrasFactory extrasSelector) {

        this.name = name;
        this.key = key;
        this.description = description;
        this.extrasFactory = extrasSelector;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public ExtrasFactory getExtrasFactory() {
        return extrasFactory;
    }





}
