package vehicles;

public class Motorcycle extends Vehicle{

    private String name;

    public Motorcycle() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Motorcycle(String name, String name1) {
        super(name);
        this.name = name1;
    }

    public Motorcycle(String name) {
        this.name = name;
    }
/*Create a breakingDownNoise() method in the subclass.
     It should call super.makeNoise() and then add a second sout that adds a second noise after the first one.
     */

    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println("kaboom");
    }

    public void makeNoise() {
        System.out.println( "zroommm" );
    }

    public static void main(String[] args) {

    }

}
