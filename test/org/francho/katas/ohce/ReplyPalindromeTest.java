package org.francho.katas.ohce;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReplyPalindromeTest {
    @Test
    public void identify_palindromes() {
        assertEquals("¡Bonita palabra!",ReplyPalindrome.to("oto"));
    }

    @Test
    public void ignore_others() {
        assertNull(ReplyPalindrome.to("echo"));
    }
}
