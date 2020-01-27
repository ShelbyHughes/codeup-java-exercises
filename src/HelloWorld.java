public class HelloWorld {
    public static void main(String args[]) {
//        System.out.print("Hello World!");
//        System.out.print("\n");

        byte num1 = 127;
        short num2 = num1;
        int num3 = num2;
        long num4 = num3;

        int bigNum1 = 127;
        byte bigNum2 = (byte) bigNum1;
        bigNum2++;
        System.out.println(bigNum2);

        float num5 = 3.333f;
        double num6 = 3.141592;
        int closeToNum6 = (int) num6;
//        double 6num;
//        System.out.println(num6);
        final double PI = 3.141592;

        boolean yesNo = true;
        yesNo = false;

        char initial;
        initial = 'D';
        initial = '\n';

        String name = "Daniel";
        name.length();

//        System.out.println(num4);

    }
    public static void something(String args[]) {
//        System.out.println("Yada Yada!");
    }
}
