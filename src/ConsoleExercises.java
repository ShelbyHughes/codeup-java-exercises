import java.util.InputMismatchException;
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String args[]) {
//        Copy this code into your main method:

//        double pi = 3.14159;

//        Write some Java code that uses the variable pi to output the following:

//        The value of pi is approximately 3.14.

//        Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.

        double pi = 3.14159;
        System.out.printf("\nThe Value of pi is approximately %f.\n\n", pi);

//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i != -1){
            System.out.print("Enter an integer: ");
            try {
                i = scanner.nextInt();
                System.out.println("\nThe number is " + i + ".\n");
            }catch(InputMismatchException ime){
                System.out.println("This is not an integer");
                i = 0;
            }
        }

//        What happens if you input something that is not an integer?

        // throws a Input mismatch Exception

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        System.out.print("Enter 3 words: ");
        String word01, word02, word03;
        word01 = scanner.next();
        word02 = scanner.next();
        word03 = scanner.next();
        System.out.printf("\n the words are \"%s\", \"%s\", and \"%s\".\n", word01, word02, word03);
        scanner.nextLine();


//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?

//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

        System.out.print("\nEnter a sentence: ");
        scanner.useDelimiter("\n");
        String sentence = scanner.next();
        scanner.nextLine();
        System.out.printf("\nThe sentence is \"%s\"\n", sentence);


//        do you capture all of the words?

        // No it only accepts an answer up to the white space. so if you say "Do it for her" it will return "Do"

//        Rewrite the above example using the nextLine method.

        System.out.print("\nEnter a sentence: ");
        String sentence1 = scanner.nextLine();
        System.out.printf("\nThe sentence is \"%s\"\n", sentence1);

//        Prompt the user to enter values of length and width of a classroom at Codeup.

        Scanner scan = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("\nEnter the width: ");
        String sWidth = scan.nextLine();
        double width = Double.parseDouble(sWidth);
        System.out.print("\nEnter the length: ");
        String sLength = scan.nextLine();
        double length = Double.parseDouble(sLength);
        System.out.printf("\nThe dimensions are %f by %f. the perimeter is %f and the area is %f.\n", length, width, 2*(length + width), length * width);

        // Calculate the perimeter and area of Codeup's classroom

        scanner.useDelimiter("\n");
        System.out.print("\nHey! Yo, enter the width: ");
        double width1 = scanner.nextFloat();
        System.out.print("Enter the length: ");
        double length1 = scanner.nextFloat();
        System.out.printf("The dimensions are %f by %f. The perimeter is %f and the area is %f.\n", length1, width1, 2 * (length1 + width1), length1 * width1);


//        Use the nextLine method to get user input and [parse](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String) the resulting string to a numeric type.


//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//        Display the area and perimeter of that classroom.

//        The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

// Bonuses

//        Accept decimal entries.
//        Calculate the volume of the rooms in addition to the area and perimeter.
    }
}
