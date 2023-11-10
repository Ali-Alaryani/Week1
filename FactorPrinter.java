
public class FactorPrinter {

	public static void main(String[] args) {
        // Given number for which factors are to be found
        int n = 24;

        // Print factors
        System.out.print("Factors of " + n + ": ");
        
        // Loop to find and print factors
        for (int i = 1; i <= n; i++) {
            // Check if i is a factor of the given number
            if (n % i == 0) {
                // Print the factor
                System.out.println(i + " ");
            }
        }
    }
}