package FundiesReview;

import java.util.ArrayList;

public class PetDog extends Pet implements Companion{

    @Override
    public String snuggle() {
        return getName() + " wants to snuggle";
    }

    public static void allSnuggle(ArrayList<PetDog> petDogs) {
        for (PetDog petDog: petDogs){
            petDog.snuggle();
        }
    }

    private boolean trained;

    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }

    public boolean isTrained() {
        return trained;
    }

    public static void main(String[] args) {

    }
}
