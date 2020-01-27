public class HelloWorld {
    public static void main(String args[]) {

//        Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

        int myFavoriteNumber;
        myFavoriteNumber = 74;
        System.out.println(myFavoriteNumber);

//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.

//        String myString = 3.14159;
//        System.out.println(myString);

//        Change your code to assign a character value to myString. What do you notice?

//        Change variable "myString" type to char

//        Change your code to assign the value 3.14159 to myString. What happens?

//        Change variable "myString" type to double

//        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

//        float myNumber = (float) 3.14;
        float myNumber = 3.14f;
        System.out.println(myNumber);

//        Change your code to assign the value 3.14 to myNumber. What do you notice?

        // incompatable types

//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

        // No problems, the L makes the value a long.

//        Change your code to assign the value 123 to myNumber.

        // No problem because its just an int

//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

        // 3.14 that is a literal double, it doesnt fit into a long.

//        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

        // add an f to declare a float or cast the double to be a float

//        Copy and paste the following code blocks one at a time and execute them


        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        x = 5;
        System.out.println(++x);
        System.out.println(x);


//        What is the difference between the above code blocks? Explain why the code outputs what it does.

        // x++ ups the count to 6 after the println, while ++x ups the count before we println.

//        Try to create a variable named class. What happens?

//        int class = 23;

        // class is a reserved word

//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        System.out.println(three);

//        Copy and paste the code above and then run it. Does the result match with your expectation?

        // run time exception

//        How is the above example different from the code block below?

        // compiler error;

//          int three = (int) "three";

//        What are the two different types of errors we are observing?

        // the first one will run but will error, the second wont run and it will error

//        Rewrite the following expressions using the relevant shorthand assignment operators:


             x = 4;
//        x = x + 5;
            x += 5;

              x = 3;
          int y = 4;
//        y = y * x;
            y *= x;

             x = 10;
             y = 2;
//        x = x / y;
//        y = y - x;

            x /= y;
            y -= x;

//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

        byte num = 127;
        System.out.println(++num);

        int num2 = Integer.MAX_VALUE;
        System.out.println(num2++);
        System.out.println(num2);

        // to big and the variable cannot fit; if you increment passed a max value; the value rolls over

    }
}