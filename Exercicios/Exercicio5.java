package estrutura_repetitiva_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int ftr = 1;

		for (int i = 1; i <= n; i++) {
			ftr *= i;
		}
		System.out.println(ftr);

		sc.close();
	}

}
