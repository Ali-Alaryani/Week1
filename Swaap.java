
public class Swaap {

    public static void main(String[] args) {
        // Declare integer variables
        int x = 8;
        int y = 3;
        int z;

        // Display values before the swap
        System.out.println("Before swapping - X: " + x + ", Y: " + y);

        // Swap using a temporary variable
        z = x; // Store the value of x in z
        x = y; // Assign the value of y to x
        y = z; // Assign the stored value of x (in z) to y
    
        // Display the swapped values
    }
    {
        System.out.println("After swapping - X: " + x + ", Y: " + y);
    }
}