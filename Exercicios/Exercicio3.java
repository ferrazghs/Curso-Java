package estrutura_repetitiva_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double result = 0;

		for (int i = 0; i < n; i++) {

			double x1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double x3 = sc.nextDouble();

			result = (x1 * 2 + x2 * 3 + x3 * 5) / 10.0;

			System.out.printf("\n%.1f", result);

		}

		sc.close();

	}
}
