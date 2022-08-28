package UYGULA;

public class drsl {

	/*
	public static void toplama(int a,int b,int c) {
		System.out.println("Toplamlarý: " + (a+b+c));
	}
	public static void toplama(int a,int b) {
		System.out.println("Toplamlarý: " + (a+b));//Methot overloading
	}
	public static void main(String[] args) {
		toplama(3,4,5);
		toplama(10,20);
	}
	*/
	public static void skorhesapla(String name) {
		System.out.println(name + " Ýsimli oyuncunun puaný: 0" + " Rp");
	}
	public static void skorhesapla(int score) {
		System.out.println("Ýsimsiz oyuncunun puaný: " + score + " Rp");
	}
	public static void skorhesapla(String name,int score) {
		System.out.println(name + " Ýsimli oyuncunun puaný: " + score + " Rp");
	}
	public static void main(String[] args) {
		skorhesapla("Taha",1000);
		skorhesapla(750);
		skorhesapla("Ahmet");
	}
}
