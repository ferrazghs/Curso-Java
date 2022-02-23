package estrutura_repetitiva_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int quadrado,cubo;
		for (int i = 1; i <= n; i++) {
			quadrado = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			System.out.println(" " + i + " " + quadrado + " " + cubo);
		}
		sc.close();
	}

}
