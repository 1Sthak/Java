import java.util.Scanner;

public class usluSayilar {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int sayi1, sayi2, sonuc = 1, i=1;
		System.out.println("�ss� Al�nacak Say�y� Giriniz: ");
		sayi1 = giris.nextInt();
		System.out.println("�s Olacak Say�y� Giriniz: ");
		sayi2 = giris.nextInt();
		
		while(i <= sayi2) {
			sonuc = sonuc * sayi1;
					i++;
		}
		System.out.print("Sonu�: " + sonuc);
	}

}
