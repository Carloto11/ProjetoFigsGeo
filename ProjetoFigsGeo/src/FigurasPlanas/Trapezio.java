package FigurasPlanas;

public class Trapezio {
	double baseMenor;
	double baseMaior;
	double lado1;
	double lado2;
	double area;
	double altura;
	double perimetro;
	
	//construtor
	public Trapezio(double baseMenor, double altura, double baseMaior, double lado1, double lado2) {
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
	}
	
	public void calcArea () {
		area = ((baseMenor + baseMaior)*altura)/2;
		System.out.println(area);
	}
	
	public void calcPerimetro () {
		perimetro = baseMenor + baseMaior + lado1 + lado2;
		System.out.println(perimetro);
	}
}
