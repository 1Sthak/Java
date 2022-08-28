import java.util.Scanner;

public class SinifAtlama {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		double ortalama, turkce, matematik, fen, sosyal, beden;
		System.out.println("(0-100 arasý) Notlarý Giriniz...");
		System.out.println("Türkçe : ");
		turkce = giris.nextDouble();
		System.out.println("Matematik : ");
		matematik = giris.nextDouble();
		System.out.println("Fen Bilimleri : ");
		fen = giris.nextDouble();
		System.out.println("Sosyal Bilgiler : ");
		sosyal = giris.nextDouble();
		System.out.println("Beden Eðitimi : ");
		beden = giris.nextDouble();
		
		ortalama = ((turkce*0.25) + (matematik*0.25) + (fen*0.25) + (sosyal*0.15) + (beden*0.1));
	if (ortalama < 50) {
		System.out.println("Kaldýnýz, Ortalamanýz: " + ortalama  + "\nBelge : Siktirname");
		}
	else if (ortalama >= 50 && ortalama < 70) {
		System.out.println("Geçtiniz, Ortalamanýz: " + ortalama  + "\nBelge : Siktirname");
		}
	else if (ortalama >= 70 && ortalama <85) {
		System.out.println("Geçtiniz, Ortalamanýz: " + ortalama  + "\nBelge : Teþekkür");
		}
	else {
		System.out.println("Geçtiniz, Ortalamanýz: " + ortalama  + "\nBelge : Takdir");
		}
	}
}
