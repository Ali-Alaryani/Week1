
public class CompoundInterest {

	public static void main(String[] args) {
        // Principal amount
        double p = 1200;
        // Rate of interest
        double r = 5.4;
        // Time span in years
        double t = 2;

        // Compound interest calculation using the formula: P * (1 + R/100)^T
        // Math.pow is used to calculate the power (exponentiation) in the formula
       	double CompoundInterest = p * Math.pow(1 + r / 100, t);
       	//print
       		System.out.println("CompoundInterest = " + CompoundInterest);
       		  }
}