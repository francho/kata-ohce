package org.francho.katas.ohce;

import java.time.LocalTime;

public class Greet {
    private final String salute;

    public Greet(String name, LocalTime moment) {
        int hour = moment.getHour();

        if (hour >= 6 && hour < 12) {
            this.salute = "¡Buenos días " + name + "!";
        } else if (hour >= 12 && hour < 20) {
            this.salute = "¡Buenas tardes " + name + "!";
        } else {
            this.salute = "¡Buenas noches " + name + "!";
        }
    }

    @Override
    public String toString() {
        return salute;
    }
}
