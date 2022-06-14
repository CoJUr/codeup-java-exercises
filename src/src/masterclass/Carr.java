package masterclass;

public class Carr extends Vehicle{
    private int doors;
    private int engineCapacity;

    public Carr(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
