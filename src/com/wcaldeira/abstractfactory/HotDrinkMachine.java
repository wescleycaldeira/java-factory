package com.wcaldeira.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class HotDrinkMachine {

    public enum AvailableDrink{
        COFFEE,
        TEA
    }

    private Map<AvailableDrink, IHotDrinkFactory> factories = new HashMap<>();

    public HotDrinkMachine() throws Exception{
        for (AvailableDrink drink : AvailableDrink.values()) {
            String s = drink.toString();
            String factoryName = "" + Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
            Class<?> factory = Class.forName("com.wcaldeira.abstractfactory." + factoryName + "Factory");
            factories.put(drink, (IHotDrinkFactory) factory.getDeclaredConstructor().newInstance());
        }
    }

    public IHotDrink makeDrink(AvailableDrink drink, int amount){
        return factories.get(drink).prepare(amount);
    }

}
