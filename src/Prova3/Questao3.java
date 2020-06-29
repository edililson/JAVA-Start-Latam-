package Prova3;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcao;
		
		System.out.println("---------------Bem Vindo---------------");
		System.out.println("Vamos realizar calculos geométricos!!!");
		System.out.println("1 - Para calcular a área de um Retângulo.");
		System.out.println("2 - Para calcular a área de um Trapézio.");
		System.out.println("3 - Para calcular a área de um Triangulo.");
		System.out.println("4 - Para sair do sistema.");
		opcao = scan.nextInt();
		
		while(opcao != 4 ) {
			switch(opcao) {
			case 1:
				calculaAreaRetangulo();
				break;
			case 2:
				calculaAreaTrapezio();
				break;
			case 3:
				calculaAreaTriagulo();
				break;
			case 4:
				break;
				default: 
					System.out.println("Opção invalida.");
			}
			System.out.println(" ");
			System.out.println("Vamos realizar calculos geométricos novamente!!!");
			System.out.println("1 - Para calcular a área de um Retângulo.");
			System.out.println("2 - Para calcular a área de um Trapézio.");
			System.out.println("3 - Para calcular a área de um Triangulo.");
			System.out.println("4 - Para sair do sistema.");
			opcao = scan.nextInt();
		}
		System.out.println("Obrigado por utilizar o sistema!!!");
		System.out.println("Volte sempre! :)  ");
		
	}
	
	
	public static void calculaAreaRetangulo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a base: ");
		double base = scan.nextDouble();
		System.out.println("Digite a autura: ");
		double autura = scan.nextDouble();
		double calculo = base * autura;
		
		System.out.println("A base do retángulo é " + calculo);
		
	}
	
	public static void calculaAreaTrapezio() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a Base maior do trapézio: ");
		double B = scan.nextDouble();
		System.out.println("Digite a base menor do trapézio: ");
		double b = scan.nextDouble();
		System.out.println("Digite a altura do trapézio: ");
		double h = scan.nextDouble();
		double areaTrapezio = ((B + b) /2) * h;
		System.out.println("A área do trapézio é " + areaTrapezio);
		
	}

	
	public static void calculaAreaTriagulo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a báse do triangulo: ");
		double base = scan.nextDouble();
		System.out.println("Digite a altura do triangulo: ");
		double altura = scan.nextDouble();
		
		double areaTrian = (base * altura) / 2;
		System.out.println("A área do triangulo é " + areaTrian);
	
	}

	
	

}
