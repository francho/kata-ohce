package org.francho.katas.ohce;

import com.dodevjutsu.katas.ohce.infrastructure.console.Console;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;


public class OhceConsoleControllerTest {
    private Mockery context;
    private Console console;
    private OhceConsoleController ohce;

    @Before
    public void setUp() {
        context = new Mockery();
        console = context.mock(Console.class);

        ohce = new OhceConsoleController(console);
    }

    @Test
    public void run_in_the_morning() {
        context.checking(new Expectations() {{
            exactly(4).of(console).read();
            will(onConsecutiveCalls(
                    returnValue("hola"),
                    returnValue("oto"),
                    returnValue("stop"),
                    returnValue("Stop!")
            ));

            oneOf(console).print("¡Buenos días Pedro!");
            oneOf(console).print("aloh");
            oneOf(console).print("oto");
            oneOf(console).print("¡Bonita palabra!");
            oneOf(console).print("pots");
            oneOf(console).print("Adios Pedro");
        }});

        ohce.run("Pedro", LocalTime.of(10, 0));

        context.assertIsSatisfied();
    }
}