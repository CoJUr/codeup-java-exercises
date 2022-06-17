package vehicles;

public class Train extends Vehicle{

    private String name;

    public Train() {

    }

    public void makeNoise() {
        System.out.println( "\"choo choo\" says the train" );
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Train(String name, String name1) {
        super(name);
        this.name = name1;
    }

    public Train(String name) {
        this.name = name;
    }
}
