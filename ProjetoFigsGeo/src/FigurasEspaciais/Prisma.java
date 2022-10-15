package FigurasEspaciais;

public class Prisma {
	public double largura;
	public double faceLateral;
	public double altura;
	public double areaTotal;
	public double volume;
	
	
	public Prisma(double altura, double largura, double faceLateral) {
		this.altura = altura;
		this.largura = largura;
		this.faceLateral = faceLateral;
	
	}
	
	public void calcAreaTotal() {
		this.areaTotal = (2*this.largura*this.faceLateral) + (4*this.largura*this.altura);
		
	}
	public void calcVolume() {
		this.volume = (this.largura * this.faceLateral)* this.altura; 
	}
}
