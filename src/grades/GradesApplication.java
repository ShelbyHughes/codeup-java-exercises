package grades;

import java.util.ArrayList;
import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static void main(String[] args){
        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();
        HashMap<String, String> attendance = new HashMap<>();

        Student student1 = new Student("Dylan");
        student1.addGrade(100);
        student1.addGrade(100);
        student1.addGrade(100);
        student1.addGrade(100);


        Student student2 = new Student("Shelby");
        student2.addGrade(87);
        student2.addGrade(79);
        student2.addGrade(80);
        student2.addGrade(74);


        Student student3 = new Student("Brittany");
        student3.addGrade(99);
        student3.addGrade(99);
        student3.addGrade(100);
        student3.addGrade(98);


        Student student4 = new Student("Carlos");
        student4.addGrade(90);
        student4.addGrade(89);
        student4.addGrade(94);
        student4.addGrade(96);

        students.put("ImAButt", student1);
        students.put("ShelbyHughes", student2);
        students.put("Bucky4life", student3);
        students.put("Tunacan", student4);

        String key = (String) students.keySet().toArray()[0];
        String key2 = (String) students.keySet().toArray()[1];
        String key3 = (String) students.keySet().toArray()[2];
        String key4 = (String) students.keySet().toArray()[3];

        student1.recordAttendance("2017-10-02", "P");
        student1.recordAttendance("2017-10-03", "P");
        student1.recordAttendance("2017-10-04", "P");
        student1.recordAttendance("2017-10-05", "P");

        student2.recordAttendance("2017-10-02", "A");
        student2.recordAttendance("2017-10-03", "P");
        student2.recordAttendance("2017-10-04", "A");
        student2.recordAttendance("2017-10-05", "P");

        student3.recordAttendance("2017-10-02", "A");
        student3.recordAttendance("2017-10-03", "P");
        student3.recordAttendance("2017-10-04", "P");
        student3.recordAttendance("2017-10-05", "P");

        student4.recordAttendance("2017-10-02", "A");
        student4.recordAttendance("2017-10-03", "P");
        student4.recordAttendance("2017-10-04", "P");
        student4.recordAttendance("2017-10-05", "P");

        System.out.println("Welcome! \n");;
    do{
        System.out.println("1 - See more information on a specific student?");
        System.out.println("2 - View overall class average");
        System.out.println("3 - Print a csv report of all the students");
        System.out.println("4 - Attendance");
        System.out.println("5 - Exit");
        int number = input.getInt("What is your selection?");
        switch (number) {
            case 1:
                System.out.println("Here are the GitHub usernames of our students:");
                students.entrySet().forEach(student->{
                    System.out.print(" |" + student.getKey() + "| ");
                });
                System.out.println("\n");
                do{
                    String response = input.getString("What student would you like to see more information on?");
                    if(response.equalsIgnoreCase("ImAButt")){
                        System.out.println("Name: " + student1.getName() + " - GitHub Username: " + key3);
                        System.out.println("Current Average: " + student1.getGradeAverage());
                        System.out.println(student1.getGrades());
                    }else if(response.equalsIgnoreCase("ShelbyHughes")){
                        System.out.println("Name: " + student2.getName() + " - GitHub Username: " + key2);
                        System.out.println("Current Average: " + student2.getGradeAverage());
                        System.out.println(student2.getGrades());
                    }else if(response.equalsIgnoreCase("Bucky4life")){
                        System.out.println("Name: " + student3.getName() + " - GitHub Username: " + key4);
                        System.out.println("Current Average: " + student3.getGradeAverage());
                        System.out.println(student3.getGrades());
                    }else if(response.equalsIgnoreCase("Tunacan")){
                        System.out.println("Name: " + student4.getName() + " - GitHub Username: " + key);
                        System.out.println("Current Average: " + student4.getGradeAverage());
                        System.out.println(student4.getGrades());
                    }else{
                        System.out.println("Sorry, no student found with the GitHub username of \"" + response + "\".");
                    }
                }while(input.yesNo("Would you like to see another student?"));
                break;
            case 2:
                double classAverage = (student1.getGradeAverage() + student2.getGradeAverage() + student3.getGradeAverage() + student4.getGradeAverage()) / 4;
                System.out.println(classAverage);
                break;
            case 3:
                System.out.println("Name,github_username,average");
                System.out.println(student1.getName() + "," + key3 + "," + student1.getGradeAverage());
                System.out.println(student2.getName() + "," + key2 + "," + student2.getGradeAverage());
                System.out.println(student3.getName() + "," + key4 + "," + student3.getGradeAverage());
                System.out.println(student4.getName() + "," + key + "," + student4.getGradeAverage());
                break;
            case 4:
                System.out.println("Name: " + student1.getName() + ", Github Username: " + key3 + ", Attendance Percentage: " + student1.getAttendancePrecent() + "%, Absent days: "+ student1.specificAbsent() + ", Average Grade: " + student1.getGradeAverage());
                System.out.println("Name: " + student2.getName() + ", Github Username: " + key2 +", Attendance Percentage: " + student2.getAttendancePrecent() + "%, Absent Days: " + student2.specificAbsent() + ", Average Grade: " + student2.getGradeAverage());
                System.out.println("Name: " + student3.getName() + ", Github Username: " + key4 +", Attendance Percentage: " + student3.getAttendancePrecent() + "%, Absent Days: " + student3.specificAbsent() + ", Grade Average: " + student3.getGradeAverage());
                System.out.println("Name: " + student4.getName() + ", Github Username: " + key +", Attendance Percentage: " + student4.getAttendancePrecent() + "%, Absent days: "+ student4.specificAbsent() + ", Grade Average:" + student4.getGradeAverage());
                break;
            case 5:
                return;
        }
    }while(input.yesNo("Would you like to make another selection?"));
        System.out.println("Goodbye, and have a wonderful day!");
    }
}
