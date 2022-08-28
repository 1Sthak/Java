
public class Siniflar {

	public static void main(String[] args) {
		//SýnýfAdý objeAdý = new sýnýfAdý();
		HesapMakinesiButPublic makine1 = new HesapMakinesiButPublic();
		makine1.sayi1 = 10;
		makine1.sayi2 = 20;
		
		System.out.println(makine1.sayi1);
		
		HesapMakinesiButPublic makine2 = new HesapMakinesiButPublic();
		makine2.sayi1 = 20;
		System.out.println(makine2.sayi1);
	}
}