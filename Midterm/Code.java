/* budgeting
* meal swipe helper
* time to end of semester
* persistent storage of todos
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> todos = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        showMenu();
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                Budget();
                break;
            case 2:
                //      MealSwipeHelper.run();
                break;
            case 3:
                //       TimeToEndOfSemester.run();
                break;
            case 4:
                //        TodoList.run();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void showMenu() {
        System.out.println("1. Budgeting");
        System.out.println("2. Meal Swipe Helper");
        System.out.println("3. Time to End of Semester");
        System.out.println("4. Todo List");
    }

    private static void Budget() {
        System.out.println("Retreiving data from your storage...");
        loadFromFile();

        // later
        saveToFile();
    }

    private static void saveToFile() {
        try {
            PrintWriter pw = new PrintWriter("budget.txt");
            for (String todo : todos) {
                pw.println(todo);
            }
            pw.close();
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    private static void loadFromFile() {
        try {
            Scanner inp = new Scanner(new File("budget.txt"));
            while (inp.hasNextLine()) {
                String todo = inp.nextLine();
                todos.add(todo);
            }
            inp.close();
        } catch (IOException e) {
            System.out.println("Error loading from file: " + e.getMessage());
        }
    }
}

