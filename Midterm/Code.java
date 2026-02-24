/* budgeting
* meal swipe helper
* time to end of semester
* persistent storage of todos
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (true) { 
        showMenu();
        String inp = scan.next();
        if (inp.equalsIgnoreCase("exit")) {
            break;
        }
        if (Integer.parseInt(inp) > 0 && Integer.parseInt(inp) < 4) {
            int choice = Integer.parseInt(inp);
            if (choice == 1) {
                Budget();
            } else if (choice == 2) {
               // MealSwipeHelper();
            } else if (choice == 3) {
                 timeToEndOfSemester();
            }
        } else {
                System.out.println("Invalid choice");
        }
        }
        /* 
        int choice = scan.nextInt();
        if (choice == 1) {
            Budget();
        } else if (choice == 2) {
           // MealSwipeHelper();
        } else if (choice == 3) {
             timeToEndOfSemester();
        } else {
                System.out.println("Invalid choice");
        }
        */
    }
}

    private static void showMenu() {
        System.out.println("1. Budgeting");
        System.out.println("2. Meal Swipe Helper");
        System.out.println("3. Time to End of Semester");
        System.out.print("Enter choice: ");
    }

    private static void Budget() {
        System.out.print("Enter your current balance: ");
        double budget = scan.nextDouble();

        LocalDate today = LocalDate.now();
        LocalDate end = LocalDate.of(2026, 5, 15);
        LocalDate springBreakEnd = LocalDate.of(2026, 3, 22);

        long weeks = today.until(end, ChronoUnit.WEEKS);
        // Subtract a week if we are before spring break's end to compensate for not spending money
        if (today.isBefore(springBreakEnd)) {
            weeks--;
        }
        double avgBudget = budget / weeks;
        System.out.printf("You can spend $%.2f per week until the end of the semester.\n", avgBudget);
    }
    
    private static void timeToEndOfSemester()
    {
        LocalDate today = LocalDate.now();
        LocalDate end = LocalDate.of(2026,05, 15);
        System.out.println(today.until(end, ChronoUnit.DAYS) + " days until the end of the semester!");
    }
}
