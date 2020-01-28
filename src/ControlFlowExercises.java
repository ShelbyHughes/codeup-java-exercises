import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String args[]) {
        int i = 5;
        while(i <= 15){
            System.out.println(i);
            i++;
        }

        int l = 100;
        do{
            System.out.println(l);
            l-=5;
        }while(l > -10);

        long c = 2;
        do {
            System.out.println(c);
            c*=c;
        } while(c < 1000000);

        for(int k = 5; k <= 15; k++){
            System.out.println(k);
        }

        for(int m = 100; m > -10; m-=5){
            System.out.println(m);
        }

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

        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to? ");
        int number = scanner.nextInt();
        int counter = 1;
        for (int j = 0; j < number; j++)
        {
            int y = 1;
            for (int p = counter; p < counter + 3; p++)
            {
                y = y * counter;
                System.out.print(y + " " );
            }
            System.out.println();
            counter++;
        }

        char a;
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
             a = scanner.next().charAt(0);;

            if(a == 'y' || a == 'Y') {
                System.out.println("Contine \t\t" + a);
            }else {
                System.out.println("End Program \t\t" + a);
            }

        }while(a =='Y'|| a =='y');
    }
}

