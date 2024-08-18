public class Activity5_Alojado {
    public static void main(String[] args) {
        int number = 11;
        boolean isEvenNumber = (number % 2) == 0;  
        isEvenNumber = !isEvenNumber;
        System.out.println(isEvenNumber);
        number += (number % 2);
        System.out.println(number);
    }
}