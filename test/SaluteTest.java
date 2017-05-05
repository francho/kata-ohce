import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SaluteTest {
    @Test
    public void say_buenos_dias() {
        Salute salutator = new Salute("Pepe", 6);
        assertEquals("¡Buenos días Pepe!", salutator.toString());

    }

    @Test
    public void say_buenas_tardes() {
        Salute salutator = new Salute("Manolo", 12);
        assertEquals("¡Buenas tardes Manolo!", salutator.toString());

    }

    @Test
    public void say_buenas_noches() {
        Salute salutator = new Salute("Alberto", 20);
        assertEquals("¡Buenas noches Alberto!", salutator.toString());

    }
}
