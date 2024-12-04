import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        PhonebookManager phonebook = new PhonebookManager();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nPhonebook Menu:");
            System.out.println("1. Add Entry");
            System.out.println("2. Modify Entry");
            System.out.println("3. Delete Entry");
            System.out.println("4. Move Entry (Bellingham to Seattle)");
            System.out.println("5. Print Phonebook");
            System.out.println("6. Quit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phonebook.addEntry(name, address, city, phoneNumber);
                    break;

                case "2":
                    System.out.print("Enter name to modify: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new address: ");
                    address = scanner.nextLine();
                    System.out.print("Enter new city: ");
                    city = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    phoneNumber = scanner.nextLine();
                    phonebook.modifyEntry(name, address, city, phoneNumber);
                    break;

                case "3":
                    System.out.print("Enter name to delete: ");
                    name = scanner.nextLine();
                    phonebook.deleteEntry(name);
                    break;

                case "4":
                    System.out.print("Enter name to move: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new city (Seattle): ");
                    city = scanner.nextLine();
                    phonebook.moveEntry(name, city);
                    break;

                case "5":
                    phonebook.printList();
                    break;

                case "6":
                    System.out.println("Exiting phonebook.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (!choice.equals("6"));

        scanner.close();
    }
}
