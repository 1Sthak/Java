
public class Foreach {

	public static void main(String[] args) {

		int[] liste = new int[4];
		
		liste[0] = 1;
		liste[1] = 2;
		liste[2] = 3;
		liste[3] = 4;
		
		for (int i = 0;i < liste.length;i++) {
			System.out.println(liste[i] + " ");
		}
		System.out.println("______________________________");
		for(int value : liste) {
			System.out.println(value);
		}
	}
}
