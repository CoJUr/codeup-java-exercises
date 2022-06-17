//public class ArraysExercises {

//    public static Person[] addPerson(Person[] people, Person p) {
//
//        Person[] copyFrom = Arrays.copyOf(people, people.length +1);
//        copyFrom[copyFrom.length - 1] = p;
//        return copyFrom;
//
//    }
//
//    //walkthru-----
//    public static Person[] addPerson(Person newPerson, Person[] persons) {
//        Person[] newPersonArray;
////        newPersonArray = new Person[persons.length + 1];
//
//        newPersonArray = Arrays.copyOf(persons, persons.length+1);
//
////        for (int i = 0; i < persons.length; i++) {
////            newPersonArray[i] = persons[i];
////        }
//        newPersonArray[newPersonArray.length - 1] = newPerson;
//        return newPersonArray;
//    }
////------
//
//    public static void main(String[] args) {
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//
//        Person person1 = new Person("Bob");
//        Person person2 = new Person("Harry");
//        Person person3 = new Person("Harriet");
//
//        Person[] people = {person1, person2, person3};
//
//        for (Person p : people) {
//            System.out.println(p.getName());
//        }
//
//
//
//        //walkthru--------
//        Person[] persons;
//        persons = new Person[3];
//        persons[0] = new Person("Justin");
//        persons[1] = new Person("Dane");
//        persons[2] = new Person("Javier");
//
//        for (Person person: persons) {
//            person.sayHello();
//            System.out.println(person.getName());
//        }
//
//        Person[] newPersonsArray;
//        Person gonzalo = new Person("Gonzalo");
//        newPersonsArray = ArraysExercises.addPerson(gonzalo, persons);
//
////        Person[] newPersonsArray = ArraysExercises.addPerson(new Person("Gonzalo"), persons);
//        for (Person person: newPersonsArray){
//            person.sayHello();
////        }
//        //-------
//    }

//}}
