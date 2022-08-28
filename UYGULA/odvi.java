package UYGULA;

import java.util.Scanner;

public class odvi {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		System.out.print("Dilediðinizi yazýn: ");
		String dilediginiz=giris.nextLine();
		
		yaz(dilediginiz);
	}
	public static void yaz(String dilediginiz) {
		char karakter = 'e';
		int tane = 0;
		
		for(int i = 0;i < dilediginiz.length();i++) {
			if(karakter == dilediginiz.charAt(i)) {
				++tane;
			}
		}
		
	}
}
