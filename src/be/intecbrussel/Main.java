package be.intecbrussel;
import java.net.*;

import static be.intecbrussel.Palindrome.Palindrome1;
import static be.intecbrussel.Palindrome.Palindrome2;

public class Main {
    public static void main(String[] arg) {

        String string = new String(" 'de mooie zeeman nam anna mee zei oom ed' ");
//       String string = new String(" 'lepel' ");


//        String string = new String(" 'http://www.smartdeveloper.be ' ");

        if (Palindrome1(string))
            System.out.println("The string: " + string + " is a palindrome of type 1.");
        else
            System.out.println("The string: " + string + " is not a palindrome of type 1.");
        if (Palindrome2(string))
            System.out.println("The string: " + string + " is a palindrome of type 2.");
        else
            System.out.println("The string: " + string + " is not a type 2 palindrome.");
           if(string.contains("http://"))
           System.out.println("The string " + string +" is a Url.");

           else
           System.out.println("The string: " + string +" is not a Url.");
    }

}
