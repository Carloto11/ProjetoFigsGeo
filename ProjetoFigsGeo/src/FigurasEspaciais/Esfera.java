package FigurasEspaciais;

public class Esfera {
	private final double PI = 3.14;
	public double raio;
	public double altura;
	public double volume;
	public double areaTotal;
	
	
	public Esfera(double raio) {
		this.raio = raio;
	}
	
	public void calcAreaTotal() {
		this.areaTotal = 4 * PI * this.raio * this.raio;
	}
	
	public void calcVolume() {
		this.volume = (4/3) * this.PI * Math.pow(this.raio, 3);
	}
}
