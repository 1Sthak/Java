package UYGULA;

public class drst {

	public static void main(String[] args) {
		
		String s1 = "Taha";
		String s3 = "Taha";//Stringlerde içindeki deðerler ayn olunca s1 ve s3 ayný stringe eþit olur.
		String s2 = new String("Taha");//Fakat new String açarsanýz eþitlik durumu olmaz.
		
		System.out.println(s2.length());
		System.out.println("0.indeks " + s2.charAt(0));
		System.out.println("Son indeks " + s2.charAt(s2.length()-1));
		System.out.println(s2.startsWith("T"));
		System.out.println(s2.endsWith("ha"));
		
	}
}
