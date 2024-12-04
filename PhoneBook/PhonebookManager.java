
public class PhonebookManager {
    private ListNode head;

    public PhonebookManager() {
        this.head = null;
    }

    // Adds an entry at the end and sort by last name
    public void addEntry(String name, String address, String city, String phoneNumber) {
        ListNode newNode = new ListNode(name, address, city, phoneNumber);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        sortEntries();
    }

    // Sorts entries alphabetically by last name
    private void sortEntries() {
        if (head == null || head.getNext() == null) return;
        
        ListNode current, index;
        String tempName, tempAddress, tempCity, tempPhone;

        for (current = head; current.getNext() != null; current = current.getNext()) {
            for (index = current.getNext(); index != null; index = index.getNext()) {
                String currentLastName = getLastName(current.getName());
                String indexLastName = getLastName(index.getName());

                if (currentLastName.compareTo(indexLastName) > 0) {
                    // Swap node data
                    tempName = current.getName();
                    tempAddress = current.getAddress();
                    tempCity = current.getCity();
                    tempPhone = current.getPhoneNumber();

                    current.setName(index.getName());
                    current.setAddress(index.getAddress());
                    current.setCity(index.getCity());
                    current.setPhoneNumber(index.getPhoneNumber());

                    index.setName(tempName);
                    index.setAddress(tempAddress);
                    index.setCity(tempCity);
                    index.setPhoneNumber(tempPhone);
                }
            }
        }
    }

    private String getLastName(String fullName) {
        String[] parts = fullName.split(" ");
        return parts[parts.length - 1];
    }

    // Modifys an entry
    public void modifyEntry(String name, String newAddress, String newCity, String newPhoneNumber) {
        ListNode current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                current.setAddress(newAddress);
                current.setCity(newCity);
                current.setPhoneNumber(newPhoneNumber);
                return;
            }
            current = current.getNext();
        }
        System.out.println("Entry not found.");
    }

    // Deletes an entry
    public void deleteEntry(String name) {
        if (head == null) return;

        if (head.getName().equals(name)) {
            head = head.getNext();
            return;
        }

        ListNode current = head;
        while (current.getNext() != null) {
            if (current.getNext().getName().equals(name)) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
        System.out.println("Entry not found.");
    }

    // Moves entries between cities
    public void moveEntry(String name, String newCity) {
        ListNode current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                current.setCity(newCity);
                return;
            }
            current = current.getNext();
        }
        System.out.println("Entry not found.");
    }

    // Prints the entire phonebook
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
