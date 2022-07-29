package oopprinciples.encap;

//a concrete duck
public class MiniDuckSimulator {
//    where we create ducks and test their behaviors


    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();


        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
