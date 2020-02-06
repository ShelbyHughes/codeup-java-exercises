package grades;

import java.util.ArrayList;
import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static void main(String[] args){
        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();
        ArrayList<Integer> grades2 = new ArrayList<>();
        grades2.add(100);
        grades2.add(100);
        grades2.add(100);
        grades2.add(100);
        Student student1 = new Student("Dylan", grades2);
        ArrayList<Integer> grades3 = new ArrayList<>();
        grades3.add(87);
        grades3.add(79);
        grades3.add(80);
        grades3.add(74);
        Student student2 = new Student("Shelby", grades3);
        ArrayList<Integer> grades4 = new ArrayList<>();
        grades4.add(99);
        grades4.add(99);
        grades4.add(100);
        grades4.add(98);
        Student student3 = new Student("Brittany", grades4);
        ArrayList<Integer> grades5 = new ArrayList<>();
        grades5.add(90);
        grades5.add(89);
        grades5.add(94);
        grades5.add(96);
        Student student4 = new Student("Carlos", grades5);
        students.put("ImAButt", student1);
        students.put("ShelbyHughes", student2);
        students.put("Bucky4life", student3);
        students.put("Tunacan", student4);
        System.out.println("Welcome! \n");
        System.out.println("Here are the GitHub usernames of our students:");
        students.entrySet().forEach(student->{
            System.out.print(" |" + student.getKey() + "| ");
        });
        System.out.println("\n");
    do{
        String response = input.getString("What student would you like to see more information on?");
        String key = (String) students.keySet().toArray()[0];
        String key2 = (String) students.keySet().toArray()[1];
        String key3 = (String) students.keySet().toArray()[2];
        String key4 = (String) students.keySet().toArray()[3];
        if(response.equalsIgnoreCase("ImAButt")){
            System.out.println("Name: " + student1.getName() + " - GitHub Username: " + key3);
            System.out.println("Current Average: " + student1.getGradeAverage());
        }else if(response.equalsIgnoreCase("ShelbyHughes")){
            System.out.println("Name: " + student2.getName() + " - GitHub Username: " + key2);
            System.out.println("Current Average: " + student2.getGradeAverage());
        }else if(response.equalsIgnoreCase("Bucky4life")){
            System.out.println("Name: " + student3.getName() + " - GitHub Username: " + key4);
            System.out.println("Current Average: " + student3.getGradeAverage());
        }else if(response.equalsIgnoreCase("Tunacan")){
            System.out.println("Name: " + student4.getName() + " - GitHub Username: " + key);
            System.out.println("Current Average: " + student4.getGradeAverage());
        }else{
            System.out.println("Sorry, no student found with the GitHub username of \"" + response + "\".");
        }
    }while(input.yesNo("Would you like to see another student?"));
        System.out.println("Goodbye, and have a wonderful day!");
    }
}
