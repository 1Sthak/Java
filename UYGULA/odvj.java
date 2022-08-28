package UYGULA;

import java.util.Scanner;

public class odvj {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Adýnýz: ");
		String ad = giris.nextLine();
		yaz(ad);
	}
	public static void yaz(String ad) {
		String a = ad.replaceAll("\\s","");
		int uzunluk = a.length();
		System.out.println(ad + " ismi " + uzunluk + " kere yazýlacak:");
		for(int i=1;i<=uzunluk;i++) {
			System.out.println(i+"."+ad);
		}
	}
}
