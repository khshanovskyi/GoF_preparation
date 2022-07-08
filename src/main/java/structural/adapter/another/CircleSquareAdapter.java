package structural.adapter.another;

public class CircleSquareAdapter {

    public static Circle transform(Square square) {
        return new Circle(square.getSideLength() / 2);
    }

    public static Square transform(Circle circle) {
        return new Square(circle.getRadius() * 2);
    }
}
