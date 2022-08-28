package UYGULA;

import java.util.Scanner;

public class odv {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Fahrenheit olan bir sayý girin: ");
	double fahrenheit = input.nextDouble();
	
	double celsius = (5.0/9)*(fahrenheit-32);
	System.out.println(fahrenheit + " Fahrenheit " + celsius + " Celsius'tur.");
	
}
}
