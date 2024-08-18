public class Activity3_Alojado {
    static String lastName = "Alojado";
    static String firstName = "Kent";
    static String brgy = "Narat-an"; 
    static String town = "Miagao"; 
    static String province = "Iloilo"; 

    public static void main(String[] args) {
        String fullName = firstName + " " + lastName;
        String address = brgy + ", " + town + ", " + province;
        byte byteValue = 127;
        double doubleValue = 355.5493023985183;
        long longValue = 993372830854775L;
        boolean booleanValue = true;
        int intValue = 847483948;
        short shortValue = 128;
        char charValue = 'A';
        float floatValue = 127.45292f;
        System.out.println("Name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println();
        System.out.println("The 8 Primitive Datatypes");
        System.out.println("boolean = " + booleanValue);
        System.out.println("double = " + doubleValue);
        System.out.println("long = " + longValue);
        System.out.println("byte = " + byteValue);
        System.out.println("int = " + intValue);
        System.out.println("short = " + shortValue);
        System.out.println("char = " + charValue);
        System.out.println("float = " + floatValue);
    }
}
