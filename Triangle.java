package net.ukr.andy777;

/* 
 Описать класс "Triangle". В качестве свойств - взять длинны сторон треугольника. 
 Реализовать метод возврата площади треугольника.
 */

public class Triangle {

	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle() {
		super();
	}

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double area() {
		double semiPerimeter = (sideA + sideB + sideC) / 2;
		return Math.sqrt(semiPerimeter * (semiPerimeter - sideA)
				* (semiPerimeter - sideB) * (semiPerimeter - sideC));
	}

	public String toString() {
		return "Triangle [" + "sideA=" + sideA + ", sideB=" + sideB
				+ ", sideC=" + sideC + ", Area=" +  String.format("%.4f", area()) + "]";
	}

}
