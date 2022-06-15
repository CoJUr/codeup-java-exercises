package vehicles;

public class VehicleTest {


    public VehicleTest() {
    }

    public static void main(String[] args) {
        Motorcycle moped = new Motorcycle();  //instantiated specific vehicle

        moped.makeNoise();
        moped.setName("moped");
        System.out.println(moped.getName());


        Train train = new Train();

        train.makeNoise();

        moped.breakingDownNoise();


    }
}
