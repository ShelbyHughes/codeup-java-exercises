package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();
    private HashMap<String, String> attendance = new HashMap<>();

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
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

    public void recordAttendance(String date, String value){
        if(value.equalsIgnoreCase("A") || value.equalsIgnoreCase("P")){
            this.attendance.put(date, value);
        }
    }

    public double getAttendancePrecent(){
        double absent = 0;
        double totalDays = 0;
        for(String key : attendance.keySet()){
            if(attendance.get(key).equalsIgnoreCase("A")){
                absent++;
            }
            totalDays++;
        }
        return ((totalDays - absent)/ totalDays) * 100;

    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public ArrayList<String> specificAbsent(){
        ArrayList<String> result = new ArrayList<>();
        for(String key : attendance.keySet()){
            if(attendance.get(key).equalsIgnoreCase("A")){
                result.add(key);
            }
        }
        return result;
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
