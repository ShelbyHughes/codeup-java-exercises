package ContactManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private ArrayList<Contact> _contactList;

    public ContactList(){
        this._contactList = LoadContacts();
    }

    public ArrayList<Contact> LoadContacts(){
        ArrayList<Contact> tmpList = new ArrayList<Contact>();
        try{
            String directory = "data";
            String filename = "contacts.txt";

            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory, filename);

            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (! Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            Scanner reader = new Scanner(filename);
            while(reader.hasNextLine()){
                String[] line = reader.nextLine().split(",");
                tmpList.add(new Contact(line[0], line[1]));
            }
            reader.close();
        }catch(FileNotFoundException exc){
            System.out.println("Contacts File doesn't exist");
            exc.printStackTrace();
            return new ArrayList<Contact>();

        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
            return new ArrayList<Contact>();
        }
        return tmpList;
    }

    public void ShowAll(){
        for(Contact c : this._contactList){
            System.out.println(c.toString());
        }
    }

    public void addContact(Contact contact){
        this._contactList.add(contact);
    }

    public static class Contact{
        public String name;
        public String phone;

        public Contact(String name, String phone){
            this.name = name;
            this.phone = phone;
        }

        public String toString(){
            return this.name + "," + this.phone;
        }
    }
}
