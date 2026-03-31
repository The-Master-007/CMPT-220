public class Student
{
    // Instance variables for each student
    // We don't use year in this example
    String name;
    String year;
    double gpa;
    int id;

    /* Constructor for the Student class 
    * @param name - the student's name
    * @param year - the student's year in school (freshman, sophomore, etc.)
    * @param gpa - the student's grade point average
    * @param id - the student's unique ID number
    */
    public Student(String name, String year, double gpa, int id)
    {
        this.name = name;
        this.year = year;
        this.gpa = gpa;
        this.id = id;
    }
    /* Checks if the student is on the honor roll 
    * @param none
    * @return boolean - true if the student's GPA is above 3.6, false otherwise
    */
    public boolean isHonorRoll()
    {
        return gpa > 3.6;
    }
    /* Checks if the student gets free lunch based on a random ID
    * @param randomID - the randomly generated ID to compare against the student's ID
    * @return void - prints out whether the student gets free lunch or not
    */
    public void checkFreeLunch(int randomID) {
        if (this.id == randomID) {
            System.out.println(name + " gets free lunch today!");
        } else {
            System.out.println(name + " does not get free lunch.");
        }
    }
}

/* I overcomplicated this because for some reason I thought the logic for the randomness had to be in the Student class
* this obviously makes it more difficult than simply having a method to check a number against the student's ID.
* Other than that it wasn't too difficult to code.
*/
