package vehicles;

class Employee extends Person {
    public Employee(String employeeName){
        super(employeeName);
    }

    private double salary;
    public void doWork() {
        System.out.println("Work, work...");
    }

    //------------

    public static void main(String[] args) {
        Employee john = new Employee("John");
        john.sayHello();
        System.out.println(john.name);

        Employee e = new Employee("Eeyee");
        Person p = new Person("Jill");

        e.sayHello(); // prints "Hello, World!"
        e.doWork(); // prints "Work, work..."
    }
}