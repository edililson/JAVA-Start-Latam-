package Aula13;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		
		/*
		 * 1. Faça um programa que efetue o cálculo 
		 * de uma prestação em atraso. Para tanto, 
		 * utilize a fórmula 
		 * PREST = VALOR + (VALOR * (TAXA / 100) * TEMPO)
		 * . O programa deverá chamar uma função que 
		 * faça a entrada dos dados e o cálculo da 
		 * prestação e retorne o valor deste cálculo 
		 * para a função principal (main). Finalmente 
		 * apresentar o valor da prestação.

		 */
		
		double valorPrestacao = calculoPrestacao();
		System.out.println("Valor da prestação: " + valorPrestacao);
		
	}
	
	public static double calculoPrestacao() {
		Scanner scan = new Scanner(System.in);
		double valorPrestacao, valor , taxa , tempo;
		System.out.println("Digite o valor original da prestação: ");
		valor = scan.nextDouble();
		System.out.println("Digite o tempo de atraso: ");
		tempo = scan.nextDouble();
		System.out.println("Digite o valor da taxa: ");
		taxa = scan.nextDouble();
		
		valorPrestacao = valor + (valor * (taxa / 100) * tempo);
		return valorPrestacao;
	}

}
