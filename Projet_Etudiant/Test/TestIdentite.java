import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIdentite {

    private Identite id;

    @BeforeEach
    public void setup() {
        id = new Identite("1", "Walczak", "Dimitri");
    }


    @Test
    public void test_01_constructeur() {
        assertEquals("1", id.getNIP());
        assertEquals("Walczak", id.getNom());
        assertEquals("Dimitri", id.getPrenom());
    }
}
