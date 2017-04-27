package org.francho.katas.ohce;

public class ReplyPalindrome {
    public static String to(String input) {
        String response = null;

        if(isPalindrome(input)) {
            response = "¡Bonita palabra!";
        }

        return response;
    }

    private static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}
