package prog_orientada_objetos;

public class Student {

	public String name;
	
	public double n1,n2,n3;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}
	
	public double AVG() {
		return n1 + n2 + n3;
	}
	public double Points() {
		if(AVG() < 60.0) {
			return 60.0 - AVG();
		}else {
			return 0.0;
		}
	}
	
}
