package ContactManager;

import util.Input;

import java.util.Scanner;

public class ContactListApplication {
    public static void main(String[] args){
        boolean shouldContinue = true;
        Input input = new Input();
        ContactList cl = new ContactList();
        int selection = 1;
        Scanner scan = new Scanner(System.in);
        while(shouldContinue){
            System.out.println("1. View contacts");
            System.out.println("2. Add a new contact");
            System.out.println("3. Search a contact by name");
            System.out.println("4. Delete an existing contact");
            System.out.println("5. Exit");
            selection = input.getInt("Enter an option (1, 2, 3, 4 or 5): ");
            switch(selection){
                case 1:
                    cl.ShowAll();
                    break;
                case 2:
                    System.out.println("Enter a contact in the following format: 'name, phone number'");
                    String[] tmpContact = scan.nextLine().split(",");
                    cl.addContact(new ContactList.Contact(tmpContact[0], tmpContact[1]));
                    break;
                case 3:
                    System.out.println(selection);
                    break;
                case 4:
                    System.out.println(selection);
                    break;
                case 5:
                    System.out.println(selection);
                    shouldContinue = false;
                    break;
            }
        }
        scan.close();
    }
}
