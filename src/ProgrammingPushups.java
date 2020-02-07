import java.util.ArrayList;
import java.util.Arrays;

public class ProgrammingPushups {
    public static void main(String args[]){
        System.out.println(multiply(7,17));
        System.out.println(sumOfBinary("11100", "10101"));
        arrayOfArrayList();
    }

//    01/31/2020

    public static int multiply(int a, int b){
        int sum = 0;
        for(int i = 0; i < b; i++){
            sum += a;
        }
        return sum;
    }

//    02/03/2020
// Write a Java program to add two binary numbers.

    public static String sumOfBinary(String first, String second){
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }

//    02/07/2020
    public static void arrayOfArrayList(){
        String[] bands = {"Panic! at the disco", "Fall out boy", "My Chemical Romance", "We The Kings", "Cobra Starship"};
        ArrayList<String> fueledByRamen = new ArrayList<>();
        for (int i=0; i<bands.length; i++)
        {
            fueledByRamen.add(bands[i]);
        }
        System.out.println(fueledByRamen);
    }
}