package Aula13;

import java.util.Scanner;
public class Questao2 {

	public static void main(String[] args) {
		/*
		 * 2. Fa�a um programa que possua uma fun��o 
		 * que efetue e permita apresentar o somat�rio 
		 * dos N primeiros n�meros inteiros. 
		 * (1+2+3+4+5+6+...+N). Esta fun��o dever� 
		 * receber da fun��o principal (main) o 
		 * n�mero N e no final esta mesma fun��o dever� 
		 * retornar o valor do somat�rio, que dever� 
		 * ser apresentado ao usu�rio pela fun��o 
		 * principal (main).
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de opera��es:");
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
