package UYGULA;

public class abj {

	public static void main(String[] args) {
		System.out.println(toplama(12,13));
		System.out.println(toplama(1,2,3));
	}
	
	public static int toplama(int s1,int s2) {
		if (s1>s2)
		return s1;
		else
		return s2;
	}

	public static int toplama(int s1,int s2,int s3) {
		return toplama(toplama(s1,s2),s3);
	}
	
	
	
}


