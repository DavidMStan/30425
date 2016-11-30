package lab1;

public class FibonacciEven {

	public static void main(String[] args) {
		int term0 = 1;
		int term1 = 2;
		int term2 = 0;
		int sum = 0;

		while (term2 < 4000000) {
			if (term2 % 2 == 0) {
				sum = sum + term2;

			}
			term2 = term1 + term0;
			term0 = term1;
			term1 = term2;

		}
		System.out.println(sum);
	}

}
