package Principal;

import java.util.Scanner;
import FigurasPlanas.*;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		System.out.println("Vamos calcular o que você desejar!");
		System.out.println("Escolha entre: \n 1 - Figuras Planas; \n 2 - Figuras Espaciais.");
	    int escolha = sc.nextInt();
	    
	    if (escolha == 1) {
	    	System.out.println("Agora escolha qual figuras você deseja obter a área e o perimetro.");
	    	System.out.println("1 - Círculo \n 2 - Paralelogramo \n 3 - Quadrado \n 4 - Retângulo \n 5 - Trapézio \n 6 - Triângulo");
	    	
	    	int segundaEscolha = sc.nextInt();
	    	
	    	if (segundaEscolha == 1) {
	    		System.out.println("Digite o raio do seu cículo: ");
	    		double raio = sc.nextDouble();
	    		
	    		Circulo circulo = new Circulo(raio);
	    		
	    		System.out.println("Sua área é: ");
	    		circulo.calcArea();
	    		
	    		System.out.println("Seu perimetro é: ");
	    		circulo.calcPerimetro();
	    	}
	    	
	    	if (segundaEscolha == 2) {
	    		System.out.println("Digite o comprimento do seu Paralelogramo: ");
	    		double comprimento = sc.nextDouble();
	    		
	    		System.out.println("Digite a largura do seu Paralelogramo: ");
	    		double largura = sc.nextDouble();
	    		
	    		Paralelogramo paral = new Paralelogramo(comprimento, largura);
	    		
	    		System.out.println("Sua área é: ");
	    		paral.calcArea();
	    		
	    		System.out.println("Seu perimetro é: ");
	    		paral.calcPerimetro();
	    	}
	    	
	    	if (segundaEscolha == 3) {
	    		System.out.println("Digite o comprimento do seu Quadrado: ");
	    		double comprimento = sc.nextDouble();
	    		
	    		Quadrado quadrado = new Quadrado(comprimento);
	    		
	    		System.out.println("Sua área é: ");
	    		quadrado.calcArea();
	    		
	    		System.out.println("Seu perimetro é: ");
	    		quadrado.calcPerimetro();
	    	}
	    	
	    	if (segundaEscolha == 4) {
	    		System.out.println("Digite o comprimento do seu Retângulo: ");
	    		double comprimento = sc.nextDouble();
	    		
	    		System.out.println("Digite a altura do seu Retângulo: ");
	    		double altura = sc.nextDouble();
	    		
	    		Retangulo retangulo = new Retangulo(altura, comprimento);
	    		
	    		System.out.println("Sua área é: ");
	    		retangulo.calcArea();
	    		
	    		System.out.println("Seu perimetro é: ");
	    		retangulo.calcPerimetro();
	    	}
	    	
	    	if (segundaEscolha == 5) {
	    		System.out.println("Digite a base menor do seu Trapézio: ");
	    		double baseMenor = sc.nextDouble();
	    		
	    		System.out.println("Digite a base maior do seu Trapézio: ");
	    		double baseMaior = sc.nextDouble();
	    		
	    		System.out.println("Digite a altura do seu Trapézio: ");
	    		double altura = sc.nextDouble();
	    		
	    		System.out.println("Digite um dos lados restantes do seu Trapézio: ");
	    		double lado = sc.nextDouble();
	    		
	    		System.out.println("Digite o outro da restante do seu Trapézio: ");
	    		double lado1 = sc.nextDouble();
	    		
	    		Trapezio trapezio = new Trapezio(baseMenor, altura, baseMaior, lado, lado1);
	    		
	    		System.out.println("Sua área é: ");
	    		trapezio.calcArea();
	    		
	    		System.out.println("Seu perimetro é: ");
	    		trapezio.calcPerimetro();
	    	}
	    	
	    	if (segundaEscolha == 6) {
	    		System.out.println("Seu triângulo é retângulo? Responda somente com sim ou não.");
	    		String terceiraEscolha = sc.next();
	    		
	    		if (terceiraEscolha == "sim") {
	    			System.out.println("Digite sua altura: ");
	    			double altura = sc.nextDouble();
	    			
	    			System.out.println("Digite a sua base: ");
	    			double base = sc.nextDouble();
	    			
	    			System.out.println("Digite a sua hipotenusa: ");
	    			double hipotenusa = sc.nextDouble();
	    			
		    		Triangulo tri = new Triangulo(altura, base);
		    		
		    		System.out.println("Sua área é: ");
		    		tri.calcArea();
		    		
		    		System.out.println("Seu perímetro é: ");
		    		tri.calcPerimetroRetangulo(base, altura, hipotenusa);
	    		}
	    		else {
	    			System.out.println("Digite o lado 1: ");
	    			System.out.println("Digite sua altura: ");
	    			double altura = sc.nextDouble();
	    			
	    			System.out.println("Digite a sua base: ");
	    			double base = sc.nextDouble();
	    			
	    			System.out.println("Digite o lado 1: ");
	    			double lado1 = sc.nextDouble();
	    			
	    			System.out.println("Digite o lado 2: ");
	    			double lado2 = sc.nextDouble();
	    			
		    		Triangulo tri = new Triangulo(altura, base);

	    			System.out.println("Sua área é: ");
		    		tri.calcArea();
		    		
		    		System.out.println("Seu perímetro é: ");
		    		tri.calcPerimetroNormal(base, lado1, lado2);
	    		}
	    		
	    	}		
	    }
	}
}

