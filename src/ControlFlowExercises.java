import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String args[]) {

//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15



        int i = 5;
        while(i <= 15){
            System.out.print(i + " ");
            i++;
        }

//        -----------------------------------------------------------------------------

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.

        int l = 100;
        do{
            System.out.println(l);
            l-=5;
        }while(l >= -10);

//        -----------------------------------------------------------------------------

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

        long c = 2;
        do {
            System.out.println(c);
            c = (int) Math.pow(c, 2);
        } while(c < 1000000);

//       -----------------------------------------------------------------------------

//        Refactor the previous two exercises to use a for loop instead.

        for(int k = 5; k <= 15; k++){
            System.out.println(k);
        }

//        -----------------------------------------------------------------------------

        //        Refactor the previous two exercises to use a for loop instead.

        for(int f = 0; f < 100; f += 2){
            System.out.println(f);
        }

//        -----------------------------------------------------------------------------

//        Refactor the previous two exercises to use a for loop instead.

        for(int m = 100; m > -10; m-=5){
            System.out.println(m);
        }

//        -----------------------------------------------------------------------------

//        Refactor the previous two exercises to use a for loop instead.

        for(long h = 2; h < 1000000; h = (int) Math.pow(h,2)){
            System.out.println(h);
        }

//        -----------------------------------------------------------------------------

//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

        for (int n = 1; n <= 100; n++) {
            if (n % 15 == 0) {
                System.out.println("FizzBuzz");
            }else if (n % 5 == 0) {
                System.out.println("Buzz");
            }else if (n % 3 == 0) {
                System.out.println("Fizz");
            }else {
                System.out.println(n);
            }
        }

//        -----------------------------------------------------------------------------

//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.

        Scanner scanner = new Scanner(System.in);
        char a;
        do {
            System.out.print("What number would you like to go up to? ");
            int number = scanner.nextInt();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            int counter = 1;
            for (int j = 0; j < number; j++) {
                int y = 1;
                for (int p = counter; p < counter + 3; p++) {
                    y = y * counter;
                    System.out.print(y + " ");
                }
                System.out.println();
                counter++;
            }
            System.out.println("Continue(Y/N)");
            a = scanner.next().charAt(0);

            if(a == 'y' || a == 'Y') {
                System.out.println("Continue");
            }else {
                System.out.println("End Program");
            }

        }while(a =='Y'|| a =='y');

//        -----------------------------------------------------------------------------

//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//   Bonus:
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

        do {
            System.out.print("Enter a grade (0-100): ");
            int grade = scanner.nextInt();
                if (grade <= 100 && grade >= 99) {
                    System.out.println("A+");
                } else if(grade < 99 && grade >= 90){
                    System.out.println("A");
                } else if (grade < 90 && grade >= 88) {
                    System.out.println("A-");
                } else if (grade < 88 && grade >= 85) {
                    System.out.println("B+");
                } else if (grade < 85 && grade >= 82) {
                    System.out.println("B");
                } else if (grade < 82 && grade >= 80) {
                    System.out.println("B-");
                } else if(grade < 80 && grade >= 78){
                    System.out.println("C+");
                }else if(grade < 78 && grade >= 69){
                    System.out.println("C");
                } else if(grade < 69 && grade >= 67){
                    System.out.println("C-");
                } else if(grade < 67 && grade >= 64){
                    System.out.println("D+");
                }else if(grade < 64 && grade >= 62){
                    System.out.println("D");
                }else if(grade < 62 && grade >= 60){
                    System.out.println("D-");
                }else {
                    System.out.println("F");
                }
            System.out.println("Continue(Y/N)");
             a = scanner.next().charAt(0);

            if(a == 'y' || a == 'Y') {
                System.out.println("Continue");
            }else {
                System.out.println("End Program");
            }

        }while(a =='Y'|| a =='y');

    }
}

