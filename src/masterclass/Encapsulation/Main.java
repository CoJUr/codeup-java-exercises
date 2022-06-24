package masterclass.Encapsulation;


public class Main {
//BAD WAY
//    public static void main(String[] args) {
//        Player player = new Player();
//        //didnt make a constructor, so manually set the fields
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//        //even though not in the class, can still access the fields because theyre public fields
//
//        //this should be all in the associated class ----
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        // this is a problem. can override the players health. taking control from the player class
//        //dont want the player to be able to change their health like this
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        //-----
//
//    }

    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health = " + player.getHitpoints());
        //50 health is within 0 and 100, so validation happy
        // 200 health doesn't go through, get 100 default instead b/c validation not passed
    }



}
