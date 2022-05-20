package membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Double dolar,reais;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("What is the dollar price ? ");
		dolar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought ? ");
		reais = sc.nextDouble();	
	
		System.out.printf("Amount to be paid in reais? " + "%.2f",CurrencyConverter.CalculatorReais(dolar,reais));
	}
}
