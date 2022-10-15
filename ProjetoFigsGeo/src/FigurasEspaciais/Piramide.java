package FigurasEspaciais;

public class Piramide {
	public double areaTotal;
	public double areaLateral;
	public double areaBase;
	public double volume;
	public double base;
	public double altura;
	
	public Piramide(double base, double altura){
		this.base = base;
		this.altura = altura;
		
		this.areaLateral = (this.base * this.altura) / 2;
		this.areaBase = base * base;
	}
	
	public void calcAreaTotal() {
		this.areaTotal = areaLateral + areaBase;
	}
	public void calcVolume(){
		this.volume = this.areaBase * this.altura;
	}
}
