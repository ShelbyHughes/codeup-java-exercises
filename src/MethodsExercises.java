public class MethodsExercises {
    public static void main(String args[]){
       System.out.println(addition(2,5));
       System.out.println(subtraction(5,3));
       System.out.println(multiplication(5,3));
       System.out.println(division(10,2));
       System.out.println(modulus(10,2));
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
}
