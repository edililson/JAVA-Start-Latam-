package Aula13;

import java.util.Scanner;
public class Questao2 {

	public static void main(String[] args) {
		/*
		 * 2. Faça um programa que possua uma função 
		 * que efetue e permita apresentar o somatório 
		 * dos N primeiros números inteiros. 
		 * (1+2+3+4+5+6+...+N). Esta função deverá 
		 * receber da função principal (main) o 
		 * número N e no final esta mesma função deverá 
		 * retornar o valor do somatório, que deverá 
		 * ser apresentado ao usuário pela função 
		 * principal (main).
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de operações:");
		int n = scan.nextInt();
		int resultado = soma(n);
		
		System.out.println("Resultado: " + resultado);
	}
	
	public static int soma(int n) {
		int soma = 0;
		for (int i = 1; i < n ; i++) {
			soma = soma + i;
		}
		return soma;
		
	}

}
