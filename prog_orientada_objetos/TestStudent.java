package prog_orientada_objetos;

import java.util.Locale;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Student st = new Student();
		Scanner sc = new Scanner(System.in);

		st.name = sc.next();
		st.n1 = sc.nextDouble();
		st.n2 = sc.nextDouble();
		st.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = " + "%.2f", st.AVG());
		
		if(st.AVG() >= 60.0) {
			System.out.println("\nPASS");
		}else
			System.out.println("\nFAILED" + " MISSING " + st.Points() + " POINTS" );
	}

}
