package FigurasPlanas;

public class Retangulo {
	double altura;
	double comprimento;
	double area;
	double perimetro;
	
	public Retangulo(double altura, double comprimento) {
		this.altura = altura;
		this.comprimento = comprimento;
	}
	
	public void calcArea() {
		area = comprimento*altura;
		System.out.println(area);
	}
	
	public void calcPerimetro() {
		perimetro = (altura*2)+(perimetro*2);
		System.out.println(perimetro);
	}
}
