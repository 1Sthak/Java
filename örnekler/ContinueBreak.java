import java.util.Scanner;

public class ContinueBreak {

	public static void main(String[] args) {
		int sayi, sayac = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Bir Sayý Giriniz: ");
			sayi = scan.nextInt();
			if (sayi == 0) {
				sayac++;
				System.out.println("Giriþ Denemesi: " + sayac);
				System.out.println("Sistemden Çýkýlýyor...");
				break;
			}
			else {
				sayac++;
				System.out.print("Yanlýþ Giriþ...	");
			}
		}
	}
}
