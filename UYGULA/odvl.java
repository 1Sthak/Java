package UYGULA;

import java.util.Scanner;

public class odvl {

	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
		System.out.print("Girilecek sayý miktarýný girin: ");
		int n = g.nextInt();
		double[] sayý = new double[n];
		double toplam = 0;
		for(int i=0;i<n;i++) {
			System.out.print((i+1)+".sayýyý girin: ");
			sayý[i] = g.nextDouble();
			toplam +=sayý[i];
			
		}
		System.out.println("Girilen sayýlarýn toplamý= " + toplam);
		double ort = toplam/n;
		System.out.print("Girilen deðerlerin ortalamasý= " + ort);
	}
}
