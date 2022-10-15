package FigurasEspaciais;

public class Paralelepipedo {
	
	public double volume;
	public double areaTotal;
	public double comprimento;
	public double largura;
	public double altura;
	
	
	public Paralelepipedo(double comprimento, double altura, double largura) {
		this.comprimento = comprimento;
		this.altura = altura;
		this.largura = largura;
	}
	public void calcVolume() {
		this.volume = this.altura * this.largura * this.comprimento;
	}
	public void calcAreaTotal() {
		this.areaTotal = 2*((this.comprimento*this.largura) + (this.largura*this.altura) + (this.comprimento * this.altura));
	}
}
