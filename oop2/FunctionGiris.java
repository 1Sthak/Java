import java.util.Scanner;

public class FunctionGiris {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int giris, sec, say1, say2;
		
		while(true) {
			System.out.println("fonksiyon çaðrýsý için 1 girin");
			System.out.println("sonlandýrmak için 0 girin");
			sec = scan.nextInt();
			if(sec == 1) {
				System.out.println("fonksiyonda x Deðerini giriniz: ");
			f(giris = scan.nextInt());
			}
			else if(sec == 0) {
				System.out.println("Döngü bitti");
				System.out.println("______________");
				break;
			}
			else {
				System.out.println("geçersiz giriþ");
			}
		}
		System.out.println("Üslü ifadenin deðerlerini girin: ");
		power(say1 = scan.nextInt(),say2 = scan.nextInt());
	}
	static void f(int x) {
		int result = (x + 2) * 6;
		System.out.println(result);
	}
	static void power(int number1,int number2) {
		int result = 1;
		for(int i = 1;i <= number2; i++) {
			result *= number1;
		}
		System.out.println("Cevap: " + result);
	}
}
