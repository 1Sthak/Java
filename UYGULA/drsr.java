package UYGULA;

public class drsr {

	public static void main(String[] args) {
		
	int[][] arr = {{10,20,30},{40,50,60}}; 
	
	int[][] arr1 = new int[2][3];
	arr1[0][0] = 10;
	arr1[0][1] = 20;
    arr1[0][2] = 30;
    arr1[1][0] = 40;
    arr1[1][1] = 50;
    arr1[1][2] = 60;
    
    for (int i = 0;i < 2;i++) {
    	for (int j = 0;j < 3;j++) {
    		System.out.println("Eleman: " + arr1[i][j]);
    	}
    }
	/*System.out.println("0'a 0: " + arr[0][0]);
	System.out.println("1'e 2: " + arr[1][2]);
	System.out.println(arr[0][2]);*/
	}
}
