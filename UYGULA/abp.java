package UYGULA;

public class abp {

	public static void main(String[] args) {
		int n = 10;
		int[]sayilar = new int[n];
		for(int i = 0;i < n;i++) {
			sayilar[i] = (int)(Math.random()*101);
		}
		for(int s:sayilar)
			System.out.print(s+",");
		int tmp = 0;
		for(int i = 0;i < sayilar.length;i++) {
			for(int j = i + 1;j < sayilar.length;j++) {
				if(sayilar[j] < sayilar[i]) {
					tmp = sayilar[i];
					sayilar[i] = sayilar[j];
					sayilar[j] = tmp;
				}
			}
		}
	System.out.println("_________________________");
	for(int s:sayilar)
		System.out.print(s + ",");
	}
}
