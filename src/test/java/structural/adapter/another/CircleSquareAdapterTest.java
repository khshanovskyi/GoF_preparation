package structural.adapter.another;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleSquareAdapterTest {

    @Test
    void transform() {
        assertEquals(new Circle(50), CircleSquareAdapter.transform(new Square(100)));
    }
}