public class Activity7_Alojado {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Initialize the arrays for even and odd numbers
        int[] odd = new int[numbers.length];
        int[] even = new int[numbers.length];
        int oddCount = 0;
        int evenCount = 0;

        // Separate numbers (odd and even)
        for (int number : numbers) {
            if ((number & 1) == 0) {
                even[evenCount++] = number;
            } else {
                odd[oddCount++] = number;
            }
        }

        // Calculate sums
        int sumOdd = 0;
        int sumEven = 0;

        // Print odd numbers and calculate their sum
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
            sumOdd += odd[i];
        }
        System.out.println();

        // Print even numbers and calculate their sum
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
            sumEven += even[i];
        }
        System.out.println();

        // Print the sums of numbers
        System.out.println("\nSum of Odd Array Elements: " + sumOdd);
        System.out.println("Sum of Even Array Elements: " + sumEven);
    }
}
