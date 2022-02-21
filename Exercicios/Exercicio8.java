package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double sl,rs;
		
		sl = sc.nextDouble();
		
		if (sl <= 2000 ) {
			rs = 0.0;
		}else if(sl <= 3000){
			rs = ((sl - 2000) * 0.08);
		}else if(sl <= 4500 ){
			rs = (1000 * 0.08) + ((sl - 3000) * 0.18);
		}else {
			rs = (1000 * 0.08) + (1500 * 0.18) + ((sl - 4500) * 0.28);
		}if(rs == 0.0) {
			System.out.printf("Isento");
		}else {
			System.out.printf("R$ %.2f", rs);
		}
		
		sc.close();
	}

}
