package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class PiefPoefPaf {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = keyboard.nextInt();
        int count = 0;
        boolean repeat = true;

        if (number <= 250) {
            System.out.println( "PIEF");
        } else if (number <= 500) {
            System.out.println( "POEF");
        } else if (number <= 1000) {
            System.out.println("PAF");
        }else{
            System.out.println("Enter your number");
        }


    }

}


