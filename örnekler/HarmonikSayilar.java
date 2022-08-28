import java.util.Scanner;

public class HarmonikSayilar {

	public static void main(String[] args) {
		double harmonic = 0.0;
		double girilenSayi;
		Scanner giris = new Scanner(System.in);
		System.out.println("Harmonik Sayýsý Giriniz: ");
		girilenSayi = giris.nextInt();
		
		
		while(girilenSayi > 0) {
			harmonic += (1/girilenSayi);
			girilenSayi--;
		}
		System.out.println(harmonic);
	}
}