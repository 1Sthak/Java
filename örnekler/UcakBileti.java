import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int uzaklik, gidisGelis, yas, yolTip;
		double birimKmFiyat, normalFiyat, onIkiYasindanKucukler, onIkiYirmiDortArasi, altmisBestenBuyuk, gidisDonusFiyat;
		System.out.println("Yaþýnýzý Giriniz: ");
		yas = giris.nextInt();
		System.out.println("Gideceðiniz Mesafeyi Giriniz");
		uzaklik = giris.nextInt();
		System.out.println("Yolculuk Tipini Seçiniz\n1-) Tek yön 2-)Gidiþ Dönüþ");
		yolTip = giris.nextInt();
		birimKmFiyat = 0.1;
		normalFiyat = birimKmFiyat*uzaklik;
		onIkiYasindanKucukler = normalFiyat - (normalFiyat*0.5);
		onIkiYirmiDortArasi = normalFiyat - (normalFiyat*0.1);
		altmisBestenBuyuk = normalFiyat - (normalFiyat*0.3);
		
		if (yolTip == 1 && yas <= 12 && yas >= 0) {
			System.out.println("Fiyat : " + onIkiYasindanKucukler + "$");
		}
		else if (yolTip == 1 && yas <= 24 && yas > 12) {
			System.out.println("Fiyat : " + onIkiYirmiDortArasi + "$");
		}
		else if (yolTip == 1 && yas <= 65 && yas > 24) {
			System.out.println("Fiyat : " + normalFiyat + "$");
		}
		else if (yolTip == 1 && yas > 65 && yas <= 115) {
			System.out.println("Fiyat : " + altmisBestenBuyuk + "$");
		}
		else if (yolTip == 2 && yas <= 12 && yas >= 0) {
			System.out.println("Fiyat : " + (onIkiYasindanKucukler*2 - (onIkiYasindanKucukler*2*0.2)) + "$");
		}
		else if (yolTip == 2 && yas <= 24 && yas > 12) {
			System.out.println("Fiyat : " + (onIkiYirmiDortArasi*2 - (onIkiYirmiDortArasi*2*0.2)) + "$");
		}
		else if (yolTip == 2 && yas <= 65 && yas > 24) {
			System.out.println("Fiyat : " +	(normalFiyat*2 - (normalFiyat*2*0.2)) + "$");
		}
		else if (yolTip == 2 && yas > 65 && yas <= 115) {
			System.out.println("Fiyat : " + (altmisBestenBuyuk*2 - (altmisBestenBuyuk*2*0.2)) + "$");
		}
		else {
		System.out.println("Geçersiz Yaþ Veya Yolculuk Tipi");	
		}
	}
}
