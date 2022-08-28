
public class ReturnFunction {
	static int power(int a, int b) {
		int result = 1;
		for(int i = 1;i <= b;i++) {
			result *= a;
		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		int r2 = power(10,2);
		System.out.println(r2);
		power2(10,3);
	}
	static void power2(int a, int b) {
		int result = 1;
		for(int i = 1;i <= b;i++) {
			result *= a;
		}
		System.out.println(result);
	}
}
