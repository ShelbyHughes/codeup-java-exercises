package review;

import java.util.ArrayList;

public class AssessmentReview {
    public static int square(int a){
        return a * a;
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static double average(int[] nums){
        int sum = 0;
        for(int i= 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum/nums.length;
    }
    public static ArrayList<User> capitalizeRecords(ArrayList<User> users) throws IllegalAccessException {
        ArrayList<User> users2 = new ArrayList<>();
        for(User user : users){
            char[] firstNameLetters = user.getFirstName().toCharArray();
            if(Character.isLowerCase(firstNameLetters[0])){
                firstNameLetters[0] = Character.toUpperCase(firstNameLetters[0]);
            }
            String firstName = new String(firstNameLetters);

            char[] lastNameLetters = user.getLastName().toCharArray();
            if(Character.isLowerCase(lastNameLetters[0])){
                lastNameLetters[0] = Character.toUpperCase(lastNameLetters[0]);
            }
            String lastName = new String(lastNameLetters);
            users2.add(new User(firstName, lastName, user.isAdmin()));
        }
        return users2;
    }
 }
