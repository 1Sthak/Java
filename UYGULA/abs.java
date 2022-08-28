package UYGULA;

public class abs {

	public static void main(String[] args) {
	java.util.Scanner giris = new java.util.Scanner(System.in);
	int n=10;
	int[]dizi=new int[n];
	int girilen=0;
	System.out.println("10 tane sayý girin: ");
	for(int i =0;i<n;i++) {
		girilen=giris.nextInt();
		if(ara(dizi,girilen)<0)
		dizi[i]=girilen;
		
	}
	for (int x:dizi)
		if(x>0)
		System.out.print(x+" ");
	}
	public static int ara(int[] dizi, int s) {
		for(int i=0;i<dizi.length;i++)
			if(dizi[i]==s) return 1;
		return -1;
	}
}
