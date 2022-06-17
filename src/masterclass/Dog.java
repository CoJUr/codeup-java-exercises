package masterclass;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() CALLED");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() happened");
        chew();
        super.eat();

    }

    public void walk() {
        System.out.println("Dog.walk() walks the dog");
        super.move(5);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs():  here comes DOGGIE");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    public void run() {
        System.out.println("Dog.RUN makes the dog go 2x as fast");
        move(10);
    }
}
