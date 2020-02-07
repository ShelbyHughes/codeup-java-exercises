package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input(){
        this.scan = new Scanner(System.in);
    }

    public String getString(){
        String userInput;
        System.out.println("Enter a string: ");
        userInput = this.scan.nextLine();
        return userInput;
    }

   public String getString(String prompt){
        String userInput;
        System.out.println(prompt);
        userInput = this.scan.nextLine();
        return userInput;
    }

    public boolean yesNo(){
        String answer;
        System.out.println("What is your answer? (Yes/no): ");
        answer = this.scan.next();
        return answer.toLowerCase().startsWith("y");
    }

    public boolean yesNo(String prompt){
        String answer;
        System.out.println(prompt);
        answer = this.scan.nextLine();
        return answer.toLowerCase().startsWith("y");
    }

    public int getInt(int min, int max){
        int userInput = 0;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ": ");
            userInput = getInt();
        } while (min >= userInput && userInput <= max);
        return userInput;
    }

    public int getInt(int min, int max, String prompt){
        int userInput = 0;
        do {
            System.out.println(prompt);
            userInput = getInt();
        } while (min >= userInput && userInput <= max);
        return userInput;
    }

    public int getInt() {
        String userInput = "";
        boolean invalid = true;
        int returnInt = 0;
        do {
            try {
                System.out.println("Enter an int: ");
                userInput = this.scan.nextLine();
                returnInt = Integer.parseInt(userInput);
                invalid = false;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid int. ");
            }
        }while(!invalid);
        return returnInt;
    }

    public int getInt(String prompt) {
        String userInput = "";
        boolean invalid = true;
        int returnInt = 0;
        do {
            try {
                System.out.println(prompt);
                userInput = this.scan.nextLine();
                returnInt = Integer.parseInt(userInput);
                invalid = false;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid int. ");
            }
        }while(!invalid);
        return returnInt;
    }

    public double getDouble(double min, double max){
        double userInput = 0;
        do {
            System.out.println("Enter a double: ");
            userInput = getDouble();
        } while (min >= userInput && userInput <= max);
        return userInput;
    }

   public double getDouble(double min, double max, String prompt){
       double userInput = 0;
       do {
           System.out.println(prompt);
           userInput = getDouble();
       } while (min >= userInput && userInput <= max);
       return userInput;
    }

    public double getDouble(){
        String userInput = "";
        boolean invalid = false;
        double returnDouble = 0.0;
        do {
            try {
                System.out.println("Enter a double: ");
                userInput = this.scan.nextLine();
                returnDouble = Double.parseDouble(userInput);
                invalid = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. ");
            }
        }while(!invalid);
        return returnDouble;
    }

    public double getDouble(String prompt){
        String userInput = "";
        boolean invalid = false;
        double returnDouble = 0.0;
        do {
            try {
                System.out.println(prompt);
                userInput = this.scan.nextLine();
                returnDouble = Double.parseDouble(userInput);
                invalid = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. ");
            }
        }while(!invalid);
        return returnDouble;
    }

    public int getBinary() {
        String userInput = "";
        boolean invalid = true;
        int decimal = 0;
        do {
            try {
                System.out.println("Enter a binary number: ");
                userInput = this.scan.nextLine();
                decimal = Integer.parseInt(userInput, 2);
                invalid = false;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid binary number. ");
            }
        }while(!invalid);
        return decimal;
    }

    public int getHex() {
        String userInput = "";
        boolean invalid = true;
        int decimal = 0;
        do {
            try {
                System.out.println("Enter an hexidecimal number: ");
                userInput = this.scan.nextLine();
                decimal = Integer.parseInt(userInput, 16);
                invalid = false;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid hexidecimal number. ");
            }
        }while(!invalid);
        return decimal;
    }
}
