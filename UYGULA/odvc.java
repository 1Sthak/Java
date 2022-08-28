package UYGULA;

import java.util.Scanner;

public class odvc {
public static void main(String[] args) {
	Scanner giris=new Scanner(System.in);
	
	System.out.print("Ýlk hýzý girin: ");
	double v0 = giris.nextDouble();
	
	System.out.print("Son hýzý girin: ");
	double v1 = giris.nextDouble();
	
	System.out.print("Geçen süreyi giri: ");
	double t = giris.nextDouble();
	
	double a = (v1-v0)/ t;
	System.out.println("Ortalama ivme: " + a +"m/s*s");
}
}
