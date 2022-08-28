import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		
		double sayi1;
		double sayi2;
		int secim;
		String a ="Geçersiz Ýþlem";
		
		System.out.println("Ýlk Sayýyý Giriniz : ");
		sayi1 = giris.nextDouble();
		
		System.out.println("Ýkinci Sayýyý Giriniz : ");
		sayi2 = giris.nextDouble();
		
		System.out.println("\nLütfen Yapmak Ýstediðiniz Ýþlemi Seçiniz : ");
		System.out.println("1-) Toplama\n2-) Çýkarma\n3-) Çarpma\n4-) Bölme");
		secim = giris.nextInt();
		
		if(secim==1) {
			System.out.println("Toplama : " + (sayi1 + sayi2));		
		}
		else if(secim==2) {
			System.out.println("Çýkarma : " + (sayi1 - sayi2));		
		}
		else if(secim==3) {
			System.out.println("Çarpma : " + (sayi1 * sayi2));
		}
		else if(secim==4){
			System.out.println("Bölme : " + (sayi1 / sayi2));
		}
		else {
			System.out.println("Geçersiz Ýþlem\nGeçerli Bir Ýþlem Giriniz : ");
		}
	}
}
