public class ProgrammingPushups {
    public static void main(String args[]){
        System.out.println(multiply(7,17));
        System.out.println(toThePower(2,16));
    }

//    1/31/2020

    public static int multiply(int a, int b){
        int sum = 0;
        for(int i = 0; i < b; i++){
            sum += a;
        }
        return sum;
    }

    public static int toThePower(int a, int b){
        int product = 1;
        for(int i = 0; i < b; i++){
            product *= a;
        }
        return product;
    }
}
