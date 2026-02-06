/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scan.nextLine();
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
        scan.close();
        /* Basically this takes in a string from the user and stores it as an input.
        * Then, it prints the Character at each index of the string. Chars are like the 
        * individual letters of a string. When you compare strings you are looking at the char index
        * in the ASCII table, but in this case it just gives you 'H' in "Hello" and 'e' and so on.
         */
    }
}
