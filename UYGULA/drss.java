package UYGULA;

import java.util.ArrayList;

public class drss {

	public static void main(String[] args) {
	
		ArrayList<String> groups = new ArrayList<String>();
		
		groups.add("Duman");
		groups.add("TAHALICA");
		groups.add("Roses");
		groups.add("POSTMALONE");
		
		groups.remove(0);
		
		for (String s:groups) {
			System.out.println("Eleman: " + s);
		}
		
		System.out.println("1.indeks: " + groups.get(1));
		System.out.println("2.indeks: " + groups.get(2));
		System.out.println("Arraylist uzunluðu: " + groups.size());
		System.out.println(groups.indexOf("POSTMALONE"));
	}
}
