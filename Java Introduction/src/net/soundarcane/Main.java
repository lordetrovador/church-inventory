package net.soundarcane;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Data Types
        /* Numerical Types
        int aNumber = 42
        float aFloatingNumber = 13.37
        double aDoubleNumber = 420.0005

        byte tinyNumber = 100 // store numbers from [-128 to 127]
        short smallNumber = 30000 // store numbers from [-32,768 to 32,767]]
        long longerNumber = 50000000 // store number from [-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807]

        Booleans // for Logic purposes

        boolean [name of the class] = [true or false]

        / Comparison Operators
        > >= == != < <=

        /some examples
         */
        /* int yourPontuation = 100;

        boolean passedPlayers = yourPontuation >= 50;
        System.out.println("Você com " + yourPontuation + " pontos, conseguiu passar no teste? " + passedPlayers);

        boolean bigbrainPlayer = yourPontuation >= 95;
        System.out.println("Você faz parte dos seletos cérebros inchados? " + bigbrainPlayer);
         */

        /* IF AND ELSE STATEMENTS

        int exam1 = 61;
        int exam2 = 51;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your exam 1 score: ");
        exam1 = scanner.nextInt();
        System.out.println("Type your exam 2 score: ");
        exam2 = scanner.nextInt();

        if(exam1 >= 50 && exam2 >= 50) {
            System.out.println("You have passed BOTH exams!");
        } else if(exam1 < 50 && exam2 < 50) {
            System.out.println("You fave failed BOTH exams!");
        } else {
            if (exam1 >= 50) {
                System.out.println("You have passed the exam 1!");
            } else {
                System.out.println("You have failed the exam 1!");
            } if (exam1 < 0) {
                System.out.println("How did u get this negative score dude?");
            }

            if(exam2 >= 50) {
                System.out.println("You have passed the exam 2!");
            } else {
                System.out.println("You have failed the exam 2!");
            } if(exam2 < 0) {
                System.out.println("How did u get negative score man?");
            }
        }

        scanner.close();

        */

        // Switch Statement

        int medalPlacement = 1;

        switch(medalPlacement) {
            case 1: System.out.println("GOLD MEDAL"); break;
            case 2: System.out.println("SILVER MEDAL"); break;
            case 3: System.out.println("BRONZE MEDAL"); break;
            default: System.out.println("NO MEDAL"); break;
        }


    }
}