package UYGULA;

import java.util.Scanner;

public class abr {

	public static void manin(String[] args) {
		Scanner g = new Scanner(System.in);
		int n=100;
		int[]dizi=new int[n];
		int sayi=0;
		System.out.println("1-100 aras�nda bir say�, ��k�� i�in 0 girin:");
		do {
			sayi=g.nextInt();
			dizi[sayi]++;
			
		}while(sayi!=0);
		
		for(int i=1;i<n;i++)
			if (dizi[i]>0)
				System.out.println(i+" say�s� " + dizi[i] + " defa ge�mektedir");
	}
}
