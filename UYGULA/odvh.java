package UYGULA;

import java.util.Scanner;

public class odvh {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("8 karakterli bir parola giriniz: " + "parolanýn ilk karakteri büyük harf" + "ikinci karakteri rakam");
		System.out.println("üçüncü karakteri semboller" + "parolanýn diðer harfleri ise küçük olmalý: ");
		
		String sifre=input.nextLine();
		
		int sifreuzunlugu=sifre.length();
		System.out.print("Þifreniz 8 karakterden daha kýsa \n tekrar girin: ");
		sifre=input.nextLine();
		sifreuzunlugu=sifre.length();
		
		char ilkkarakter=sifre.charAt(0);
		char ikincikarakter=sifre.charAt(1);
		char ucuncukarakter=sifre.charAt(2);
		char dorduncukarakter=sifre.charAt(3);
		char besincikarakter=sifre.charAt(4);
		char altincikarakter=sifre.charAt(5);
		char yedincikarakter=sifre.charAt(6);
		char sekizincikarakter=sifre.charAt(7);
		if(Character.isUpperCase(ilkkarakter)&&Character.isDigit(ikincikarakter)&&ucuncukarakter<48 && dorduncukarakter<='z' && dorduncukarakter>='a' && besincikarakter<='z' && besincikarakter>='a' && altincikarakter<='z' && altincikarakter>='a' && yedincikarakter<='z' && yedincikarakter>='a' && sekizincikarakter<='z' && sekizincikarakter>='a') {
			System.out.print("Geçerli parola...");
		}
		else {
			System.out.print("Geçersiz parola...");
		}
	}
}
