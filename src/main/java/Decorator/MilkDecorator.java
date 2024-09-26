package Decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " milk ";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }
}
