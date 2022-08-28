import java.util.Scanner;

public class FaktöriyelHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int faktoriyel=1, girilenSayi;
		
		System.out.println("Faktöriyelini Bulmak istediðiniz Syýyý Giriniz: ");
		girilenSayi = scan.nextInt();
		
		while(girilenSayi > 0) {
			faktoriyel *= girilenSayi; 
			girilenSayi--;
		}
		System.out.println(faktoriyel);
	}
}