public class PascalTriangle {

    // Recursive method to calculate values in Pascal's Triangle
    public static int pascalValue(int row, int col) {
        if (col == 0 || col == row) {
            return 1; // Base case: the edges are always 1
        }
        return pascalValue(row - 1, col - 1) + pascalValue(row - 1, col); // Sum of two above numbers
    }

    // Prints method to display the triangle up to the given number of rows
    public static void printPascalTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalValue(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPascalTriangle(5); // Changes this value to print more or fewer rows
    }
}
