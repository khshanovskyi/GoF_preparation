package structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FacadeTest {

    @Test
    void test(){
        Facade facade = new Facade();

        assertEquals("test TEST", facade.convert(Type.WORDS_REVERSE, "TEST test"));
        assertEquals("amr AMR", facade.convert(Type.FULL_REVERSE, "RMA rma"));
        assertNotEquals("DOUBLE", facade.convert(Type.BASE_64, "DOUBLE"));
    }

}