package UYGULA;

import java.util.Scanner;

public class abo {

	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
		System.out.print("Kaç Kiþi Girilecek");
		int n = g.nextInt();
		
		String[] ad = new String[n];
		double[] vize = new double[n];
		double toplam = 0;
		for(int i = 0;i < n;i++) {
			System.out.print((i + 1) + " .kiþinin adý: ");
			ad[i] = g.next();
			System.out.print((i + 1) + " .kiþinin vizesi: ");
			vize[i] = g.nextDouble();
			toplam += vize[i];
		}
	double ortalama = toplam/n;
	System.out.println("Ortalama = " + ortalama);
	System.out.println("Adý\t\tVizesi");
	for(int i = 0;i < n;i++) {
		if(vize[i] > ortalama)
			System.out.println(ad[i] + "\t\t" + vize[i]);
	}
	
	}
}
