package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
	    Double h,s,rs;
	    
		n = sc.nextInt();
		h = sc.nextDouble();
		s = sc.nextDouble();
		
		rs = h * s; 
		
		System.out.printf("NUMBER : " + n + "\n" + "SALARY :  " +  "U$ %.2f",rs);
		
		sc.close();
	}

}
