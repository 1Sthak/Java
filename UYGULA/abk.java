package UYGULA;

import java.util.Scanner;

public class abk {
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Bir mesaj giriniz: ");
		String ad=s.nextLine();
	System.out.print(cevir(ad));
		
	}
	public static String cevir(String msg) {
		String yeniMsg="";
		for (int i=msg.length()-1;i>=0;i--) {
			yeniMsg=yeniMsg+msg.charAt(i);
			
		}
		return yeniMsg;
		
	}
}
