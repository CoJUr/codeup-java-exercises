package masterclass.Lambdas;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Printing from the runnable");
            System.out.println("line 2");
            System.out.format("this is line %d\n", 3);
        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

//        sort employees by name in ASC order and print result

            // way w/o lambas:
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee emp1, Employee emp2) {
//                return emp1.getName().compareTo(emp1.getName());
//            }
//        });
        //do a forEach to check the values
//        for(Employee employee : employees) {
//            System.out.println(employee.getName());
//        }

                            //way with lambda.   lambda passed as 2nd param, instead of anon comparator
                        Collections.sort(employees, (Employee emp1, Employee emp2) ->
                                emp1.getName().compareTo(emp2.getName()));

                        for(Employee employee : employees) {
                            System.out.println(employee.getName());
                        }


    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}