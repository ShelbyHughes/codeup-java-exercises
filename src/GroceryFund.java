import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryFund {
    public static void main(String[] args){
        ArrayList<String> groceries = new ArrayList<>();
        HashMap<String, Integer> GroceryList = new HashMap<>();
        Input input = new Input();
        Boolean response = input.yesNo("Would you like to make a grocery list?");
        if(response.equals(true)){
            Boolean response2 = input.yesNo("Would you like to add an item?");
            do{
            if(response2.equals(true)){
                System.out.println("1 - Fruits & Vegetables");
                System.out.println("2 - Meat & Seafood");
                System.out.println("3 - Bakery & Bread");
                System.out.println("4 - Dairy & Eggs");
                System.out.println("5 - Deli & Prepared Food");
                System.out.println("6 - Pantry");
                System.out.println("7 - Frozen Food");
                System.out.println("8 - Beverages");
                System.out.println("9 - Everyday Essentials");
                System.out.println("10 - Health & Beauty");
                System.out.println("11 - Baby & Kid");
                System.out.println("12 - Home & Outdoor");
                System.out.println("13 - Pet");
                int selection = input.getInt(1, 13,"Pick a category: ");
                switch(selection){
                    case 1:
                            String userInput = input.getString("What Fruits & Vegetable item would you like to add?");
                            groceries.add(userInput);
                            int userNumber = input.getInt("How many?");
                            GroceryList.put(userInput, userNumber);
                        break;
                    case 2:
                            String userInput2 = input.getString("What Meat & Seafood item would you like to add?");
                            groceries.add(userInput2);
                        int userNumber2 = input.getInt("How many?");
                        GroceryList.put(userInput2, userNumber2);
                        break;
                    case 3:
                            String userInput3 = input.getString("What Bakery & Bread item would you like to add?");
                            groceries.add(userInput3);
                        int userNumber3 = input.getInt("How many?");
                        GroceryList.put(userInput3, userNumber3);
                        break;
                    case 4:
                        String userInput4 = input.getString("What Dairy & Eggs item would you like to add?");
                        groceries.add(userInput4);
                        int userNumber4 = input.getInt("How many?");
                        GroceryList.put(userInput4, userNumber4);
                        break;
                    case 5:
                        String userInput5 = input.getString("What Deli & Prepared Foods item would you like to add?");
                        groceries.add(userInput5);
                        int userNumber5 = input.getInt("How many?");
                        GroceryList.put(userInput5, userNumber5);
                        break;
                    case 6:
                        String userInput6 = input.getString("What Pantry item would you like to add?");
                        groceries.add(userInput6);
                        int userNumber6 = input.getInt("How many?");
                        GroceryList.put(userInput6, userNumber6);
                        break;
                    case 7:
                        String userInput7 = input.getString("What Frozen Food item would you like to add?");
                        groceries.add(userInput7);
                        int userNumber7 = input.getInt("How many?");
                        GroceryList.put(userInput7, userNumber7);
                        break;
                    case 8:
                        String userInput8 = input.getString("What Beverages item would you like to add?");
                        groceries.add(userInput8);
                        int userNumber8 = input.getInt("How many?");
                        GroceryList.put(userInput8, userNumber8);
                        break;
                    case 9:
                        String userInput9 = input.getString("What Everyday Essentials item would you like to add?");
                        groceries.add(userInput9);
                        int userNumber9 = input.getInt("How many?");
                        GroceryList.put(userInput9, userNumber9);
                        break;
                    case 10:
                        String userInput10 = input.getString("What Health & Beauty item would you like to add?");
                        groceries.add(userInput10);
                        int userNumber10 = input.getInt("How many?");
                        GroceryList.put(userInput10, userNumber10);
                        break;
                    case 11:
                        String userInput11 = input.getString("What Baby & Kid item would you like to add?");
                        groceries.add(userInput11);
                        int userNumber11 = input.getInt("How many?");
                        GroceryList.put(userInput11, userNumber11);
                        break;
                    case 12:
                        String userInput12 = input.getString("What Home & Outdoor item would you like to add?");
                        groceries.add(userInput12);
                        int userNumber12 = input.getInt("How many?");
                        GroceryList.put(userInput12, userNumber12);
                        break;
                    case 13:
                        String userInput13 = input.getString("What Pet item would you like to add?");
                        groceries.add(userInput13);
                        int userNumber13 = input.getInt("How many?");
                        GroceryList.put(userInput13, userNumber13);
                        break;
                    }
                }
            }while(input.yesNo("Do you want to enter another item?"));
        }
    }
}
