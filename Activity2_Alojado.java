public class Activity2_Alojado {
	static String firstName = "Kent Paul ";
	static String lastName = "Alojado";
	String barangay = "Narat-an";
	String municipality = "Miagao";
	String province = "Iloilo";
	
    public static void main(String[] args) {
		Activity2_Alojado location = new Activity2_Alojado();
        System.out.print("Name: ");
		System.out.println(firstName+lastName);
		System.out.print("Barangay: ");
		System.out.println(location.barangay);
		System.out.print("Municipality: ");
		System.out.println(location.municipality);
		System.out.print("Province: ");
		System.out.println(location.province);
		System.out.print("Age: ");
		int age = 34;
		System.out.println(age);
    }
}



