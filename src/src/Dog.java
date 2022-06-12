public class Dog {

    String name;
    int age;

    public Dog(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

}
