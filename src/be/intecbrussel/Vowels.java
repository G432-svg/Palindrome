
package be.intecbrussel;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String string = new String("De mooie zeeman nam Anna mee zei oom Ed");
        String string1 = new String("Lepel");
        String string2 = new String("http://www.smartdeveloper.be");


        System.out.println("Enter a string ");
        String phrase = in.nextLine();

        int i, length, vowels = 0;
        int consonants = 0;
//        boolean y = false;
        String j;

        length = phrase.length();
        for (i = 0; i < length; i++) {


            j = "" + phrase.charAt(i);


            boolean isAVowel = "aeiou".contains(j.toLowerCase());
            boolean y = "y".contains(j.toLowerCase());


            if (isAVowel) {
                vowels++;
            } else if (isAVowel && y) {
                vowels++;
                consonants++;
            } else if (y && !(isAVowel)) {
                vowels++;
            } else {
                consonants++;
            }


        }
        System.out.println("The number of vowels in \"" + phrase + "\" is " + vowels + ".\n\nThe number of consonants is " + consonants + ".\n\n");

    }

}