package UYGULA;

import java.util.Scanner;

public class abf {
	public static void main(String[] args) {
		
		Scanner giris=new Scanner(System.in);
		
		System.out.println("Say�sal bir rakam girin");
		int girilenSayi=giris.nextInt();
		int toplam=0;
		
		while(girilenSayi !=0){
			
			toplam=toplam+girilenSayi;
			System.out.println("Devam etmek i�in s�f�rdan farkl�, ��kmak i�in 0 girin:");
			girilenSayi=giris.nextInt();
		}
		System.out.println("Girilen say�lar�n toplam�: "+toplam);
		
	}
}
