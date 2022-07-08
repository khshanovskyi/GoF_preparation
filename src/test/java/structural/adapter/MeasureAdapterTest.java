package structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MeasureAdapterTest {
    MeasureAdapter measureAdapter;

    @BeforeEach
    void setUp() {
        measureAdapter = new MeasureAdapterImpl();
    }

    @Test
    void transform() {
        Assertions.assertEquals(new Centimeter(52.0), measureAdapter.transform(new Millimeter(520), Centimeter.class));
    }
}