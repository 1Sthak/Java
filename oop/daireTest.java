package oop;

public class daireTest {

	public static void main(String[] args) {
		
		daire d1 = new daire();
		System.out.println("�ap \t: "+ d1.cap_oku());
		System.out.println("�evre \t: "+ d1.cevre_oku());
		System.out.println("Alan \t: "+ d1.alan_oku());
		d1.r_degistir(1);
		System.out.println("Alan \t: " + d1.alan_oku());
		System.out.println("__________________________________");
		daire d2 = new daire(20);
		System.out.println("�ap \t: "+ d2.cap_oku());
		System.out.println("�evre \t: "+ d2.cevre_oku());
		System.out.println("Alan \t: "+ d2.alan_oku());
	}

}
