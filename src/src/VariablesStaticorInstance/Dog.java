package VariablesStaticorInstance;

public class Dog {

    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name= " + name);
    }

    /*----instance ex

     -instance variable-
    private String name;

     -instance constructor-
    public Dog(String name){
        this.name = name;

    public void printName() {
        System.out.println("name= " + name);
    }
    */
    }

