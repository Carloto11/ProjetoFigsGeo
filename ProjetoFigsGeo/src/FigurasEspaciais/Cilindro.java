package FigurasEspaciais;

public class Cilindro {
	private final double PI = 3.14;
	public double raio;
	public double altura;
	public double volume;
	public double areaBase;
	public double areaLateral;
	public double areaTotal;
	
	
	public Cilindro(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
		this.areaBase = this.PI * this.raio * this.raio;
		this.areaLateral = this.PI * this.raio * this.altura;
	}
	public void calcAreaTotal() {
		this.areaTotal = this.areaBase*2 + this.altura;
	}
	public void calcVolume() {
		this.volume = this.areaBase*this.altura;
	}
}
