public class Wizard extends Enemy{
    String type;

    public Wizard(int h, int d, String t) {
        super(h, d);
        type = t;
    }
    
    void damageType(){
        //if the type of wizard is 'fire', then print "this wizard shoots a fireball"
        //if the type is 'ice', then print "this wizard shoots an iceball"
        if (type.equals("fire"))
        {
            System.out.println("This wizard shoots a fireball");
        }
        else if (type.equals("ice"))
        {
            System.out.println("This wizard shoots an iceball");
        }
        else
        {
            System.out.println("you failed to shoot something :/");
        }
    }
}
