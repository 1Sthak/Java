import java.util.Scanner;

public class DoWhiless {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int girdi, ciftSayac = 0;
		
		do {
		System.out.println("Say� Gir: ");
		girdi = giris.nextInt();
		if(girdi % 2 == 0) {
			ciftSayac += girdi;
		}
		}
		while(girdi > 0);
		System.out.println("Girilen �ift Say�lar Toplam�: " + ciftSayac);
	}
}