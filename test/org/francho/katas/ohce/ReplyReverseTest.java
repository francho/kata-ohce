package org.francho.katas.ohce;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplyReverseTest {
    @Test
    public void reverse_the_input() {
        assertEquals("ohce", ReplyReverse.to("echo"));
    }
}