public class ProgrammingPushups {
    public static void main(String args[]){
        System.out.println(multiply(7,17));
        System.out.println(toThePower(2,16));
//        binaryAdd(11100, 10101);
        System.out.println(sumOfBinary("11100", "10101"));
    }

//    01/31/2020

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


//    02/03/2020
// Write a Java program to add two binary numbers.

//    public static void binaryAdd(long bin1, long bin2) {
//        int i = 0;
//        int remainder = 0;
//        int[] sum = new int[10];
//        while (bin1 != 0 || bin2 != 0) {
//            sum[i++] = (int) ((bin1 % 10 + bin2 % 10 + remainder) % 2);
//            remainder = (int) ((bin1 % 10 + bin2 % 10 + remainder) / 2);
//            bin1 = bin1 / 10;
//            bin2 = bin2 / 10;
//        }
//        if (remainder != 0) {
//            sum[i++] = remainder;
//        }
//        --i;
//        System.out.print("Output: ");
//        while (i >= 0) {
//            System.out.print(sum[i--]);
//        }
//        System.out.print("\n");
//    }
    public static String sumOfBinary(String first, String second){
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }
}
