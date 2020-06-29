package Prova3;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double saldo, deposito, saque;
		boolean logado = false;
		int conta, senha;

		System.out.println("-------------Bem Vindo-------------");

		while (logado == false) {
			System.out.println("Digite o numero da conta: ");
			conta = scan.nextInt();
			System.out.println("Digite a senha da conta: ");
			senha = scan.nextInt();
			if (conta == 1234 && senha == 123456) {
				System.out.println("Logado com sucesso!!!");
				logado = true;
			}else {
				System.out.println("Login ou senha invalida!");
			}
			while (logado == true) {
				saldo = 100;
				System.out.println("Digite qual operação o senhor(a) deseja realizar...");
				System.out.println("1 - Saque");
				System.out.println("2 - Deposito");
				System.out.println("3 - Consultar saldo");
				System.out.println("4 - Sair");
				int opcao = scan.nextInt();
				while (opcao != 4) {
					switch (opcao) {
					case 1:
						System.out.println("Digite o valor a ser sacado: ");
						saque = scan.nextDouble();
						if (saque < saldo) {
							saldo = saldo - saque;
							break;
						} else {
							System.out.println("Desculpa, más está tentando sacar um valor superior ao saldo!");
							break;
						}
					case 2:
						System.out.println("Digite o valor a ser depositado: ");
						deposito = scan.nextDouble();

						saldo = saldo + deposito;
						break;
					case 3:
						System.out.println("Seu saldo é de R$" + saldo);
						break;
					case 4:
						break;
					default:
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
				logado = false;
			}
		}

	}

}
