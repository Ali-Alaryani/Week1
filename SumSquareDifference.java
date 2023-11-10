
public class SumSquareDifference {

	public static void main(String[] args) {
        int n = 10; // Change this to the desired value of N

        // Calculate the square of the sum
        double squareOfSum = Math.pow((n * (n + 1) / 2.0), 2);

        // Calculate the sum of the squares
        double sumOfSquares = (n * (n + 1) * (2 * n + 1)) / 6.0;

        // Calculate the difference
        double difference = squareOfSum - sumOfSquares;

        // Display the result
        System.out.println("The difference is: " + difference);
    }
}

