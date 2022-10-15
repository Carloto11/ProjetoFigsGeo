package FigurasPlanas;

public class Quadrado {
	double comprimento;
	double altura;
	double area;
	double perimetro;
	
	//construtor 
	public Quadrado(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public void calcArea() {
		area = comprimento*comprimento; 
		System.out.println(area);
	}
	
	public void calcPerimetro() {
		perimetro = comprimento*4;
		System.out.println(perimetro);
	}
}
