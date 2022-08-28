package UYGULA;

import java.util.Scanner;

public class odvn {

	public static void main(String[] args) {

		int[][] m = getArray();
		System.out.println("\nTüm elemanlarýn toplamý: " + sum(m));
	}

	public static int[][] getArray() {
		Scanner scan = new Scanner(System.in);

		int[][] m = new int[3][4];
		System.out.println(m.length + " Satýrlar ve " + m[0].length + " Sütunlar girin: ");
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = scan.nextInt();
		return m;
	}
	public static int sum(int[][] m) {
		int toplam = 0;
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				toplam += m[row][column];
			}
		}
		return toplam;
	}
}