package UYGULA;

import java.util.Scanner;

public class odvk {

	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
		
		System.out.print("Sýralanacak sayý miktarýný girin: ");
		int n = g.nextInt();
		if(n==0 || n<0) {
			System.out.print("Yanlýþ giriþ yaptýnýz!");
			System.exit(n);
		}
		double[] sayi = new double[n];
		double max = sayi[0];
		double min = sayi[0];
		for(int i = 0;i < n;i++) {
			System.out.print((i+1)+".sayýyý girin: ");
			sayi[i] = g.nextDouble();
			if(i==1)
			{
				max = sayi[i];
				min = sayi[i];
			}
			if (sayi[i]>max)
				max=sayi[i];
			
			if (sayi[i]<min)
				min=sayi[i];
		}
		System.out.println("Girdiðiniz " + n + " sayý içinde en büyük olaný=" + max);
		System.out.println("Girdiðiniz " + n + " sayý içinde en küçük olaný=" + min);
	}
}
