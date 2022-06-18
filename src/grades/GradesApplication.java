package grades;
import java.util.HashMap;

public class GradesApplication {






    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Jack");
//        student1.addGrade(8);
//        student1.addGrade(9);
//        student1.addGrade(9);


        students.put("Jack", student1);


        Student student2 = new Student("Jill");
//        student2.addGrade(10);
//        student2.addGrade(11);
//        student2.addGrade(12);
        students.put("Jill", student2);


        Student student3 = new Student("Bill");
//        student3.addGrade(11);
//        student3.addGrade(11);
//        student3.addGrade(9);
        students.put("Bill", student3);


        Student student4 = new Student("Jane");
//        student4.addGrade(9);
//        student4.addGrade(13);
//        student4.addGrade(10);
        students.put("Jane", student4);


        System.out.println(students);
    }
}
