import java.util.Scanner;
public class Main {
/*
Referencing your homework from https://github.com/melissachodziutko/CMPT-220/blob/main/Assignment%203/Debug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  /* 
    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();
      */
        System.out.print("Enter a number to find the factorial of it! ");
        int factorialInput = sc.nextInt();
        System.out.println("The factorial of " + factorialInput + " is " + factorial(factorialInput));
        System.out.print("Now give me a number to find the sum of every other number up to it! ");
        int everyOtherNumInput = sc.nextInt();
        System.out.println("The sum of every other number up to " + everyOtherNumInput + " is " + everyOtherNum(everyOtherNumInput));
        System.out.print("Give me a string to reverse! ");
        // Need to flush the buffer after adding a space to it
        sc.nextLine();
        String stringToReverse = sc.nextLine();
        System.out.println("The reverse of " + stringToReverse + " is " + reverseString(stringToReverse));

    }


    public static int factorial(int n)
    {
        int val = 1;
        for (int i = 1; i <= n; i++)
        {
            val *= i;
        }
        return val;
    }
  
    public static int everyOtherNum(int n)
    {
        int val = 0;
        for (int i = 1; i <= n; i+=2)
        {
            val += i;
        }
        return val;
    }

    public static String reverseString(String str)
    {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static int add(int zyx, int tuv){
        return(zyx + tuv);
    }

  
    public static void printDog(){
        System.out.println("Dog");
    }

  
}
