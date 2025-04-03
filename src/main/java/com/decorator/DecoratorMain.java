package com.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        BasePizza basePizza= new Mushroom(new ExtraCheese(new Margerita()));
        System.out.println("cost of your pizza is : "+basePizza.cost());
    }
}
