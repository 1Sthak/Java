package UYGULA;

public class drso {
	public static void main(String[] args) {

		String s1 = new String("Taha");
		String s2 = new String("Taha");
		
		if (s1.equals(s2)) {
			System.out.println("Eþit");
		}
		else {
			System.out.println("Eþit Deðil");
		}
	Carb car1 = new Carb("Beyaz","Peguot",1.6,4);

	Carb car2 = car1;	
	
	car2.showInfos();
		
	Carb car3 = null;
		
	
	}
}
