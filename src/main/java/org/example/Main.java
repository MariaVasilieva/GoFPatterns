package org.example;


import Decorator.*;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        Coffee coffeeWithMilk = new MilkDecorator(coffee);
        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println(coffeeWithMilkAndSugar.getDescription());
        System.out.println(coffeeWithMilkAndSugar.getPrice());

        Coffee coffee1 = new SugarDecorator(new SimpleCoffee());
        System.out.println(coffee1.getDescription());
        System.out.println(coffee1.getPrice());
    }
}