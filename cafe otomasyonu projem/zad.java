
public class zad {

	public static void main(String[] args) {

		int[][] values = {{3, 4,5,1},{33, 6, 1,2}};
		
		int v = values[0][0];
		for (int a = 0;a < values.length; a++) 
			for(int b = 0;b < values[a].length; b++) 
				if (v < values[a][b])
					v = values[a][b];
		System.out.println(v);
	}

}
