package lab1;

public class Multi3and5 {

	public static void main(String[] args) {
		int sum = 0;
		int aux = 0;
		while (aux < 1000) {
			if (aux % 3 == 0 || aux % 5 == 0) {

				sum = sum + aux;
			}

			aux++;
		}
		System.out.println(sum);
	}

}
