package StaticMethods;

//Static methods cant access instance fields directly.
//usually theyre used for operations that dont require data an instance ('this')
//can't use 'this'

// if a method doesnt use an instance var, it should be static
//e.g. 'main' is a static method called by the JVM at application init


//static methods get called as ClassName.methodName(); UNLESS within the class
public class Main {

    public static void main(String[] args) {
        //ClassName.methodName(); format
        Calculator.printSum(5, 10);
        //static methods called like methodName(); in the same class
        printHello();

        Dog rex = new Dog(); //created instance...
        rex.bark(); //...to call an instance method

    }



    public static void printHello() {
        System.out.println("Hello");
    }
}


//diagram: should a method be static?   (more often, no)
//      does it use any fields(instance variables) or instance methods?
// yes ? it should probably be instance         no ? probably should be static