package UYGULA;

public class abt {

	public static void main(String[] args) {
		int satir = (int)(Math.random()*99+10);
		int sutun = (int)(Math.random()*99+10);
		int[][] sayilar=new int[satir][sutun];
		
		System.out.println("satır : " + satir);
		System.out.println("sutun : " + sutun);
		
		for(int i=0; i<sayilar.length;i++) {
			for(int j=0; j<sayilar[i].length;j++) {
				sayilar[i][j]=(int)(Math.random()*100);
				System.out.print(sayilar[i][j]+" , ");
			}
		System.out.println();
		}
	}
}
