public class node {
    int primaryKey;
    String firstName, lastName, streetAddress, city, state, zip, email, phone;
    node left, right;

    public node(int key, String firstName, String lastName, String streetAddress, String city, 
                String state, String zip, String email, String phone) {
        this.primaryKey = key;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phone = phone;
        this.left = null;
        this.right = null;
    }

    public String toString() {
        return "Primary Key: " + primaryKey + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Address: " + streetAddress + ", " + city + ", " + state + " " + zip + "\n" +
               "Email: " + email + "\n" +
               "Phone: " + phone + "\n";
    }
}
