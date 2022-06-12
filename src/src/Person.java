public class Person {
    // variables
    private String name;

        //---variables


    //methods---
    public String getName() {
        //return the name
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello from %s! %n", this.name);
    }

    public Person(String name){
        this.name = name;
    }

//---methods

    public static void main(String[] args) {
    Person person = new Person("Jacob");

    person.sayHello();
    System.out.println(person.getName());

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }
}
