import java.util.Scanner;

public class FibonacciSay� {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int a = 0,b = 1, fibo,kacKere;
		
		System.out.println("a�ama say�s�n� giriniz: ");
		kacKere = giris.nextInt();
		if(kacKere < 2) {
			System.out.println("Fibonacci Say�s� en az iki karakterden olu�ur");
		}
		for(int i = 1; i < kacKere; i++) {
			if(i == 1) {
				System.out.println(a);
				System.out.println(b);
			}
			else {
			fibo = a + b;
			a = b;
			b = fibo;
			
			System.out.println(fibo);
			}
		}
	}
}
