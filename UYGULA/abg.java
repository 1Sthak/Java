package UYGULA;

import java.util.Scanner;

public class abg {

	public static void main(String[] args) {
		
		Scanner g=new Scanner(System.in);
		System.out.print("Ad�n�z? ");
		String ad=g.nextLine();
		yaz(ad);
		
	}
	public static void yaz(String ad) {
		int uzunluk=ad.length();
		System.out.println(ad + " ismi "+ uzunluk + " kere yaz�lacak ");
		for(int i=1; i<=uzunluk;i++) {
			System.out.println(i+"."+ad);
		}
	}
}
