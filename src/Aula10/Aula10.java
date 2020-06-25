package Aula10;

import java.util.Scanner;

public class Aula10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		/*Exercicio 2
		System.out.println("Digite um numero entre 10 e 20 :");
		int numero = scan.nextInt();
		
		
		while(numero < 10 || numero > 20 ) {
			System.out.println("Numero invalido");
			System.out.println("Digite um numero entre 10 e 20 :");
			numero = scan.nextInt();
		}
		
		
		while (numero != -1) {
			System.out.print(numero + " - ");
			numero--;
		}

		
		exercico 3
		String novaPesquisa = "";
		System.out.println("Deseja fazer uma nova pesquisa? S ou N");
		novaPesquisa = scan.next();
		
		int qtdMasc = 0, qtdFem = 0;
		
		while(novaPesquisa.toUpperCase() == "S") {
			System.out.println("Informe seu Sexo: F ou M");
			String sexo = scan.next().toUpperCase();
			
			switch (sexo) {
			case "M":
				qtdMasc ++;
				break;
			case  "F":
				qtdFem++;
				break;
			default : System.out.println("Opção invalida!!!");
			break;
			
			}
			System.out.println("Deseja fazer uma nova pesquisa? ");
			novaPesquisa = scan.next();
		}
		
		System.out.println("qtdM = " + qtdMasc);
		System.out.println("qtdF = " + qtdFem);
		

		exercicio 4a
		int maiorNumero = 0 , opcao = 1;
		while(opcao != 0 ) {
			System.out.println("Digite um numero");
			int numero = scan.nextInt();
			 
			while(numero > maiorNumero && (numero % 2) == 0) {
				maiorNumero = numero;
			}
					
			System.out.println("Deseja contunuar com a operação??? Digite 0 para sair");
			opcao = scan.nextInt();
		}
		System.out.println("O maior numero par é: " + maiorNumero);
		
		*/
		
	}

}
