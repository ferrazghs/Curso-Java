package prog_orientada_objetos;

import java.util.Locale;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);

		emp.name = sc.nextLine();
		emp.grossSalary = sc.nextDouble();
		emp.tax = sc.nextDouble();

		System.out.print(emp);
		System.out.println();

		System.out.print("\nWhich percentage to increase salary?");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);

		System.out.print(emp);
		System.out.println();

		sc.close();
	}

}
