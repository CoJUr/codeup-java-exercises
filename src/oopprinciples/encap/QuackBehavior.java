package oopprinciples.encap;

public interface QuackBehavior {
    void quack();
}


//behavior for regular quackers
class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!");
    }
}

//behavior for squeakers
class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak squeak!");
    }
}

class Mute implements QuackBehavior{
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

