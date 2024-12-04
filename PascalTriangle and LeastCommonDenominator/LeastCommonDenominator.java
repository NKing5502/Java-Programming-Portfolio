public class LeastCommonDenominator {

    // Recursive method to find the GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: if the second number is 0, return the first number
        }
        return gcd(b, a % b); // Recursive call
    }

    // Method to find the LCM using the GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Main method to calculate LCD for two denominators and display the result
    public static void main(String[] args) {
        int denom1 = 10;
        int denom2 = 4;
        int lcd = lcm(denom1, denom2);
        System.out.println("The Least Common Denominator of " + denom1 + " and " + denom2 + " is: " + lcd);
    }
}
