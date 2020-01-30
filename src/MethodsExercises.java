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
       System.out.println(factorial());

//       HighLow game = new HighLow(5);
//       game.PlayGame();
    }
    public static int addition(int num1, int num2){
        int total = num1 + num2;
        return total;
    }
    public static int subtraction(int num1, int num2){
        int total = num1 - num2;
        return total;
    }
    public static int multiplication (int num1, int num2){
        int total = num1 * num2;
        return total;
    }
    public static int division(int num1, int num2){
        int total = num1 / num2;
        return total;
    }
    public static int modulus(int num1, int num2){
        int divisible = num1 % num2;
        return divisible;
    }
    public static int getInteger(int min, int max){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        String input = scanner.nextLine();
        number = Integer.parseInt(input);

        if (number >= min && number <= max) {
            return number;
        } else if (number < min || number > max) {
            System.out.println("Not in range");
        } else {
            System.out.println("Not a number");
        }
        return getInteger(min, max);
    }
    public static int factorial(){
        int number;
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        number = Integer.parseInt(input);

        scanner.close();
        int fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
//    public static int diceRoll (){
//
//    }
    public static void guessingGame(){
        char a;
        do {
            Random rand = new Random();
            int rand_int1 = rand.nextInt(101);
            System.out.println("Guess the random number: ");
            Scanner scanner = new Scanner(System.in);
            int number;
            String input = scanner.nextLine();
            number = Integer.parseInt(input);
            if (rand_int1 == number) {
                System.out.println("Good Guess");
            } else if (rand_int1 > number) {
                System.out.println("Lower");
            } else {
                System.out.println("Higher");
            }
            System.out.println("Continue(Y/N)");
            Scanner scan = new Scanner(System.in);
            a = scan.next().charAt(0);
            scan.close();
        }while(a == 'Y' || a == 'y');
    }
}
