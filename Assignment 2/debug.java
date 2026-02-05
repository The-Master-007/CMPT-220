public class Debug {
    public static void main(String[] args) {

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 5;
        if (var1 >= 4){
            System.out.println("Var1 is greater than or equal to 4");
        }else{
            System.out.println("Var1 is less than 4");
        }

        int var2 = 5;
        if (var2 == 5){
            System.out.println("Var2 is 5");
        } else if (var2 > 5){
            System.out.println("Var2 is greater than 5");
        } else if (var2 < 5){
            System.out.println("Var2 is less than 5");
        }
      // Removed redundant else 

        int var3 = 5;
        if (var3 > 10){
            System.out.println("Var3 is greater than 10");
        } else {
            System.out.println("Var3 is less than 10");
        }



        // Idk if you want us to make marist a variable but I made it enter the if statement always
        //for this section: why are we not entering the if statement?
        if ("Marist" == "Marist"){
            System.out.println("Marist University!");
        } else{
            System.out.println("Not Marist University :(!");
        }


    }
}
