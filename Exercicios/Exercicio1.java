package estrutura_condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		
		a = sc.nextInt();
		
		if(a >= 0) {
			System.out.println("NÃO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
