package org.francho.katas.ohce;

import com.dodevjutsu.katas.ohce.infrastructure.console.Console;

import java.time.LocalTime;

class OhceConsoleController {

    private final Console console;

    OhceConsoleController(Console console) {
        this.console = console;
    }

    void run(String name, LocalTime time) {
        String salute = new Greet(name, time).toString();
        reply(salute);
        try {
            listenToUser();
        } catch (StopException e) {
            console.print("Adios " + name);
        }

    }

    private void listenToUser() throws StopException {
        do {
            String userInput = console.read();

            if (userInput.equals("Stop!")) {
                throw new StopException();
            }

            reply(ReplyReverse.to(userInput));
            reply(ReplyPalindrome.to(userInput));
        } while (true);
    }


    private void reply(String reply) {
        if (reply != null) {
            console.print(reply);
        }
    }


}
