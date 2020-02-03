package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input(){
        this.scan = new Scanner(System.in);
    }

    String getString(){
        String userInput;
        System.out.println("Enter a string: ");
        userInput = scan.nextLine();
        return userInput;
    }

    String getString(String prompt){
        String userInput;
        System.out.println(prompt);
        userInput = scan.nextLine();
        return userInput;
    }

    public boolean yesNo(){
        String answer;
        System.out.println("What is your answer? (Yes/no): ");
        answer = scan.next();
        return answer.toLowerCase().startsWith("y");
    }

    public boolean yesNo(String prompt){
        String answer;
        System.out.println(prompt);
        answer = scan.next();
        return answer.toLowerCase().startsWith("y");
    }

    int getInt(int min, int max){
        int answer;
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        answer = scan.nextInt();
        if(answer < min || answer > max) {
            return getInt(min, max);
        }else {
            return answer;
        }
    }

    public int getInt(int min, int max, String prompt){
        int answer;
        System.out.println(prompt);
        answer = scan.nextInt();
        if(answer < min || answer > max) {
            return getInt(min, max);
        }else {
            return answer;
        }
    }

    int getInt(){
        int userInput;
        System.out.println("Enter an int: ");
        userInput = scan.nextInt();
        return userInput;
    }

    int getInt(String prompt){
        int userInput;
        System.out.println(prompt);
        userInput = scan.nextInt();
        return userInput;
    }

    public double getDouble(double min, double max){
        double answer;
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        answer = scan.nextDouble();
        if(answer < min || answer > max) {
            return getDouble(min, max);
        }else {
            return answer;
        }
    }

   public double getDouble(double min, double max, String prompt){
        double answer;
        System.out.println(prompt);
        answer = scan.nextDouble();
        if(answer < min || answer > max) {
            return getDouble(min, max, prompt);
        }else {
            return answer;
        }
    }

    public double getDouble(){
        double userInput;
        System.out.println("Enter a double(#.###): ");
        userInput = scan.nextDouble();
        return userInput;
    }

    public double getDouble(String prompt){
        double userInput;
        System.out.println(prompt);
        userInput = scan.nextDouble();
        return userInput;
    }
}
