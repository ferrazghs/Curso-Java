package estrutura_repetitiva_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}

		System.out.println(in + " In " + "\n" + out + " Out");
		sc.close();
	}

}
