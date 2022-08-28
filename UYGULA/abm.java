package UYGULA;

public class abm {

	public static void main(String[] args) {
		
		int[] sayilar = new int[100];
		double ortalama = 0;
		double toplam = 0;
		
		for(int i = 0;i < sayilar.length;i++) {
			sayilar[i] = (int)(Math.random()*100);
			toplam += sayilar[i];
			System.out.println(sayilar[i]);
		}
		ortalama = toplam / sayilar.length;
		System.out.println("ortalama: " + ortalama);
	}
}
