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
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNum = false;
        boolean hasSpecial = false;
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
            
        if (pass.length() >= 10 && score >= 3)
            return "Strong";
        if (pass.length() >= 8 && score == 2)
            return "Decent";
        if (pass.length() >= 6 && score == 1)
            return "Bad";
        return "Horrible";
    }
}
