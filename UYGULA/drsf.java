package UYGULA;

import java.util.Scanner;

public class drsf {

	public static void main(String[] args) {
		
		//while(koþul);
		
		Scanner scan = new Scanner(System.in);
		 
		int sayi = scan.nextInt();
		int toplam = 0;
		do {
			toplam += sayi % 10;
			
			sayi = sayi /10;
			
			System.out.println(" Toplam= " + toplam + " Sayý= " + sayi);
			
			
			
		}
		while(sayi > 0);
		
		System.out.println(" Toplam= " + toplam);
		
		
		
		
	}
}
