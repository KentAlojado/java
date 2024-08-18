public class Activity6_Alojado {
    public static void main(String[] args) {
        int startNumber = 1; // Initialize the initial number
        int iteration = 10; // Initialize the number of iterations
        int commonDifference = 6; // Initialize the common difference.I used 6

        // Initialize variables for sum and product
        int sum = 0;
        long product = 1;
        
        // StringBuilder for concatenating the result
        StringBuilder sumResult = new StringBuilder();
        StringBuilder productResult = new StringBuilder();

        // Loop to generate the series and compute sum and product
        for (int i = 0; i < iteration; i++) {
            int currentNumber = startNumber + i * commonDifference;
            
            // Append the current number to the sum result string
            sumResult.append(currentNumber);
            if (i < iteration - 1) {
                sumResult.append(" + ");
            }
            
            // Append the current number to the product result string
            productResult.append(currentNumber);
            if (i < iteration - 1) {
                productResult.append(" * ");
            }
            
            // Update sum and product
            sum += currentNumber;
            product *= currentNumber;
        }

        // Print the results
        System.out.println("Initial Number: " + startNumber);
        System.out.println("No. of Iterations: " + iteration);
        System.out.println("Common Difference: " + commonDifference);
        System.out.println();
        System.out.println("Sum: " + sumResult.toString() + " = " + sum);
        System.out.println("Product: " + productResult.toString() + " = " + product);
    }
}
