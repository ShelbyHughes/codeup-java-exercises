import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String args[]){
       System.out.println(addition(2,5));
       System.out.println(subtraction(5,3));
       System.out.println(multiplication(5,3));
       System.out.println(division(10,2));
       System.out.println(modulus(10,2));
       System.out.println(getInteger(1,10));
       System.out.println(getIntegerR(1,10));
       factorial();
//       diceRoll();
        rollDice();

//       HighLow game = new HighLow();
//       game.PlayGame();
    }
    public static double addition(double num1, double num2){
        return num1 + num2;
    }
    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplication (double num1, double num2){
        return num1 * num2;
    }
    public static double division(double num1, double num2){
        return num1 / num2;
    }
    public static double modulus(double num1, double num2){
        return num1 % num2;
    }
    public static int getInteger(int min, int max){
        int answer;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter a number between " + min + " and " + max + ": ");
            answer = scan.nextInt();
        }while(answer < min || answer > max);
        return answer;
    }
    public static int getIntegerR(int min, int max){
        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        answer = scan.nextInt();
        if(answer < min || answer > max) {
            return getIntegerR(min, max);
        }else {
            return answer;
        }
    }
    public static void factorial(){
        int base = getInteger(1,10);
        long fact = 1;
        String output = "! = 1";
        System.out.printf("1%s\n", output);
        for(int i = 2; i < base; i++){
            fact *= i;
            output += " x " + i;
            System.out.printf("%d%s = %d\n" , i, output, fact);
        }
    }
    public static int rollDice(){
        int dice1 = 0;
        int dice2 = 0;
        int numSides = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sides per die (2 dice)? ");
        numSides = getInteger(1,21);
        while(true){
            dice1 = (int) Math.round(Math.floor(Math.random() * numSides +1));
            dice2 = (int) Math.round(Math.floor(Math.random() * numSides +1));
            System.out.printf("%d + %d = %d\n", dice1, dice2, (int)addition(dice1,dice2));
            System.out.println("Would you like to roll again?");
            String answer = scan.next();
            if(answer.toLowerCase().contains("n")){
                return (int) addition(dice1,dice2);
            }
        }
    }
}
