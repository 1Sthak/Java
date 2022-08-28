import java.util.Scanner;

public class FibonacciSayý {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int a = 0,b = 1, fibo,kacKere;
		
		System.out.println("aþama sayýsýný giriniz: ");
		kacKere = giris.nextInt();
		if(kacKere < 2) {
			System.out.println("Fibonacci Sayýsý en az iki karakterden oluþur");
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
