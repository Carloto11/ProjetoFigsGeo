package FigurasPlanas;

public class Triangulo {
	double altura;
	double base;
	double hipotenusa;
	double lado1;
	double lado;
	double area;
	double perimetro;
	
	//construtor
	public Triangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;	
	}
	
	public void calcArea() {
		area = (altura*base)/2;
		System.out.println(area);
	}
	
	public double calcPerimetroNormal(double base, double lado, double lado1) {
		this.base = base;
		this.lado = lado;
		this.lado1 = lado1;
		perimetro = this.base+this.lado+this.lado1;
		System.out.println(perimetro);
		return perimetro;
	}
	
	public double calcPerimetroRetangulo(double base, double altura, double hipotenusa) {
		this.base = base;
		this.altura = altura;
		this.hipotenusa = hipotenusa;
		perimetro = this.base+this.altura+this.hipotenusa; 
		System.out.println(perimetro);
		return perimetro;
	}
}
