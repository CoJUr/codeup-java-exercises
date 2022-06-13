public class RPG {

    public static void main(String[] args) {

        Fighter arata = new Fighter();
        arata.name = "Arata";
        arata.hitPoints = 17;
        arata.maxDamage = 14;
        arata.printStats();

        Fighter sozalix = new Fighter();
        sozalix.name = "Sozalix";
        sozalix.battleRoar();
        int attackRoll = sozalix.attackRoll();
        System.out.println("Sozalix attacks and rolls a " + attackRoll);
    }

}
