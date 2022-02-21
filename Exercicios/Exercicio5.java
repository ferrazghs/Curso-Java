package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double c,qtd,rs;
		
		c = sc.nextDouble();
		qtd = sc.nextDouble();
		
		if (c == 1) {
			rs = qtd * 5;
			System.out.printf("TOTAL: R$  %.2f", rs);
		}else if(c == 2){
			rs = qtd * 4.50;
			System.out.printf("TOTAL: R$  %.2f", rs);
		}else if(c == 3){
			rs = qtd * 5;
			System.out.printf("TOTAL: R$  %.2f", rs);
		}else if(c == 4) {
			rs = qtd * 2;
			System.out.printf("TOTAL: R$  %.2f", rs);
		}else {
			rs = qtd * 1.50;
			System.out.printf("TOTAL: R$  %.2f", rs);
		}
		
		sc.close();
	}

}
