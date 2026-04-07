public class Goblin extends Enemy{

    //Needs constructor
    public Goblin(int h, int d) {
        super(h, d);
    }
    //needs method to overwrite attack in enemy to say "the goblin gobbles" instead of "the enemy attacks
    @Override
    void attack()
    {
        System.out.println("The goblin gobbles");
    }
    // Goblins love to steal things
    void steal()
    {
        System.out.println("The goblin steals some gold from you!");
    }
    // They are very crafty and store potions 
    void heal(int h)
    {
        health += h;
        System.out.println("The goblin heals itself for " + h + " health and now has " + health + " health.");
    }
}
