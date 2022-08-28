package UYGULA;

import java.util.Scanner;

public class drse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bakiye = 1000;
		int islem;
		
		System.out.println("1: Bakiye Görüntüle");
		System.out.println("2: Para Yatýrma");
		System.out.println("3: Para Çekme");
		System.out.println("4: Sistemden Çýkýþ");
		
		islem = scan.nextInt();
		
		 switch(islem) {
		case 1:
			System.out.println("Bakiyeniz " + bakiye + "TL dir");
			break;
		case 2:
			System.out.println("Ne Kadar Yatýracaksýnýz?:");
			int miktar = scan.nextInt();
			
			bakiye = bakiye += miktar;
			System.out.println("Bakiyeniz : " + bakiye + "TL dir");
			break;
 		case 3:
			System.out.println("Ne Kadar Çekeceksiniz?:");
            miktar = scan.nextInt();
			
			bakiye = bakiye -= miktar;
			System.out.println("Bakiyeniz : " + bakiye + "TL dir");
			break;
 		case 4:
 			System.out.println("Sistemden Çýkýlýyor...");
 			break;
		}
	}
}
