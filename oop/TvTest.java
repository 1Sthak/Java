package oop;

public class TvTest {

	public static void main(String[] args) {

		TV tv1= new TV();
		System.out.println("Kanal: " + tv1.kanal);
		System.out.println("Ses: " + tv1.sesDuzeyi);
		System.out.println("TV aç/kapat: " + tv1.acKapa);
		tv1.tvAc();
		tv1.kanalYukari();
		tv1.kanalYukari();
		tv1.kanalAyarla(50);
		tv1.sesAyarla(6);
		tv1.sesArttir();
		tv1.sesAzalt();
		System.out.println("Ses: "+tv1.sesDuzeyi);
	}

}
