import java.util.Date;

public class Student {
    static int numberOfStudents = 0;
    String name;
    String cohort;
    private Date startDate;
    String program;
    String location;
    boolean drinksCoffee;

    public static void main(String[] args){
        Student daniel = new Student("Daniel");
//        daniel.name = "Daniel";
        daniel.cohort = "Europa";
        daniel.startDate = new Date("06/11/2018");
        daniel.program = "Web Development";
        daniel.location = "San Antonio";
        daniel.drinksCoffee = true;

        Student zach = new Student("Zach");
//        zach.name = "Zach";
        zach.cohort = "Bayes";
        zach.startDate = new Date("February 11, 2017");
        zach.program = "Data science";
        zach.location = "San Antonio";
        zach.drinksCoffee = false;

        System.out.printf("There are now %d students.\n", numberOfStudents);

        Car tesla = new Car("Tesla", "ModelS", 2019);
        System.out.println(tesla.startYourEngine("Correct"));
        for(int i = 0; i < 100; i++) {
            System.out.println(tesla.drive());
        }
//        System.out.println(daniel.name);
//        if(zach.drinksCoffee) {
//            System.out.println(zach.name + " drinks coffee.");
//        }
        System.out.println(daniel.report());
        System.out.println(zach.report());
    }
//    constructor -- v
    public Student(String name){
        numberOfStudents++;
        this.name = name;
    }
    public String report(){
        String output = "";
        output += "My name is " + this.name + ". ";
        output += "I started learning " + this.program + " with " + this.cohort + " on " + this.startDate + ". ";
        if(this.drinksCoffee){
            output += "I drink coffee in " + this.location + ". ";
        }else{
            output += "I don't drink coffee in " + this.location + ". ";
        }
        return output;

    }
}
