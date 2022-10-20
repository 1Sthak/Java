import java.util.Scanner;

public class BankWhile {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int bakiye = 1000, inp, yatirma, cekme;
		String kul_adi, parola, data_kul_adi, data_parola;
		data_kul_adi = "Taha Konyar";
		data_parola = "0124";
		
		System.out.println("Kullan�c� ad� giriniz: ");
		kul_adi = giris.nextLine();
		System.out.println("Parola giriniz");
		parola = giris.nextLine();
		
		if(data_kul_adi.equals(kul_adi) && data_parola.equals(parola)) {
			System.out.println("Ho�geldin " + kul_adi);
			System.out.println("G�ncel Bakiyeniz: " + bakiye + " TL");
		}
		else {
			System.out.println("Sizi Tan�yamad�k " + kul_adi);
		}
		while (bakiye > 0) {
			System.out.println();
			System.out.println("1-) Para Yat�r");
			System.out.println("2-) Para �ek");
			System.out.println("3-) Bakiye Sorgula");
			System.out.println("4-) ��k�� Yap");
			System.out.println();
			System.out.println("Yapmak �stedi�iniz ��lemi Se�iniz...");
			inp = giris.nextInt();
			
			if(inp == 1) {
				System.out.println("Yat�rmak �stedi�iniz Tutar� Giriniz: ");
				yatirma = giris.nextInt();
				bakiye += yatirma;
				System.out.println("Bakiyeniz: " + bakiye);
			}
			else if(inp == 2) {
				System.out.println("�ekmek �stedi�iniz Tutar� Giriniz: ");
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
				System.out.println("��k�� Yap�l�yor...");
				break;
			}
			else {
				System.out.println("Yanl�� Giri� Try Again");
			}
		}
	}
}
