package UYGULA;

import java.util.Scanner;

public class odvc {
public static void main(String[] args) {
	Scanner giris=new Scanner(System.in);
	
	System.out.print("�lk h�z� girin: ");
	double v0 = giris.nextDouble();
	
	System.out.print("Son h�z� girin: ");
	double v1 = giris.nextDouble();
	
	System.out.print("Ge�en s�reyi giri: ");
	double t = giris.nextDouble();
	
	double a = (v1-v0)/ t;
	System.out.println("Ortalama ivme: " + a +"m/s*s");
}
}
