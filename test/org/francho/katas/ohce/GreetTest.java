package org.francho.katas.ohce;

import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.*;

public class GreetTest {
    @Test
    public void greetings_at_night() {
        LocalTime moment = LocalTime.of(20, 0);
        Greet actual = new Greet("Frodo", moment);

        assertEquals("¡Buenas noches Frodo!", actual.toString());
    }

    @Test
    public void greetings_at_afternoon() {
        LocalTime moment = LocalTime.of(12, 0);
        Greet actual = new Greet("Frodo", moment);

        assertEquals("¡Buenas tardes Frodo!", actual.toString());
    }

    @Test
    public void greetings_at_morning() {
        LocalTime moment = LocalTime.of(6, 0);
        Greet actual = new Greet("Frodo", moment);

        assertEquals("¡Buenos días Frodo!", actual.toString());
    }
}