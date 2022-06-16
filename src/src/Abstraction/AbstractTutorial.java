package Abstraction;

interface DogInterface {


    void bark();
    void poop();
}

abstract class Dog {


    public void bark() {
        System.out.println("bark!");
    }

    public abstract void poop();
}

class Chihuahua extends Dog{

    public void poop() {
        System.out.println("Chihuahua dog pooped");
    }
}

public class AbstractTutorial {


    public static void main(String[] args) {
        Chihuahua c = new Chihuahua();

        c.bark();
        c.poop();

    }
}
