//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Trivia Game

        The three questions:
        1. Are you a Human? / Correct answer: Yes.
        2. What is the somma of 20 + 1? / Correct answer: 21.
        3. Did you like this game? / Correct answer: Yes.
         */

        // Variable below:

        String start;
        String start2;
        String q1;
        String q12;
        String q13;
        String q2;
        String q21;
        String q3;
        String seescore;


        // Switch below:
        int score = 0;




        // Game below:

        Scanner scanner = new Scanner(System.in);

        // Start:

        System.out.println("Hello World! Ready for the game? ");
        start = scanner.next();
        if (start.equalsIgnoreCase("Yes")) {
            System.out.println("So, let's start!");
        } else {
            System.out.println("Need more time?");
            start2 = scanner.next();
            if (start2.equalsIgnoreCase("No")) {
                System.out.println("So, let's go!");
            } else if (start2.equalsIgnoreCase("Yes")) {
                System.out.println("So, okay, see you in the next time!");
                System.exit(0);
            }
        }

        // First Question

        System.out.println("Okay, okay, our first question is kind a simple!");
        System.out.println("Are you a human?");
        q1 = scanner.next();
        if (q1.equalsIgnoreCase("Yes")) {
            System.out.println("Perfectly, I already know that");
            score++;
        } else {
            System.out.println("Whaaaat, wait, this is a problem...");
            System.out.println("Because this game is only made for humans...");
            System.out.println("You want to try one more time?");
            q12 = scanner.next();
            if (q12.equalsIgnoreCase("Yes")) {
                System.out.println("Okay let's try:");
                System.out.println("Are you a human?");
                q13 = scanner.next();
                if (q13.equalsIgnoreCase("Yes")) {
                    System.out.println("Perfectly, I already know that");
                }
            } else {
                System.out.println("The correct answer is: Yes");
            }

        }

        // Second Question

        System.out.println("Okay, you are a human, but you need to prove it!");
        System.out.println("Only a human will know that!!!!");
        System.out.println("What is the somma of 20 + 1?");
        q2 = scanner.next();
        if (q2.equals("21")) {
            System.out.println("Perfectly, I'll assume that you are a big brain human");
            score++;
        } else {
            System.out.println("Ahaaa, I know that you are not a human!");
            System.out.println("Because this game is only made for humans!");
            System.out.println("You want to try one more time?");
            q12 = scanner.next();
            if (q12.equalsIgnoreCase("Yes")) {
                System.out.println("Okay let's try:");
                System.out.println("How much this is be? 20 + 1?");
                q21 = scanner.next();
                if (q21.equals("21")) {
                    System.out.println("Perfectly, I'll assume that you are a big brain human");
                } else {
                    System.out.println("The correct answer is: 21");
                }
            }

        }

        // Third Question

        System.out.println("After all this AAA gameplay, tell me, but be completely sincerely");
        System.out.println("Did you like this game? :3");
        q3 = scanner.next();
        if (q3.equalsIgnoreCase("Yes")) {
            System.out.println("Good for you, I has even trying..");
            System.out.println("Wait..");
            System.out.println("Did you said YES?");
            System.out.println("I LOVE U TOO");
            score++;
        } else {
            System.out.println("Wrooong answer, sorry babe! The correct answer is: Yes!");
        }



        System.out.println("Let's see your pontuation?");
        seescore = scanner.next();
        if (seescore.equalsIgnoreCase("Yes")) {
            System.out.println("Your pontuation is: " + score);
        } else {
            System.out.println("This time you don't have option :D, your pontuation is: " + score);
        }

        switch(score) {
            case 3: System.out.println("GOLD MEDAL"); break;
            case 2: System.out.println("SILVER MEDAL"); break;
            case 1: System.out.println("BRONZE MEDAL"); break;
            default: System.out.println("NO MEDAL"); break;
        }

        scanner.close();
    }
}