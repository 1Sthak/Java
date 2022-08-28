package UYGULA;

import java.util.Scanner;

public class abf {
	public static void main(String[] args) {
		
		Scanner giris=new Scanner(System.in);
		
		System.out.println("Sayýsal bir rakam girin");
		int girilenSayi=giris.nextInt();
		int toplam=0;
		
		while(girilenSayi !=0){
			
			toplam=toplam+girilenSayi;
			System.out.println("Devam etmek için sýfýrdan farklý, çýkmak için 0 girin:");
			girilenSayi=giris.nextInt();
		}
		System.out.println("Girilen sayýlarýn toplamý: "+toplam);
		
	}
}
