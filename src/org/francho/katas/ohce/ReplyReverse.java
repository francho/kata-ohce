package org.francho.katas.ohce;

public class ReplyReverse {
    public static String to(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
