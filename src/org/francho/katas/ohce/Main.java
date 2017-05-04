package org.francho.katas.ohce;

import com.dodevjutsu.katas.ohce.infrastructure.console.SystemConsole;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        OhceConsoleController controller = new OhceConsoleController(new SystemConsole());
        controller.run(args[0], LocalTime.now());
    }
}
