package UYGULA;

import java.util.Scanner;

public class drse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bakiye = 1000;
		int islem;
		
		System.out.println("1: Bakiye G�r�nt�le");
		System.out.println("2: Para Yat�rma");
		System.out.println("3: Para �ekme");
		System.out.println("4: Sistemden ��k��");
		
		islem = scan.nextInt();
		
		 switch(islem) {
		case 1:
			System.out.println("Bakiyeniz " + bakiye + "TL dir");
			break;
		case 2:
			System.out.println("Ne Kadar Yat�racaks�n�z?:");
			int miktar = scan.nextInt();
			
			bakiye = bakiye += miktar;
			System.out.println("Bakiyeniz : " + bakiye + "TL dir");
			break;
 		case 3:
			System.out.println("Ne Kadar �ekeceksiniz?:");
            miktar = scan.nextInt();
			
			bakiye = bakiye -= miktar;
			System.out.println("Bakiyeniz : " + bakiye + "TL dir");
			break;
 		case 4:
 			System.out.println("Sistemden ��k�l�yor...");
 			break;
		}
	}
}
