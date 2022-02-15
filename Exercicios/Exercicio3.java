package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,c,d,rs;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		rs = ((a*b) - (c*d));
		
		System.out.println("DIFERENÇA : " + rs);

		sc.close();
	}

}
