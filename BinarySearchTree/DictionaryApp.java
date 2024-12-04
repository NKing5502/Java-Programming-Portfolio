import java.util.Scanner;

public class DictionaryApp {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "=============================\n" +
            "||   BINARY SEARCH TREE    ||\n" +
            "||        DICTIONARY       ||\n" +
            "||     BY Nick King        ||\n" +
            "=============================\n" +
            "||     [ Add Records ]     ||\n" +
            "||   [ Search Records ]    ||\n" +
            "||   [ Delete Records ]    ||\n" +
            "||   [ Modify Records ]    ||\n" +
            "============================="
        );

        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Record");
            System.out.println("2. Delete Record");
            System.out.println("3. Lookup Record (In-Order)");
            System.out.println("4. Lookup Record (Pre-Order)");
            System.out.println("5. Lookup Record (Post-Order)");
            System.out.println("6. Count Records");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumes newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Primary Key: ");
                    int key = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Street Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter State: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter Zip: ");
                    String zip = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    bst.add(key, firstName, lastName, address, city, state, zip, email, phone);
                    System.out.println("Record added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Primary Key to Delete: ");
                    int deleteKey = scanner.nextInt();
                    bst.delete(deleteKey);
                    System.out.println("Record deleted if it existed!");
                    break;
                case 3:
                    System.out.println("In-Order Traversal:");
                    bst.traverseInOrder();
                    break;
                case 4:
                    System.out.println("Pre-Order Traversal:");
                    bst.traversePreOrder();
                    break;
                case 5:
                    System.out.println("Post-Order Traversal:");
                    bst.traversePostOrder();
                    break;
                case 6:
                    System.out.println("Total Records: " + bst.countNodes());
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
