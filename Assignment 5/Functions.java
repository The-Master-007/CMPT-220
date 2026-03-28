import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scan.next();
        System.out.println("Your password is " + passwordChecker(password));
    }
    
    public static String passwordChecker(String pass)
    {
        //Conditions that a good password will have
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNum = false;
        boolean hasSpecial = false;
        //Trying to replicate the in [a,b,c] from python
        String specials = "!@#$%^&*";
        
        for (int i = 0; i < pass.length(); i++)
        {
            char c = pass.charAt(i);
            if (Character.isUpperCase(c))
                hasUpper = true;
            if (Character.isLowerCase(c))
                hasLower = true;
            if (Character.isDigit(c))
                hasNum = true;
            //I asked ChatGPT how I could get something similar to python
            if (specials.indexOf(c) != -1)
                hasSpecial = true;
        }
        
        int score = 0;
        if (hasUpper)
            score++;
        if (hasLower)
            score++;
        if (hasNum)
            score++;
        if (hasSpecial)
            score++;
        //My only add-on would be to make it tell you WHAT you did wrong
        //right now if you are 1 character length off even if you have all 4
        //you still get deducted, so a system to dynamically offer help
        if (pass.length() >= 10 && score >= 3)
            return "Strong";
        if (pass.length() >= 8 && score == 2)
            return "Decent";
        if (pass.length() >= 6 && score == 1)
            return "Bad";
        return "Horrible";
    }
}
