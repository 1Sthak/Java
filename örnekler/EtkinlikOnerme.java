import java.util.Scanner;

public class EtkinlikOnerme {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		int sicaklik;
		System.out.println("L�tfen etkinlik �nerisi i�in bir s�cakl�k giriniz: ");
		sicaklik = giris.nextInt();
		
		if(sicaklik >= 30) {
			System.out.println("Bug�n size y�zmeyi �neririm...");
		}
		else if(sicaklik < 30 && sicaklik >= 0) {
			System.out.println("Bu g�n size sinemaya gitmeyi �neririm...");
		}
		else if(sicaklik < 0 && sicaklik >= (-20)) {
			System.out.println("Bu g�n size kayak merkezine gitmeyi �neririm(Kad�k�y Kayak Merkezi Mesela)...");
		}
		else if(sicaklik < (-20) && sicaklik >= (-273)) {
			System.out.println("Antifreeze i�meni �neririm ;...");
		}
		else {
			System.out.println("�yle bir s�cakl�k birimi yok");
		}
	}
}
