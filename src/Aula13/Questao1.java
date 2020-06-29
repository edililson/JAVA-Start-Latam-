package Aula13;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		
		/*
		 * 1. Fa�a um programa que efetue o c�lculo 
		 * de uma presta��o em atraso. Para tanto, 
		 * utilize a f�rmula 
		 * PREST = VALOR + (VALOR * (TAXA / 100) * TEMPO)
		 * . O programa dever� chamar uma fun��o que 
		 * fa�a a entrada dos dados e o c�lculo da 
		 * presta��o e retorne o valor deste c�lculo 
		 * para a fun��o principal (main). Finalmente 
		 * apresentar o valor da presta��o.

		 */
		
		double valorPrestacao = calculoPrestacao();
		System.out.println("Valor da presta��o: " + valorPrestacao);
		
	}
	
	public static double calculoPrestacao() {
		Scanner scan = new Scanner(System.in);
		double valorPrestacao, valor , taxa , tempo;
		System.out.println("Digite o valor original da presta��o: ");
		valor = scan.nextDouble();
		System.out.println("Digite o tempo de atraso: ");
		tempo = scan.nextDouble();
		System.out.println("Digite o valor da taxa: ");
		taxa = scan.nextDouble();
		
		valorPrestacao = valor + (valor * (taxa / 100) * tempo);
		return valorPrestacao;
	}

}
