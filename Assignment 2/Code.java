//always start with importing our scanner so we can use it!

import java.util.Scanner;

public class Code {
// Max DeSimone - CS Major, possibly Cyber minor, IS/IT minors obv

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        String ans;

        System.out.println("Welcome to my quiz. You will have 5 questions to answer.");

        System.out.println("Question 1:");
        System.out.println("What is my favorite color?");
        ans = sc.nextLine();
        // I had to remember to use .equals() and not == for string comparison
        if (ans.toUpperCase().equals("RED")) {
            // Increment score if correct
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The correct answer is Red.");
        }
        System.out.println("");

        System.out.println("Question 2:");
        System.out.println("What state was I born in?");
        // This is tricky since its neither here nor where I grew up
        ans = sc.nextLine();
        if (ans.toUpperCase().equals("ARIZONA")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The correct answer is Arizona.");
        }
        System.out.println("");

        System.out.println("Question 3");
        System.out.println("What rank did I achieve in Scouting?");
        ans = sc.nextLine();
        if (ans.toUpperCase().startsWith("EAGLE")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The correct answer is Eagle Scout.");
        }
        System.out.println("");

        System.out.println("Question 4:");
        System.out.println("What is my favorite video game?");
        ans = sc.nextLine();
        if (ans.toUpperCase().equals("MINECRAFT")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The correct answer is Minecraft.");
        }
        System.out.println("");

        System.out.println("Question 5:");
        System.out.println("Does this CS major have a girlfriend?");
        ans = sc.nextLine();
        if (ans.toUpperCase().startsWith("Y")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! We've been together for 3 years now.");
        }
        System.out.println("");

        double percent = (double) score / 5;
        // The autocomplete here actually taught me how to escape % in printf
        // I thought that you would do \% like \" for quotes, but it is %%
        System.out.printf("You got %d out of 5 correct. That's a %.2f%%.%n", score, percent * 100);
        sc.close();
        /* I liked this intro to scanners and handling user input. Looking back, I only
        * realized that I needed to use .equals() once I started testing, and should have
        * caught that before. Also, I think it would be best abstracted to a method where you can
        * code the question, the answer, and the score variable to increment if correct and then
        * just call that method 5 times with different parameters.
         */
    }
}
