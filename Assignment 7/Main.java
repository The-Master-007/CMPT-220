public class Main {
    public static void main(String[] args) {

        //create a generic enemy and call its functions
        Enemy e1 = new Enemy(100, 20);
        e1.attack();

        //create a fire and an ice wizard and call all functions
        Wizard w1 = new Wizard(100, 15, "fire");
        w1.attack();
        w1.damageType();
        Wizard w2 = new Wizard(20, 10, "ice");
        w2.attack();
        w2.damageType();
        Wizard w3 = new Wizard(75, 25, "lightning");
        w3.attack();
        w3.damageType();
        //create a goblin and call its functions
        Goblin g1 = new Goblin(40, 8);
        g1.attack();
        System.out.println();
        // Showcasing extra functions
        g1.steal();
        g1.heal(10);
        System.out.println();
        w1.dealDamage(w2);
        w3.dealDamage(w2);
    }
}
