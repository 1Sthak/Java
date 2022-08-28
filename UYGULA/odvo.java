package UYGULA;

import java.util.Scanner;
import java.util.Random;

public class odvo {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String soru1 = "Açlýk romanýnýn yazarý kimdir?\nA-) Franz Kafka\nB-) Knut Hamsun\nC-) Puþkin\nD-) Dostoyevski\nE-) Sait Faik",soru2 = "Hangisi periyodik cetvelde bulunan bir atom türü deðildir?\nA-) N\nB-) H\nC-) H2O\nD-) Fe\nE-) Na",soru3 = "Galatasaray hangi yýl UEFA Kupasýný kazanmýþtýr?\nA-) 2000\nB-) 1999\nC-) 2001\nD-) 2002\nE-) 2003",soru4 = "Cristiano Ronaldo hangi takýmda forma giymemiþtir?\nA-) Juventus\nB-) FC Bayern Munchen\nC-) Manchester Untied\nD-) Sporting Lisboa\nE-) Real Madrid",soru5 = "Hangi hayvan memeli deðildir?\nA-) Yarasa\nB-) Yunus\nC-) Penguen\nD-) Ornitorenk\nE-) Kanguru",casesoru1 = "B", casesoru2 = "C", casesoru3 = "A", casesoru4 = "B", casesoru5 = "C", cevap;
		int[] a = {0,1,2,3,4}; 
		Random b = new Random();
		int c = b.nextInt(a.length);
		if(c == 0) {
			System.out.println(soru1);
			cevap = giris.nextLine();
			if(cevap.equals(casesoru1)) {
				System.out.println("Doðru");
			}
			else {
				System.out.println("Yanlýþ");
			}
		}
		else if(c == 1) {
			System.out.println(soru2);
			cevap = giris.nextLine();
			if(cevap.equals(casesoru2)) {
				System.out.println("Doðru");
			}
			else {
				System.out.println("Yanlýþ");
			}
		}
		else if(c == 2) {
			System.out.println(soru3);
			cevap = giris.nextLine();
			if(cevap.equals(casesoru3)) {
				System.out.println("Doðru");
			}
			else {
				System.out.println("Yanlýþ");
			}
		}
		else if(c == 3) {
			System.out.println(soru4);
			cevap = giris.nextLine();
			if(cevap.equals(casesoru4)) {
				System.out.println("Doðru");
			}
			else {
				System.out.println("Yanlýþ");
			}
		}
		else if(c == 4) {
			System.out.println(soru5);
			cevap = giris.nextLine();
			if(cevap.equals(casesoru5)) {
				System.out.println("Doðru");
			}
			else {
				System.out.println("Yanlýþ");
			}
		}
		else {
			System.out.println("Hatalý kodlama");
		}
	}
}
