import java.util.Scanner;

public class EtkinlikOnerme {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		int sicaklik;
		System.out.println("Lütfen etkinlik önerisi için bir sýcaklýk giriniz: ");
		sicaklik = giris.nextInt();
		
		if(sicaklik >= 30) {
			System.out.println("Bugün size yüzmeyi öneririm...");
		}
		else if(sicaklik < 30 && sicaklik >= 0) {
			System.out.println("Bu gün size sinemaya gitmeyi öneririm...");
		}
		else if(sicaklik < 0 && sicaklik >= (-20)) {
			System.out.println("Bu gün size kayak merkezine gitmeyi öneririm(Kadýköy Kayak Merkezi Mesela)...");
		}
		else if(sicaklik < (-20) && sicaklik >= (-273)) {
			System.out.println("Antifreeze içmeni öneririm ;...");
		}
		else {
			System.out.println("Öyle bir sýcaklýk birimi yok");
		}
	}
}
