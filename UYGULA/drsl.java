package UYGULA;

public class drsl {

	/*
	public static void toplama(int a,int b,int c) {
		System.out.println("Toplamlar�: " + (a+b+c));
	}
	public static void toplama(int a,int b) {
		System.out.println("Toplamlar�: " + (a+b));//Methot overloading
	}
	public static void main(String[] args) {
		toplama(3,4,5);
		toplama(10,20);
	}
	*/
	public static void skorhesapla(String name) {
		System.out.println(name + " �simli oyuncunun puan�: 0" + " Rp");
	}
	public static void skorhesapla(int score) {
		System.out.println("�simsiz oyuncunun puan�: " + score + " Rp");
	}
	public static void skorhesapla(String name,int score) {
		System.out.println(name + " �simli oyuncunun puan�: " + score + " Rp");
	}
	public static void main(String[] args) {
		skorhesapla("Taha",1000);
		skorhesapla(750);
		skorhesapla("Ahmet");
	}
}
