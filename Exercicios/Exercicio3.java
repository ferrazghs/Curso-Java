package estrutura_repetitiva_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alc = 0;
		int gsl = 0;
		int die = 0;

		int cod = sc.nextInt();

		while (cod != 4) {

			if (cod == 1) {
				alc += 1;
			} else if (cod == 2) {
				gsl += 1;
			} else if (cod == 3) {
				die += 1;
			}
			cod = sc.nextInt();
		}

		System.out.printf("MUITO OBRIGADO" + "\nAlcool: " + alc + "\nGasolina: " + gsl + "\nDiesel: " + die);
		sc.close();
	}
}
