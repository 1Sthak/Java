import java.util.Scanner;

public class BankWhile {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int bakiye = 1000, inp, yatirma, cekme;
		String kul_adi, parola, data_kul_adi, data_parola;
		data_kul_adi = "Taha Konyar";
		data_parola = "123456";
		
		System.out.println("Kullanýcý adý giriniz: ");
		kul_adi = giris.nextLine();
		System.out.println("Parola giriniz");
		parola = giris.nextLine();
		
		if(data_kul_adi.equals(kul_adi) && data_parola.equals(parola)) {
			System.out.println("Hoþgeldin " + kul_adi);
			System.out.println("Güncel Bakiyeniz: " + bakiye + " TL");
		}
		else {
			System.out.println("Sizi Tanýyamadýk " + kul_adi);
		}
		while (bakiye > 0) {
			System.out.println();
			System.out.println("1-) Para Yatýr");
			System.out.println("2-) Para Çek");
			System.out.println("3-) Bakiye Sorgula");
			System.out.println("4-) Çýkýþ Yap");
			System.out.println();
			System.out.println("Yapmak Ýstediðiniz Ýþlemi Seçiniz...");
			inp = giris.nextInt();
			
			if(inp == 1) {
				System.out.println("Yatýrmak Ýstediðiniz Tutarý Giriniz: ");
				yatirma = giris.nextInt();
				bakiye += yatirma;
				System.out.println("Bakiyeniz: " + bakiye);
			}
			else if(inp == 2) {
				System.out.println("Çekmek Ýstediðiniz Tutarý Giriniz: ");
				cekme = giris.nextInt();
				if(cekme > bakiye) {
					System.out.println("Yetersiz Bakiye...");
					continue;
				}
				bakiye -= cekme;
				System.out.println("Bakiyeniz: " + bakiye);
			}
			else if(inp == 3) {
				System.out.println("Bakiyeniz: " + bakiye);
			}
			else if(inp == 4) {
				System.out.println("Çýkýþ Yapýlýyor...");
				break;
			}
			else {
				System.out.println("Yanlýþ Giriþ Try Again");
			}
		}
	}
}
