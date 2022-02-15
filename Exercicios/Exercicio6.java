package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	    Double v1,v2,v3,t,c,tr,qd,rt;
	    Double pi = 3.14159;
	    
		v1 = sc.nextDouble();
		v2 = sc.nextDouble();
		v3 = sc.nextDouble();

		t = v1 * v3 / 2;
		c = pi * v3 * v3;
		tr = ((v1 + v2) * v3) / 2;
		qd = v2 * v2;
		rt = v1 * v2;
		
		System.out.printf("TRIANGULO: %.3f%n",t);
		System.out.printf("CIRCULO: %.3f%n", c);
		System.out.printf("TRAPÉZIO: %.3f%n" , tr);
		System.out.printf("QUADRADO: %.3f%n", qd );
		System.out.printf("RETÂNGULO: %.3f%n", rt);

		sc.close();
	}

}
