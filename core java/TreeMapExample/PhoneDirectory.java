package TreeMapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {
    // The map is private and can only be accessed within the class
    private final Map<String, String> directory;

    public PhoneDirectory() {
        // The map is initialized in the constructor
        this.directory = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        // The put method is used to add a key-value pair to the map
        this.directory.put(name, phoneNumber);
    }

    public String getPhoneNumber(String name) {
        // The get method is used to retrieve the value associated with a key
        return this.directory.get(name);
    }

    public static void main(String[] args) {
        // An instance of the PhoneDirectory class is created
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        Scanner scanner = new Scanner(System.in);
        String name, phoneNumber;
        int choice;

        while (true) {
            // The user is prompted to enter their choice
            System.out.println("1. Add Contact");
            System.out.println("2. Find Phone Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                // The addContact method is called if the user chooses 1
                case 1:
                    System.out.print("Enter Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    phoneNumber = scanner.nextLine();
                    phoneDirectory.addContact(name, phoneNumber);
                    break;
                case 2:
                    // The getPhoneNumber method is called if the user chooses 2
                    System.out.print("Enter Name: ");
                    name = scanner.nextLine();
                    // The phone number is printed if it exists
                    phoneNumber = phoneDirectory.getPhoneNumber(name);
                    if (phoneNumber != null) {
                        System.out.println("Phone Number: " + phoneNumber);
                    } else {
                        System.out.println("No such contact exists.");
                    }
                    break;
                case 3:
                    // The program exits if the user chooses 3
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    // An error message is printed if the user chooses an invalid option
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
