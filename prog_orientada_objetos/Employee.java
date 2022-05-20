package prog_orientada_objetos;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double result;

	public double NetSalary() {
		return grossSalary - tax;

	}

	public void IncreaseSalary(double percentage) {
		this.grossSalary += grossSalary * percentage / 100.00;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", NetSalary());
	}
}
