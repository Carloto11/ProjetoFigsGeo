package FigurasEspaciais;

public class Cubo {
	private final double PI = 3.14;
	
	public double lado;
	public double volume;
	public double areaTotal;
	
	
	public Cubo(double lado) {
		this.lado = lado;
	}
	
	public void calcVolume() {
		this.volume = Math.pow(this.lado, 3);
	}
	
	public void calcAreaTotal() {
		double areaBase = this.lado * this.lado;
		this.areaTotal = areaBase * 6;
	}
	
}
