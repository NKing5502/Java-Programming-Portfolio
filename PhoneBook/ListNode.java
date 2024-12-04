public class ListNode {
    private String name;
    private String address;
    private String city;
    private String phoneNumber;
    private ListNode next;

    public ListNode(String name, String address, String city, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }

    // Getters and setters for each field
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getPhoneNumber() { return phoneNumber; }
    public ListNode getNext() { return next; }

    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setCity(String city) { this.city = city; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setNext(ListNode next) { this.next = next; }

    
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", City: " + city + ", Phone: " + phoneNumber;
    }
}
