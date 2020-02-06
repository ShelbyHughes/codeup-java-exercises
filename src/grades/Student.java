package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, ArrayList<Integer> grades){
        this.name = name;
        this.grades = grades;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum=0;
        for (int i=0; i<grades.size();i++){
            sum+=grades.get(i);
        }
        double avg= sum/grades.size();
        return avg;
    }
    public static void main(String[] args){
//        ArrayList<Integer> grades2 = new ArrayList<>();
//        grades2.add(97);
//        grades2.add(99);
//        grades2.add(100);
//        grades2.add(98);
//        Student student1 = new Student("Dylan", grades2);
//        student1.addGrade(95);
//        System.out.println(grades2);
//        System.out.println(student1.getGradeAverage());
    }
}
