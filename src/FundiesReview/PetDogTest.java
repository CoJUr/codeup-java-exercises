package FundiesReview;

import java.util.ArrayList;
import java.util.List;

public class PetDogTest {


    public static void main(String[] args) {
        PetDog petDog = new PetDog("Sam", "Hound", true);
        System.out.println(petDog.snuggle());

        PetDog grinch = new PetDog("Grinch", "lab", true);

        PetDog chulo = new PetDog("chulo", "lab", true);
        PetDog rudo = new PetDog("rudo", "lab", true);

        PetDog.allSnuggle(new ArrayList<>(List.of(grinch, chulo, rudo)));
    }
}

