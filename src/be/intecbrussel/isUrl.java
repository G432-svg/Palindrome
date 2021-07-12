package be.intecbrussel;

import java.net.URL;

public class isUrl {
    public static boolean isURL(String possibleURL) {

        boolean result = false;

        try {
            URL url = new URL(possibleURL);

            result = true;

        } catch (Exception e) {
        }

        return result;
    }

}
