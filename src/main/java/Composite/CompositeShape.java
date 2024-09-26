package Composite;

import java.util.ArrayList;

public class CompositeShape implements Shape {
    private ArrayList<Shape> shapes;
    public CompositeShape() {
        shapes = new ArrayList<>();
    }
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }
    @Override
    public void draw() {
        System.out.println("Composite Shape");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
