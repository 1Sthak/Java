package UYGULA;

import java.util.Scanner;

public class odve {
public static void main(String[] args) {
	Scanner giris = new Scanner(System.in);
	
	System.out.print("Silindirin yar��ap�n� girin: ");
	double r = giris.nextDouble();
	
	System.out.print("Silindirin y�ksekli�ini girin: ");
	double h = giris.nextDouble();
	
	double alan = r*r*Math.PI;
	double hacim = alan*h;
	
	System.out.println("Y�ksekli�i ve yar��ap� verilen silindirin hacmi " + hacim + "m*m*m't�r");
 }
}
