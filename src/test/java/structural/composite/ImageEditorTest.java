package structural.composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImageEditorTest {

    private List<Graphic> graphics;
    private ImageEditor ie;

    @BeforeEach
    void setUp() {
        graphics = List.of(new Dot(55,55), new Circle(66,66,33));
        ie = new ImageEditor();
    }

    @Test
    void test() {
        ie.load();
        ie.groupSelected(graphics);
    }
}