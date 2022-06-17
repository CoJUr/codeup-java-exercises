public class Constructors {

    public static void main(String[] args) {
//        Dog myDog = new Dog("jerry");
//        System.out.println(myDog);
//
//        Dog yourDog = new Dog(8);
//        System.out.println(yourDog.age);

//        Constants myConstants = new Constants();
//        System.out.println(myConstants);


        Dog ourDog = new Dog(9, "Legs");
        System.out.println(String.format("%d %s", ourDog.age, ourDog.name));
    }

}
