package oopprinciples.encap;

public class EncapWhatVaries {
//    if some aspect is frequently changing, pull it out and seperate it from the rest of the code
//    e.g.: ducks example - FLYing and QUACKing behaviors      (swim and display more consistent behaviors)
//    PROGRAM TO AN INTERFACE, NOT AN IMPLEMENTATION
//    2 interfaces - QuackBehavior and FlyBehavior
//     implement a Quack subclass, Squeak subclass, and Mute subclass(rubber duck)
//    implement 2 flysubclass from FlyBehavior interface -  FlyWithWings and FlyNoWay
//    also add 2 properties to the Duck class - QuackBehavior quackBehavior and FlyBehavior flyBehavior - "has a" relationships


}

abstract class Duck {

//    behaviors/variable of interface types. will use in constructor to compose ducks. can store any
//    flying/quacking behavior in these variables
    FlyBehavior flyBehavior;
   QuackBehavior quackBehavior;

//    methods

    public Duck() {}

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }


    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
//    swim works for all ducks, no need to pull it out of the class


    abstract void display();
//    individual duck subclasses now must have display() implementation

}



//concrete duck subclasses
class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
//        now a mallard duck is initialized when first created. could instead pass in the behaviors we'd like to use
    }
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}


