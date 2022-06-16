import java.util.HashMap;

public class Collections {

    public static void main(String[] args) {

        HashMap<String, Integer> careerWins = new HashMap<>();
        careerWins.put("Gregg Popovich", 1344);
        careerWins.put("Don Nelson", 1335);
        careerWins.put("Lenny Wilkens", 1332);

        //only a key for .get
        System.out.println(careerWins.get("Gregg Popovich"));
        careerWins.replace("Gregg Popovich", 1345);
        System.out.println(careerWins.replace("Gregg Popovich", 1345));



    }
}
