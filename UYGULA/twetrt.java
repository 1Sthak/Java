package UYGULA;

import java.util.Random;

public class twetrt {
	public static void main(String[] args) {
		Random randomNum = new Random();
		
		int zar, zar_dizi[] = {0,0,0,0,0,0};
		
		for(int i = 0; i < 600; i++) {
			zar = randomNum.nextInt(6)+1;
			
			if(zar == 1)
				zar_dizi[0]++;
			else if(zar == 2)
				zar_dizi[1]++;
			else if(zar == 3)
				zar_dizi[2]++;
			else if(zar == 4)
				zar_dizi[3]++;
			else if(zar == 5)
				zar_dizi[4]++;
			else
				zar_dizi[5]++;
		}
		System.out.println("1 :" + zar_dizi[0]);
		System.out.println("2 :" + zar_dizi[1]);
		System.out.println("3 :" + zar_dizi[2]);
		System.out.println("4 :" + zar_dizi[3]);
		System.out.println("5 :" + zar_dizi[4]);
		System.out.println("6 :" + zar_dizi[5]);
	}
}
