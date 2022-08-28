package UYGULA;

import java.util.Scanner;

public class odve {
public static void main(String[] args) {
	Scanner giris = new Scanner(System.in);
	
	System.out.print("Silindirin yarýçapýný girin: ");
	double r = giris.nextDouble();
	
	System.out.print("Silindirin yüksekliðini girin: ");
	double h = giris.nextDouble();
	
	double alan = r*r*Math.PI;
	double hacim = alan*h;
	
	System.out.println("Yüksekliði ve yarýçapý verilen silindirin hacmi " + hacim + "m*m*m'tür");
 }
}
