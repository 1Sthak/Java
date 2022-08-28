import java.util.Scanner;

public class WhileComplex {

	public static void main(String[] args) {

		int giris, toplam = 0;
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("Bir Sayý Giriniz: ");
		giris = scan.nextInt();
			if(giris < 0) {
				System.out.println("Program Bitti...");
				System.out.println("Girilen Tek Sayýlar Toplamý: " + toplam);
				break;
			}
			else if(giris % 2 == 1) {
				toplam = toplam + giris;
			}
		}
	}
}
