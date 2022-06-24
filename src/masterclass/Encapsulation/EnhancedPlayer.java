package masterclass.Encapsulation;

public class EnhancedPlayer {

    private String name;
    private int hitpoints = 100;
    //encapsulation lets us change variable names without affecting classes calling code by old names
    private String weapon;

    //constructor
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name; // could have validation to make sure this wasn't null

        if (health > 0 && health <= 100) {
            //have to be trying to set health between 0 and 100 to actually set it. validation good.
            this.hitpoints = health;
        }

        this.weapon = weapon;
    }

    public void lostHealth(int damage) {
        this.hitpoints = this.hitpoints - damage;
        if (this.hitpoints <= 0) {
            System.out.println("Player knocked out");
        }
    }
    //this function and the constructor are the only ways to set the players health

    //getter - health
    public int getHitpoints() {
        return hitpoints;
    }
}
