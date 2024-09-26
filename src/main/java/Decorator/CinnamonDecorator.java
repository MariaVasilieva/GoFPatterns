package Decorator;

public class CinnamonDecorator extends CoffeeDecorator{
    public CinnamonDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " Cinnamon";
    }
    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }
}
