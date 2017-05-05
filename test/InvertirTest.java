import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InvertirTest {
    @Test
    public void TestInvertir() {
        Invertir invertir = new Invertir("hola");
        assertEquals("aloh",invertir.toString());

    }
}
