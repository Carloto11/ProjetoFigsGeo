package FigurasPlanas;

public class Circulo {
	private double PI = 3.14;
	double raio;
	double area;
	double perimetro;
	
	//construtor 
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public void calcArea() {
		area = PI*(raio*raio);
		System.out.println(area);
	}
	
	public void calcPerimetro() {
		perimetro = 2*PI*raio;
		System.out.println(perimetro);
	}
}
