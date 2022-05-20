package prog_orientada_objetos;

import java.util.Locale;
import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rectangle width and heigh:");
		
		rectangle.width = sc.nextDouble();
		rectangle.heigh = sc.nextDouble();

		System.out.printf("AREA = %.2f%n",rectangle.Area(rectangle.width, rectangle.heigh));
		System.out.printf("PERIMETER = %.2f%n",rectangle.Perimeter(rectangle.width, rectangle.heigh));
		System.out.printf("DIAGONAL = %.2f%n",rectangle.Diagonal(rectangle.width, rectangle.heigh));
		
		sc.close();
	}

}
