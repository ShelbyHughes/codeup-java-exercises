import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String args[]) {
//        Copy this code into your main method:

//        double pi = 3.14159;

//        Write some Java code that uses the variable pi to output the following:

//        The value of pi is approximately 3.14.

//        Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.

        double pi = (float) 3.14159;
        System.out.format("The value of pi is approximately %s", pi);

//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter an integer: ");
        int userInput = scanner.nextInt();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        What happens if you input something that is not an integer?

        // throws a run time exception

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        System.out.print("\nEnter a word: ");
        String userInput1 = scanner.next();
        System.out.print("\nEnter a second word: ");
        String userInput2 = scanner.next();
        System.out.print("\nEnter a third word: ");
        String userInput3 = scanner.next();

        System.out.println("You entered: --> \"" + userInput1 + ", " + userInput2 +", " + userInput3 + "\" <--");

//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?

//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

        System.out.print("Enter a sentence: ");
        String userInput4 = scanner.next();

        System.out.println(userInput4);

//        do you capture all of the words?

        // No it only accepts an answer up to the white space. so if you say "Do it for her" it will return "Do"

//        Rewrite the above example using the nextLine method.

        System.out.print("Enter a sentence: ");
        String userInput5 = scanner.nextLine();

        System.out.println(userInput5);

//        Prompt the user to enter values of length and width of a classroom at Codeup.

        System.out.print("Enter the length of the classroom: ");
        String userInput6 = scanner.next();

        System.out.print("Enter the width of the classroom: ");
        String userInput7 = scanner.next();

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
