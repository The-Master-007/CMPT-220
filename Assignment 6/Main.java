public class Main{
    public static void main(String[] args) {
        // Create 5 students
        Student John = new Student("John Doe", "Sophomore", 3.5, 01);
        Student Alex = new Student("Alex Smith", "Junior", 3.75, 02);
        Student Max = new Student("Max DeSimone", "Freshman", 3.89, 03);
        Student Emily = new Student("Emily Davis", "Senior", 3.95, 04);
        Student Sarah = new Student("Sarah Johnson", "Sophomore", 3.65, 05);
        // Add them to an array for easier access later
        Student[] students = {John, Alex, Max, Emily, Sarah};
        // Calls isHonorRoll for each student instead of having 5 statements
        for (Student s : students) {
            System.out.println(s.name + " is on the honor roll: " + s.isHonorRoll());
        }
        System.out.println();
        // Generate a random ID between 1 and 10 (more than number of students)
        int randomID = (int)(Math.random() * 10) + 1;
        System.out.println("Today's random ID: " + randomID);
        System.out.println();
        // Checks each student against it
        for (Student s : students) {
            s.checkFreeLunch(randomID);
        }
    }
}
