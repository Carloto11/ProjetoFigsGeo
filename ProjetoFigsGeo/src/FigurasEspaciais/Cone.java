package FigurasEspaciais;

public class Cone {
	private final double PI = 3.14;
	public double volume;
	public double areaTotal;
	public double raio;
	public double altura;
	
	
	//Construtor
	public Cone(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
	}
	
	
	public void calcVolume() {
		double PI = 3.14;
		this.volume = (PI * (this.raio) * this.altura) / 3;
	}
	
	public void calcAreaTotal() {
		double geratriz = Math.hypot(this.raio, this.altura);
		this.areaTotal = this.PI * this.raio*(this.raio + geratriz);
	}

}
