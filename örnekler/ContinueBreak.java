import java.util.Scanner;

public class ContinueBreak {

	public static void main(String[] args) {
		int sayi, sayac = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Bir Say� Giriniz: ");
			sayi = scan.nextInt();
			if (sayi == 0) {
				sayac++;
				System.out.println("Giri� Denemesi: " + sayac);
				System.out.println("Sistemden ��k�l�yor...");
				break;
			}
			else {
				sayac++;
				System.out.print("Yanl�� Giri�...	");
			}
		}
	}
}
