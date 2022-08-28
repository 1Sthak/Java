package UYGULA;

import java.util.Scanner;

public class drsp {
	public static void mean(int[] arr) {
		int total = 0;
		
		for (int i = 0;i < arr.length;i++) {
		total += arr[i];
		}
	System.out.println("Ortalama: " +(double) total / arr.length);	
		
		}
	
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int[] arr1 = {10,20,30,40,50};
	int[] arr2 = new int[5];
	System.out.println("Array 2'nin Deðerlerini Girin: ");
	for (int i = 0;i < arr2.length;i++) {
		arr2[i] = s.nextInt();
	}
	System.out.println("Array 2'nin Deðerleri Yazýlýyor...");
	
	for (int i = 0;i < arr2.length;i++) {
		System.out.println("Eleman Array 1: " + arr2[i]);
	}
	mean(arr2);
	/*int[] arr2 = new int[5];
	
	arr2[0] = 1;
	arr2[1] = 2;
	arr2[2] = 3;
	arr2[3] = 4;
	arr2[4] = 5;
	System.out.println("Array 2'nin ikinci indeksi = " + arr2[1]);
	System.out.println("Array 1'in üçüncü indeksi = " + arr1[2]);*/
	
}
}
