package estrutura_condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("S�O MULTIPLOS");
		}else {
			System.out.println("N�O S�O MULTIPLOS");
		}
		
		sc.close();
	}

}
