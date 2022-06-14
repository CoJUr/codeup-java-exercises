package vehicles;

public class Motorcycle extends Vehicle{



    /*Create a breakingDownNoise() method in the subclass.
     It should call super.makeNoise() and then add a second sout that adds a second noise after the first one.
     */

    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println("kaboom");
    }


    public static void main(String[] args) {

    }

}
