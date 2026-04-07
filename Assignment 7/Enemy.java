
public class Enemy {
    int health;
    int damage;

    public Enemy(int h, int d){
        health = h;
        damage = d;
    }
    // Generic attack function
    void attack(){
        System.out.println("the enemy attacks");
    }
    // Allows enemy to take damage and potentially die
    void takeDamage(int d)
    {
        if (health - d <= 0)
        {
            System.out.println("The enemy has been killed!");
        }
        else
        {
            health -= d;
            System.out.println("The enemy took " + d + " damage and has " + health + " health left.");
        }
    }
    // Allows enemy to deal damage to a target
    void dealDamage(Enemy e)
    {
        System.out.println("The enemy deals " + damage + " damage to the target.");
        e.takeDamage(damage);
    }
}
