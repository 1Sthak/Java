package UYGULA;

import java.util.Scanner;

public class odvb {
public static void main(String[] args) {
	Scanner giris=new Scanner(System.in);
	
	System.out.println("Ax^2+B+C iki bilinmeyenli bir denklemdir. Denklemi ��zmek i�in;");
	System.out.print("L�tfen A katsy�s�n� girin: ");
	
	float A = giris.nextFloat();
	if(A==0) {
	System.out.println("A katsay�s� 0 olmaz.");
	System.exit(0);
	}
	System.out.print("L�tfen B katsay�s�n� girin: ");
double B = giris.nextDouble();
System.out.println("L�tfen (varsa) C sabit sya�s�n� girin (e�er C sabit sy�s� yoksa 0 olarak girin): ");
double C = giris.nextDouble();

double delta = (B*B)-(4*A*C);
System.out.println("delta= " + delta);
if (delta>0) {
	double kok1 = ((-1*B)+Math.sqrt(delta))/(2*A);
	double kok2 = ((-1*B)-Math.sqrt(delta))/(2*A);
	System.out.println("Denklemin 1.K�k�= " + kok1 + "2.K�k�= " + kok2);
}
else if (delta==0) {
	double x = (-1*B)/(2*A);
	System.out.println("Denklemin �ak���k iki k�k� vard�r. 1.k�k = 2.k�k = " + x );
}
else if (delta<0) {
	System.out.println("Sistemin ger�el k�k� yoktur...");
}
}

}
