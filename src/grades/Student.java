package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name= name;
        this.grades = new ArrayList<>();
    }

    public Student() {};

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                  name  +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public double getGradeAverage(){
        double sum = 0;
        for (Integer grade : this.grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void addGrades(ArrayList<Integer> grades){
        this.grades.addAll(grades);
    }

}
