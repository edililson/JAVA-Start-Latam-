package Aula8;

import java.util.Scanner;

public class Aula8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		/* Exercicio 1
		int somaIdade = 0;
		for(int i = 1; i<6; i++){
			System.out.println("Digite o " + i + " numero");
			somaIdade = somaIdade + scan.nextInt();
		}
		System.out.println("A soma das idades é: "+somaIdade);
		
		
		

		exercicio 2
		int[] val = new int[4];
		
		for(int i = 1; i <= 4;i++) {
			System.out.println("Digite o "+ i + " valor: ");
			val[i - 1] = scan.nextInt(); 
		}
		
		System.out.println("A soma do primeiro com o quarto numero é: " + (val[0] + val[3]));
		System.out.println("E a multiplicação do segundo com o terceiro número é: " + (val[1] * val[2]));
		
		exercicio 3
		int numero , quantImpar = 0, i;
		boolean ehImpar = true;
		for (  i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + " valor: ");
			numero = scan.nextInt();
			ehImpar = numero % 2 != 0;
			if(ehImpar) {
				quantImpar = quantImpar + 1;
			}
		}
		System.out.println("Quantidade de numeros impares digitados foi: "+quantImpar);
		System.out.println("Quantidade de numeros pares digitados foi: " + (i - quantImpar -1));
		*/
		
		int quantNegativo = 0, quantPositivo = 0;
		for ( int i = 1 ; i <= 3; i++) {
			System.out.println("Digite o " + i + " valor: ");
			int valor = scan.nextInt();
			if(valor < 0 ){
				quantNegativo++;
			}else {
				quantPositivo++;
			}
		}
		System.out.println("A quantidade de positivo foi :" + quantPositivo);
		System.out.println("A quantidade de negativos foi: " + quantNegativo);
		
		
		
	}

}
