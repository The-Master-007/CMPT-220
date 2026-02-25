/* This application helps students with common math and time related problems 
* such as budgeting, meal swipe usage, and time until the end of the semester.
* @Author Max DeSimone
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Runs until the user stops it
        while (true) {
            showMenu();
            // Exits loops if the user types "exit"
            String inp = scan.next();
            if (inp.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                // if/elif tree
                if (Integer.parseInt(inp) > 0 && Integer.parseInt(inp) < 4) {
                    int choice = Integer.parseInt(inp);
                    // Calls functions based on the users choice
                    if (choice == 1) {
                        budget();
                    } else if (choice == 2) {
                        mealSwipeHelper();
                    } else if (choice == 3) {
                        timeToEndOfSemester();
                    }
                    // honestly this is probably doubly redundant but handles errors
                } else {
                    System.out.println("Invalid choice");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number between 1 and 3 or 'exit' to quit.");
            }
        }
    }

    /* Displays the main menu to the user
    * @param none
    * @return void
     */
    private static void showMenu() {
        System.out.println("1. Budgeting Den Dollars");
        System.out.println("2. Meal Swipe Helper");
        System.out.println("3. Time to End of Semester");
        System.out.print("Enter choice: ");
    }

    /* Calculates the average amount of money a student can spend per week to end up at $0 by the end of the semester
    * @param none
    * @return void
     */
    private static void budget() {
        System.out.print("Enter your current balance: ");
        double budget = scan.nextDouble();
        // Uses LocalDate instead of like Java.Time because thats what the autocomplete thing said
        LocalDate today = LocalDate.now();
        LocalDate end = LocalDate.of(2026, 5, 15);
        LocalDate springBreakEnd = LocalDate.of(2026, 3, 22);

        long weeks = today.until(end, ChronoUnit.WEEKS);
        // Subtract a week if we are before spring break's end to compensate for not spending money
        if (today.isBefore(springBreakEnd)) {
            weeks--;
        }
        // Calculates the average budget usage to deplete the balance to 2 decimal places
        double avgBudget = budget / weeks;
        System.out.printf("You can spend $%.2f per week until the end of the semester.\n", avgBudget);
    }

    /* Shows how many meal swipes a student can use per day to last until the end of the semester   
    * @param none
    * @return void
     */
    private static void mealSwipeHelper() {
        System.out.print("Enter the number of meal swipes you have: ");
        int swipes = scan.nextInt();
        // Reuses the same logic from the other function
        // TODO actually calculate for spring break
        LocalDate today = LocalDate.now();
        LocalDate end = LocalDate.of(2026, 5, 15);
        LocalDate springBreakEnd = LocalDate.of(2026, 3, 22);

        long days = today.until(end, ChronoUnit.DAYS);
        int swipesPerDay = (int) Math.ceil((double) swipes / days);
        System.out.println("You should use " + swipesPerDay + " meal swipes per day to last until the end of the semester.");
    }

    /* Calculates the number of days until the end of the semester    
    * @param none
    * @return void
     */
    private static void timeToEndOfSemester() {
        LocalDate today = LocalDate.now();
        LocalDate end = LocalDate.of(2026, 05, 15);
        System.out.println(today.until(end, ChronoUnit.DAYS) + " days until the end of the semester!");
    }
}
