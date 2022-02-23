package estrutura_repetitiva_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double result = 0;

		for (int i = 0; i < n; i++) {

			double x1 = sc.nextInt();
			double x2 = sc.nextInt();

			if (x2 == 0) {
				System.out.println("Divisão impossivel");
			} else {
				result = x1 / x2;
				System.out.println(result);
			}

		}

		sc.close();

	}

}
