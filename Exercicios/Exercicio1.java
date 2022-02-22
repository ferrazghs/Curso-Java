package estrutura_repetitiva_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int sn = sc.nextInt();
		
		while(sn != 2002) {
			System.out.println("Senha Invalida");
			sn = sc.nextInt();
		}
			System.out.println("Acesso permitido");
			sc.close();
	}

}
