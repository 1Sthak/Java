package UYGULA;

import java.util.Scanner;

public class abg {

	public static void main(String[] args) {
		
		Scanner g=new Scanner(System.in);
		System.out.print("Adýnýz? ");
		String ad=g.nextLine();
		yaz(ad);
		
	}
	public static void yaz(String ad) {
		int uzunluk=ad.length();
		System.out.println(ad + " ismi "+ uzunluk + " kere yazýlacak ");
		for(int i=1; i<=uzunluk;i++) {
			System.out.println(i+"."+ad);
		}
	}
}
