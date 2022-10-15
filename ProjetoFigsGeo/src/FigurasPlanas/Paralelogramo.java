package FigurasPlanas;

public class Paralelogramo {
	double area;
	double perimetro;
	double comprimentro;
	double largura;
	double altura;
	
	//construtor
	public Paralelogramo(double comprimento, double largura) {
		this.comprimentro = comprimento;
		this.largura = largura;
	}
	
	public void calcArea() {
		area = comprimentro*altura;
		System.out.println(area);
	}
	
	public void calcPerimetro() {
		perimetro = 2*(this.comprimentro + largura);
		System.out.println(perimetro);
	}
}
