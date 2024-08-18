public class Activity8_Alojado {
    public static void main(String[] args) {
        String word = "PneumonouLtraMicrosCopicSilicovolcanoconiosiS";
        StringBuilder consonants = new StringBuilder();
        int consCount = 0;
        for (char ch : word.toCharArray()) {
        // Consonant Checker
            if (isConsonant(ch)) {
                consonants.append(ch).append(" ");
                consCount++;
            }
        }
		//Print Consonants and the total number
        System.out.println("Consonants: " + consonants.toString().trim());
        System.out.println("Total: " + consCount);
    }
    public static boolean isConsonant(char ch) {
        return Character.isLetter(ch) && !"aeiouAEIOU".contains(Character.toString(ch));
    }
}
