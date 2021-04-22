package com.wcaldeira.abstractfactory;

public class Demo {

    public static void main(String[] args) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();
        final IHotDrink tea = machine.makeDrink(HotDrinkMachine.AvailableDrink.TEA, 3);
        tea.consume();
    }

}
