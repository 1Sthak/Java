import java.util.Scanner;

public class BuyuktenKucugeSiralama {

	public static void main(String[] args) {

		int a,b,c;
		Scanner giris = new Scanner(System.in);
		System.out.println("Sýralanmasý Gereken Üç Sayýyý Giriniz: ");
		a = giris.nextInt();
		b = giris.nextInt();
		c = giris.nextInt();
		
		if(a > b && a > c) {
			if(b > c) {
				System.out.println(a + " > " + b + " > " + c);
			}
			else if(c > b) {
				System.out.println(a + " > " + c + " > " + b);
			}
			else {
				System.out.println(a + " > " + b + " = " + c);
			}
		}
		else if(b > a && b > c) {
			if(a > c) {
				System.out.println(b + " > " + a + " > " + c);
			}
			else if(c > a) {
				System.out.println(b + " > " + c + " > " + a);
			}
			else {
				System.out.println(b + " > " + c + " = " + a);
			}
		}
		else if(c > a && c > b) {
			if(a > b) {
				System.out.println(c + " > " + a + " > " + b);
			}
			else if(b > a) {
				System.out.println(c + " > " + b + " > " + a);
			}
			else {
				System.out.println(c + " > " + a + " = " + b);
			}
		}
		else if(a == b && a > c) {
			System.out.println(a + " = " + b + " > " + c);
		}
		else if(a == c && a > b) {
			System.out.println(a + " = " + c + " > " + b);
		}
		else if(b == c && b > a) {
			System.out.println(b + " = " + c + " > " + a);
		}
		else {
			System.out.println(a + " = " + b + " = " + c);
		}
	}
}