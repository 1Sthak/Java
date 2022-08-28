package UYGULA;

public class abz {

	public static void main(String[] args) {
		int [][][] notlar=new int [41][2][1];
		
		for (int i=0;i<notlar.length;i++)
			for(int j=0;j<notlar[i].length;j++)
				for(int k=0;k<notlar[i][j].length;k++)
					notlar[i][j][k]=(int)(Math.random()*100);
				
		for (int i=0;i<notlar.length;i++) {
			System.out.print((i+1)+".not:");
			for(int j=0;j<notlar[i].length;j++) {
				for(int k=0;k<notlar[i][j].length;k++) {
					System.out.print(notlar[i][j][k] + " ");
		}
				}
			}
				
				System.out.println();
	}
}
