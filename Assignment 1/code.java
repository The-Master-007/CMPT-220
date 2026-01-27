//always start with importing our scanner so we can use it!
import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //finish this one for me by receiving and printing the user's age back to them
        System.out.println("How old are you? ");
        String age = sc.nextLine();
        System.out.println("You are " + age + " years old.");
        //can you do some math for me? take these variables and print out the sum of them!
        int num1 = 10;
        int num2 = 37;
     
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        
        sc.close();
        /* I have done things like this in the past, but you need to make sure the 
        * scanner is using the System.in otherwise it won't work. Don't forget to close
        * the scanner, althought im sure vscode does it automatically.
         */
    }
}
