package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	    Double p,r,a;
		
		p = 3.14159;
		r = sc.nextDouble();
		r = Math.pow(r, 2);
		
		a = p * r;
		
		System.out.printf("AREA : %.4f", a);
		
		sc.close();
				
	}

}
