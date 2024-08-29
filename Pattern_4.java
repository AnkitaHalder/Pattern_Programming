package Pattern_Programming;

public class Pattern_4 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print((n - i) + " ");
			}
			System.out.println();
		}
	}
}
