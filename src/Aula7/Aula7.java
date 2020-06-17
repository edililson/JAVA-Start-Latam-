package Aula7;

import java.util.Scanner;

public class Aula7 {

	public static void main(String[] args) {
		//Este codigo está todo comentado pós tem varios codigos diferentes no mesmo .java
		
		Scanner scan = new Scanner(System.in);
		
		/* Exercicio 1
		System.out.println("Digite o valor do produto: ");
		double val = scan.nextInt();
		System.out.println("Esolha uma das opções de Desconto: ");
		System.out.println("1 - 10% a vista");
		System.out.println("2 - 5% no cartão da loja");
		System.out.println("3 - Nenhum desconto: ");
		String opcao = scan.next();
		
		switch (opcao) {
		case "1":
			val = (val * 0.1) + val;
			System.out.println("Valor final é "+ val + " Com desconto de 10%.");
			break;
		case "2":
			val = (val * 0.05) + val;
			System.out.println("Valor final é "+ val + " Com desconto de 5%.");
			break;
		case "3": 
			System.out.println("Valor final é "+ val + " Sem nenhum desconto.");
			break;
			default : System.out.println("Opção invalida");
		}
		
		
		
		exercicio 2
		System.out.println("Digite um mes: ");
		System.out.println("Exemplo: Abril vc deve digitar 4:");
		int estacao = scan.nextInt();
		
		switch(estacao) {
		case 1:
			System.out.println("A estação do ano correspondente ao mês 1 é Verão");
			break;
		case 2:
			System.out.println("A estação do ano correspondente ao mês 2 é Verão");
			break;
		case 3:
			System.out.println("A estação do ano correspondente ao mês 3 é Verão");
			break;
		case 4:
			System.out.println("A estação do ano correspondente ao mês 4 é Outono");
			break;
		case 5:
			System.out.println("A estação do ano correspondente ao mês 5 é Outono");
			break;
		case 6:
			System.out.println("A estação do ano correspondente ao mês 6 é Outono");
			break;
		case 7:
			System.out.println("A estação do ano correspondente ao mês 7 é Inverno");
			break;
		case 8:
			System.out.println("A estação do ano correspondente ao mês 8 é Inverno");
			break;
		case 9:
			System.out.println("A estação do ano correspondente ao mês 9 é Inverno");
			break;
		case 10:
			System.out.println("A estação do ano correspondente ao mês 10 é Primavera");
			break;
		case 11:
			System.out.println("A estação do ano correspondente ao mês 11 é Primavera");
			break;
		case 12:
			System.out.println("A estação do ano correspondente ao mês 12 é Primavera");
			break;
		default :
			System.out.println("Opção Invalida");
			break;
		}
		
		
		exercicio 3
		System.out.println("Digite a abreviação do estado que vc nasceu: ");
		System.out.println("Exemplo: PE ou BA");
		String estado = scan.next();
		
		switch(estado.toUpperCase()) {
		case "PE":
			System.out.println("Você é Pernambucano!");
			break;
		case "BA":
			System.out.println("Você é Bahiano, oxe painho!!!");
			break;
		case "MG":
			System.out.println("Você é Matogrossense");
			break;
			default: System.out.println("Opção invalida!");
		}
		
		Exercicio 4
		System.out.println("Digite o nome de um dos 5 maiores times de PE para saber quantos títulosele possui:");
		System.out.println("Exemplo: Sport");
		String time = scan.next();

		switch (time.toUpperCase()) {
		case "SPORT":
			System.out.println("Sport possue 50 Titulos");
			break;
		case "SANTA CRUZ":
			System.out.println("Santa Cruz possue 40 Titulos");
			break;
		case "NAUTICO":
			System.out.println("Náutico possue 30 Titulos");
			break;
		case "IBIS": 
			System.out.println("Íbis possue 20 titulos");
			break;
		case "AMERICA":
			System.out.println("América possue 10 titulos");
			break;
		default: System.out.println("Time invalido!!!");
		}
		
		
		DESAFIO AVANÇADO
		System.out.println("Digite seu nome: ");
		String nome = scan.next();
		
		System.out.println("Digite seu Sexo: ");
		System.out.println("M para masculino, F para feminino");
		String sexo = scan.next();
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		//Estou usando tu uper case pos sting não pode ser 
		if( (sexo.toUpperCase().equals("F")) && (idade <= 25) ) {
			System.out.println(nome + " está Aceita");
		}else{
			System.out.println(nome);
			System.out.println("NÃO ACEITA(O)");
		}
		*/
		
	}

}
