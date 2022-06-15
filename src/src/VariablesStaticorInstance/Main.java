package VariablesStaticorInstance;


//STATIC VARs: aka static member variables. every instance of the class shares
//changes made to that static var affect all the other instances
//not used very often.
// one use case: working with user input, declare Scanner as a static var
//this way all static methods can access it directly

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("rex"); // created instance
        Dog fluffy = new Dog("fluffy"); // another

        rex.printName(); //name= fluffy    - bc declared name as static
        fluffy.printName(); // fluffy
    }

}

//INSTANCE VARs: aka fields or member variables. don't use static keyword.
//every instance has its own copy. therefore represent the state of an instance