public class BinarySearchTree {
    private node root;

    public void add(int key, String firstName, String lastName, String streetAddress, 
                    String city, String state, String zip, String email, String phone) {
        root = addRecursive(root, key, firstName, lastName, streetAddress, city, state, zip, email, phone);
    }

    private node addRecursive(node current, int key, String firstName, String lastName, String streetAddress, 
                               String city, String state, String zip, String email, String phone) {
        if (current == null) {
            return new node(key, firstName, lastName, streetAddress, city, state, zip, email, phone);
        }
        if (key < current.primaryKey) {
            current.left = addRecursive(current.left, key, firstName, lastName, streetAddress, city, state, zip, email, phone);
        } else if (key > current.primaryKey) {
            current.right = addRecursive(current.right, key, firstName, lastName, streetAddress, city, state, zip, email, phone);
        }
        return current;
    }

    public void delete(int key) {
        root = deleteRecursive(root, key);
    }

    private node deleteRecursive(node current, int key) {
        if (current == null) {
            return null;
        }
        if (key == current.primaryKey) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            node smallest = findSmallest(current.right);
            current.primaryKey = smallest.primaryKey;
            current.firstName = smallest.firstName;
            current.lastName = smallest.lastName;
            current.streetAddress = smallest.streetAddress;
            current.city = smallest.city;
            current.state = smallest.state;
            current.zip = smallest.zip;
            current.email = smallest.email;
            current.phone = smallest.phone;
            current.right = deleteRecursive(current.right, smallest.primaryKey);
            return current;
        }
        if (key < current.primaryKey) {
            current.left = deleteRecursive(current.left, key);
        } else {
            current.right = deleteRecursive(current.right, key);
        }
        return current;
    }

    private node findSmallest(node root) {
        return root.left == null ? root : findSmallest(root.left);
    }

    public void traverseInOrder() {
        traverseInOrderRecursive(root);
    }

    private void traverseInOrderRecursive(node node) {
        if (node != null) {
            traverseInOrderRecursive(node.left);
            System.out.println(node);
            traverseInOrderRecursive(node.right);
        }
    }

    public void traversePreOrder() {
        traversePreOrderRecursive(root);
    }

    private void traversePreOrderRecursive(node node) {
        if (node != null) {
            System.out.println(node);
            traversePreOrderRecursive(node.left);
            traversePreOrderRecursive(node.right);
        }
    }

    public void traversePostOrder() {
        traversePostOrderRecursive(root);
    }

    private void traversePostOrderRecursive(node node) {
        if (node != null) {
            traversePostOrderRecursive(node.left);
            traversePostOrderRecursive(node.right);
            System.out.println(node);
        }
    }

    public int countNodes() {
        return countNodesRecursive(root);
    }

    private int countNodesRecursive(node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodesRecursive(node.left) + countNodesRecursive(node.right);
    }
}
