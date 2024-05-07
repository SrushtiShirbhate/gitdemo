package Assesment;

public class Pattern {
    public static void main(String[] args) {
        int rows = 5;
        
        // Outer loop for rows
        for (int i = 0; i < rows; i++) {
            // Inner loop for columns
            for (int j = rows - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
