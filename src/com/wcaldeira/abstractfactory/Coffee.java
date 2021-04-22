package com.wcaldeira.abstractfactory;

public class Coffee implements IHotDrink{
    @Override
    public void consume() {
        System.out.println("This coffe is delicious.");
    }
}
