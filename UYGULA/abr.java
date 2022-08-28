package UYGULA;

import java.util.Scanner;

public class abr {

	public static void manin(String[] args) {
		Scanner g = new Scanner(System.in);
		int n=100;
		int[]dizi=new int[n];
		int sayi=0;
		System.out.println("1-100 arasýnda bir sayý, çýkýþ için 0 girin:");
		do {
			sayi=g.nextInt();
			dizi[sayi]++;
			
		}while(sayi!=0);
		
		for(int i=1;i<n;i++)
			if (dizi[i]>0)
				System.out.println(i+" sayýsý " + dizi[i] + " defa geçmektedir");
	}
}
