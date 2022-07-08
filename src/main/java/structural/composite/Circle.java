package structural.composite;

public class Circle extends Dot{
    private int radius;


    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle with radius " + radius);
    }
}
