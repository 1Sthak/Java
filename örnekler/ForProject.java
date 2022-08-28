import java.util.Scanner;

public class ForProject {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int girdi;
		boolean asal = true;
		do {
			System.out.print("Lütfen Pozitif Bir Sayý Giriniz: ");
			girdi = giris.nextInt();
		} 
		while(girdi < 2);
		for(int i = 2; i < girdi;i++) {
			if(girdi % i == 0) {
				asal = false;
				break;
			}
		}
		if(asal) {
			System.out.println("Girilen Sayý: " + girdi + " asaldýr.");
		}
		else {
			System.out.println("Girilen Sayý: " + girdi + " asal deðildir.");
		}
	}
}
