package UYGULA;

public class drcfyjh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long milliSaniye=System.currentTimeMillis();
		long toplamSaniye=milliSaniye/1000;
		long toplamDakika=toplamSaniye/60;
		long toplamSaat=toplamDakika/60;
		
		
		long artikSaniye=toplamSaniye%60;
		long artikDakika=toplamDakika%60;
	    long artikSaat=toplamSaat%24;
	    
	    
	    System.out.println(toplamSaniye);
	    System.out.println(toplamDakika);
	    System.out.println(toplamSaat);
	}

}