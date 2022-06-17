package grades;

public class StudentTest {


    public static void main(String[] args) {

        Student student1 = new Student("Jack");
        student1.addGrade(8);
        student1.addGrade(9);
        System.out.println(student1.getGrades());
        System.out.println(student1.getGradeAverage());
    }
}
