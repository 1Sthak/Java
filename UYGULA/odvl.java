package UYGULA;

import java.util.Scanner;

public class odvl {

	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
		System.out.print("Girilecek say� miktar�n� girin: ");
		int n = g.nextInt();
		double[] say� = new double[n];
		double toplam = 0;
		for(int i=0;i<n;i++) {
			System.out.print((i+1)+".say�y� girin: ");
			say�[i] = g.nextDouble();
			toplam +=say�[i];
			
		}
		System.out.println("Girilen say�lar�n toplam�= " + toplam);
		double ort = toplam/n;
		System.out.print("Girilen de�erlerin ortalamas�= " + ort);
	}
}
