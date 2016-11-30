package lab1;

public class Palindrom {

	public static int Inverse(int n) {
		int aux = 0;
		while (n != 0) {
			aux = aux * 10 + n % 10;
			n = n / 10;
		}
		return aux;
	}

	public static void main(String[] args) {
		int p;
		for (int i = 9999; i >= 1000; i--) {
			for (int j = 9999; j >= 1000; j--) {
				p = i * j;
				if (p == Palindrom.Inverse(p)) {
					System.out.println(p);
					return;
				}

			}
		}
	}

}
