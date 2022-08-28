
package UYGULA;

import java.util.Scanner;

public class drsi {
	public static void kapanis() {
		System.out.println("Hak bitti...");
	}
	public static void soru() {
		System.out.println("faktöriyel bulma iþlemi...");
	}
	public static void faktoriyel() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayý: ");
		
		int sayi = scan.nextInt();
		int faktoriyel = 1;
		
		while (sayi > 0) {
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("Faktoriyel: " + faktoriyel);
		
	}
		public static void main(String[] args) {
		soru();
			faktoriyel();
		soru();
			faktoriyel();
		soru();
			faktoriyel();
		kapanis();	
	}

}
