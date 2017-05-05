import Palindromo.Palindromo;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PalindromoTest {

    @Test
    public void probarPalindromo(){
        Palindromo p = new Palindromo("oco");
        assertEquals("Bonita palabra",p.toString());
    }
}
