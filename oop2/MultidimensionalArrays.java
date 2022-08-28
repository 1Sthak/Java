
public class MultidimensionalArrays {

	public static void main(String[] args) {

	int[][] tablo = new int[][] {
		{1,75,10},
		{2,87,13},
		{3,95,15},
		{4,103,18},
		{5,110,19}
	};
	int[][] tablo2 = new int[5][3];//ikici kullaným
	tablo2[0][0] = 1;
	tablo2[0][1] = 75;
	tablo2[0][2] = 10;
	tablo2[1][0] = 2;
	tablo2[1][1] = 87;
	tablo2[1][2] = 13;
	tablo2[2][0] = 3;
	tablo2[2][1] = 95;
	tablo2[2][2] = 15;
	tablo2[3][0] = 4;
	tablo2[3][1] = 103;
	tablo2[3][2] = 18;
	tablo2[4][0] = 5;
	tablo2[4][1] = 110;
	tablo2[4][2] = 19;
	
	for (int i = 0;i < tablo.length;i++) {
		for (int j = 0;j < tablo[0].length; j++) {
			System.out.print(tablo[i][j] + " ");
		}
		System.out.println();
	}
	for (int i = 0;i < tablo2.length;i++) {
		for (int j = 0;j < tablo2[0].length; j++) {
			System.out.print(tablo2[i][j] + " ");
		}
		System.out.println();
	}
	System.out.println("_______________________________");
	for(int[] sutun : tablo) {
		for(int value : sutun) {
			System.out.println(value + " ");
		}
		System.out.println();
	}
	}

}
