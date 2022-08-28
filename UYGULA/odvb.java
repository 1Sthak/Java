package UYGULA;

import java.util.Scanner;

public class odvb {
public static void main(String[] args) {
	Scanner giris=new Scanner(System.in);
	
	System.out.println("Ax^2+B+C iki bilinmeyenli bir denklemdir. Denklemi çözmek için;");
	System.out.print("Lütfen A katsyýsýný girin: ");
	
	float A = giris.nextFloat();
	if(A==0) {
	System.out.println("A katsayýsý 0 olmaz.");
	System.exit(0);
	}
	System.out.print("Lütfen B katsayýsýný girin: ");
double B = giris.nextDouble();
System.out.println("Lütfen (varsa) C sabit syaýsýný girin (eðer C sabit syýsý yoksa 0 olarak girin): ");
double C = giris.nextDouble();

double delta = (B*B)-(4*A*C);
System.out.println("delta= " + delta);
if (delta>0) {
	double kok1 = ((-1*B)+Math.sqrt(delta))/(2*A);
	double kok2 = ((-1*B)-Math.sqrt(delta))/(2*A);
	System.out.println("Denklemin 1.Kökü= " + kok1 + "2.Kökü= " + kok2);
}
else if (delta==0) {
	double x = (-1*B)/(2*A);
	System.out.println("Denklemin çakýþýk iki kökü vardýr. 1.kök = 2.kök = " + x );
}
else if (delta<0) {
	System.out.println("Sistemin gerçel kökü yoktur...");
}
}

}
