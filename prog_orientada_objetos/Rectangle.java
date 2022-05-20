package prog_orientada_objetos;

public class Rectangle {

	public double width;
	public double heigh;

	public double Area(double width, double heigh) {
		return width * heigh;

	}

	public double Perimeter(double width, double heigh) {
		return 2 * (width + heigh);
	}

	public double Diagonal(double width, double heigh) {
		return Math.sqrt((Math.pow(width, 2) + Math.pow(heigh, 2)));
	}

}
