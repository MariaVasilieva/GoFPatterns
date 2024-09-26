package Decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " sugar ";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 0.2;
    }
}
