package estrutura_condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,f,rs;
		
		i = sc.nextInt();
		f = sc.nextInt();
		
		if (i > f) {
			rs = (f + 24) - i;
			System.out.println("O JOGO DUROU " + rs + " HORAS");
		}else if(f > i){
			rs = f - i;
			System.out.println("O JOGO DUROU " + rs + " HORAS");
		}else {
			System.out.println("O JOGO DUROU 24 HORAS");
		}
		
		sc.close();
	}

}
