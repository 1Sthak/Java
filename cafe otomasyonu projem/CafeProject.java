import java.util.Scanner;

public class CafeProject {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);

		int sepetGiris;
		double kacKilo, toplamSepet = 0.00, cocaCola = 12.85, doritos = 7.75, ekler = 13.00, pringles = 19.45,
				petibor = 7.45, tuvaletKagidi = 23.85, pril = 25.95, deterjan = 65.75, salca = 17.00, heinz = 16.35,
				tavukBirimKilo = 32, elmaBirimKilo = 5.50, portakalBirimKilo = 8.00, domatesBirimKilo = 16;
		String kul_adi, parola, data_kul_adi, data_parola, adres_bilgisi;
		data_kul_adi = "konyartaha1905";
		data_parola = "123456";

		System.out.println("Kullanýcý Adý Giriniz : ");
		kul_adi = giris.nextLine();

		System.out.println("Parola Giriniz : ");
		parola = giris.nextLine();
		
		while (true) {
			if (data_kul_adi.equals(kul_adi) && data_parola.equals(parola)) {
				System.out.println("Hoþgeldin " + kul_adi + " ^-^\n");
				System.out.println("Adres bilgisi giriniz: ");
		adres_bilgisi = giris.nextLine();
			} else {
				System.out.println("Sizi tanýyamadýk" + " " + kul_adi + "\n");
				break;
			}
			System.out.println(
					"1(-	-) CocaCola (2,5L): 12,85 TL\n2(-	-) Doritos Taco: 7,75 TL\n3(-	-) Ekler: 13 TL\n4(-	-) Pringles: 19,45 TL\n5(-	-) Ülker Petibör Bisküvi: 7,45 TL\n6(-	-) Tuvalet Kaðýdý (12'li): 23,85 TL\n7(-	-) Pril (1L): 25,95 TL\n8(-	-) Toz Deterjan (5 Kg): 65,75 TL\n9(-	-) Salça: 17 TL\n10(-	-) Heinz Ketçap: 16,35 TL\n11(-	-) Tavuk Göðüsü: 32 TL/Kg\n12(-	-) Elma: 5,50 TL/Kg\n13(-	-) Portakal: 8 TL/Kg\n14(-	-) Domates: 16 TL/Kg\n\n15-) Sepeti Onayla?");
			while (true) {
				sepetGiris = giris.nextInt();
				if (sepetGiris == 1) {
					toplamSepet = toplamSepet + cocaCola;
					System.out.println("CocaCola: " + cocaCola + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 2) {
					toplamSepet = toplamSepet + doritos;
					System.out.println("Doritos Taco: " + doritos + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 3) {
					toplamSepet = toplamSepet + ekler;
					System.out.println("Ekler: " + ekler + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 4) {
					toplamSepet = toplamSepet + pringles;
					System.out.println("Pringles: " + pringles + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 5) {
					toplamSepet = toplamSepet + petibor;
					System.out.println("Ülker Petibör Bisküvi: " + petibor + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 6) {
					toplamSepet = toplamSepet + tuvaletKagidi;
					System.out.println("Tuvalet Kaðýdý: " + tuvaletKagidi + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 7) {
					toplamSepet = toplamSepet + pril;
					System.out.println("Pril: " + pril + "TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 8) {
					toplamSepet = toplamSepet + deterjan;
					System.out.println("Toz Deterjan: " + deterjan + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 9) {
					toplamSepet = toplamSepet + salca;
					System.out.println("Salça: " + salca + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 10) {
					toplamSepet = toplamSepet + heinz;
					System.out.println("Heinz Ketçap: " + heinz + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 11) {
					System.out.println("Kaç Kilo Olsun?");
					kacKilo = giris.nextDouble();
					toplamSepet = toplamSepet + (kacKilo * tavukBirimKilo);
					System.out.println(kacKilo + " Kg Tavuk Göðsü: " + (kacKilo * tavukBirimKilo) + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 12) {
					System.out.println("Kaç Kilo Olsun?");
					kacKilo = giris.nextDouble();
					toplamSepet = toplamSepet + (kacKilo * elmaBirimKilo);
					System.out.println(kacKilo + " Kg Elma: " + (kacKilo * elmaBirimKilo) + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 13) {
					System.out.println("Kaç Kilo Olsun?");
					kacKilo = giris.nextDouble();
					toplamSepet = toplamSepet + (kacKilo * portakalBirimKilo);
					System.out.println(kacKilo + " Kg Portakal: " + (kacKilo * portakalBirimKilo) + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 14) {
					System.out.println("Kaç Kilo Olsun?");
					kacKilo = giris.nextDouble();
					toplamSepet = toplamSepet + (kacKilo * domatesBirimKilo);
					System.out.println(kacKilo + " Kg Domates: " + (kacKilo * domatesBirimKilo) + " TL");
					System.out.println("Sepettekilerin Toplamý " + toplamSepet + " TL");
				} else if (sepetGiris == 15) {

					System.out.println("Sepet Onaylanýyor...");
					System.out.println("Toplam Tutar: " + toplamSepet + " TL");
					System.out.println("Sipariþ " + adres_bilgisi + " Hedefine Gönderiliyor...");
					break;
				} else {
					System.out.println("Geçersiz giriþ tekrar dene...");
				}
			}
			break;
		}
	}
}