package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int c1,c2,np1,np2;
	    Double v1,v2,rs;
	    
		c1 = sc.nextInt();
		np1 = sc.nextInt();
		v1 = sc.nextDouble();

		c2 = sc.nextInt();
		np2 = sc.nextInt();
		v2 = sc.nextDouble();

		rs = (np1 * v1) + (np2 * v2);
		
		System.out.printf("VALOR A PAGAR: %.2f ",rs);
		
		sc.close();
	}

}
