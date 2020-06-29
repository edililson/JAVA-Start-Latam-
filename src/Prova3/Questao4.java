package Prova3;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double saldo, deposito, saque;
		
		System.out.println("-------------Bem Vindo-------------");
		System.out.println("Digite seu nome: ");
		String usuario = scan.next();
		saldo = 100;
		
		System.out.println("Digite qual operação o senhor " + usuario + " deseja realizar...");
		System.out.println("1 - Saque");
		System.out.println("2 - Deposito");
		System.out.println("3 - Consultar saldo");
		System.out.println("4 - Sair");
		int opcao = scan.nextInt();
		
		while(opcao != 4) {
			switch(opcao) {
			case 1: 
				System.out.println("Digite o valor a ser sacado: ");
				saque = scan.nextDouble();
				if(saque < saldo) {
					saldo = saldo - saque;
					break;
				}else {
					System.out.println("Desculpa, más está tentando sacar um valor superior ao saldo!");
					break;
				}
			case 2:
				System.out.println("Digite o valor a ser depositado: ");
				deposito = scan.nextDouble();
				
				saldo = saldo + deposito;
				break;
			case 3:
				System.out.println(usuario+" seu salro é de R$"+saldo);
				break;
			case 4:
				break;
				default :
					System.out.println("Operação invalida.");
					break;
			
			}
			
			
			
			System.out.println("1 - Saque");
			System.out.println("2 - Deposito");
			System.out.println("3 - Consultar saldo");
			System.out.println("4 - Sair");
			opcao = scan.nextInt();
		}
		System.out.println("Obrigado por usar o sistema de caixa eletronico, volte sempre!");
	}
	
}
