import java.util.Scanner;

public class Fakt�riyelHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int faktoriyel=1, girilenSayi;
		
		System.out.println("Fakt�riyelini Bulmak istedi�iniz Sy�y� Giriniz: ");
		girilenSayi = scan.nextInt();
		
		while(girilenSayi > 0) {
			faktoriyel *= girilenSayi; 
			girilenSayi--;
		}
		System.out.println(faktoriyel);
	}
}