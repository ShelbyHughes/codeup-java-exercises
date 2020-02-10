import grades.Student;
import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class ContactsManagerCLI {
    public static void main(String[] args) throws IOException {
        Input input = new Input();
        HashMap<String, Long> contacts = new HashMap<>();
        String directory = "data";
        String filename = "contacts.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
        if(Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
        }
        if(! Files.exists(dataFile)){
            Files.createFile(dataFile);
        }
        contacts.put("Jack Blank", (long) 1231231234);
        contacts.put("Jane Doe", (long) 2342342345);
        do{
            System.out.println("1. View contacts.");
            System.out.println("2. Add a new contact.");
            System.out.println("3. Search a contact by name.");
            System.out.println("4. Delete an existing contact.");
            System.out.println("5. Exit.");
            int number = input.getInt("Enter an option (1, 2, 3, 4, or 5): ");
            switch (number) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
            }
        }while(input.yesNo("Would you like to make another selection?"));

    }
}
