package UYGULA;

public class abn {

	public static void main(String[] args) {
	
		int[] sayi = {10,30,20,100,-50,0};
		
		int max = sayi[0];
		int min = sayi[0];
		
		for(int i = 1;i < sayi.length;i++) {
			
			if(sayi[i] > max)
				max = sayi[i];
			
			if(sayi[i] <min)
				min = sayi[i];
		}
	System.out.println("Büyük = " + max);
	System.out.println("Küçük = " + min);
   }
}
