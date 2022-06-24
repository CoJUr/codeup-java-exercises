package masterclass.Encapsulation;

//BAD WAY
//public class Player {
//
//    public String name;
////    public String fullname; //this would be problem because not maintainable and
//    //would have to figure out how the class works or something
//    public int health;
//    //^no validation this way either, like could be in a setHealth()
//
//    public String weapon;
//
//    //no constructor, but 2 methods
//    public void loseHealth(int damage) {
//        this.health = this.health - damage;
//        if (this.health <= 0) {
//            System.out.println("Player knocked out");
//            //reduce number of lives remaining or something
//        }
//    }
//
//    //this one returns the amount of health left
//    public int healthRemaining() {
//        return this.health;
//    }
//}
