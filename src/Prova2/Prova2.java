package Prova2;

import java.util.Scanner;

public class Prova2 {

	public static void main(String[] args) {
		
		/*Questão 2
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------------Bem Vindo------------------------");
		System.out.println("Escolher o estado para que seja mostrado o nome de sua capital");
		System.out.println("1 - PE");
		System.out.println("2 - PA");
		System.out.println("3 - AL");
		int opcao = scan.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Recife");
			break;
		case 2:
			System.out.println("João Pessoa");
			break;
		case 3:
			System.out.println("Maceió");
			
			
			default:
				System.out.println("Opção invalida!");
		}
		
		
		questão 3
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------------------------Bem Vindo------------------------");
		int opcao = 0;
		
		while(opcao != 4) {
			
			System.out.println("Escolher o estado para que seja mostrado o nome de sua capital");
			System.out.println("1 - PE");
			System.out.println("2 - PA");
			System.out.println("3 - AL");
			System.out.println("4 - Sair do programa");
			opcao = scan.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Recife");
				break;
			case 2:
				System.out.println("João Pessoa");
				break;
			case 3:
				System.out.println("Maceió");
				break;
			case 4:
				System.out.println("Obrigado e volte sempre!");
				break;
			default:
				System.out.println("Opção invalida!");
			}
		}
		
		

		questão 4
		int tabuada = 8;
		int x;
		
		while(tabuada <= 9) {
			for(x = 0; x <= 10; x++) {
			   System.out.print("Tabuada do " + tabuada + " é : ");
			   System.out.print(x + " x " + tabuada + " = ");
			   System.out.println(x * tabuada);
			   
			}
			tabuada++;
		}
		
		questão 5
		Scanner scan = new Scanner(System.in);
		int negativos = 0;
		System.out.println("Vamos vferificar se o valor é negativo!");
		for(int i = 1;i <= 10; i++){
			System.out.println("Digite o " + i + " valor: ");
			int valor = scan.nextInt();
			if( valor < 0 ) {
				negativos++;
			}
		}
		System.out.println("A quantidade de valores negativos digitados foi: " + negativos);
		
		Questão 6
		Scanner scan = new Scanner(System.in);
		int valor = 0;
		System.out.println("Escolha qual operação quer realizar: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subitração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Sair");
		int opcao = scan.nextInt();
		
		System.out.println("Digite o peimeiro numero: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();
		
		if(opcao == 4) {
			if(num2 == 0) {
				System.out.println("O segundo numero não pode ser zero!!!");
				opcao = 6;
			}
		}
		
		switch(opcao) {
		case 1:
			valor = num1 + num2;
			System.out.println("A soma dos valores foi: " + valor);
			break;
		case 2:
			valor = num1 - num2;
			System.out.println("A subitração dos valores foi: " + valor);
			break;
		case 3: 
			valor = num1 * num2;
			System.out.println("A multiplicação dos valores foi: " + valor);
			break;
		case 4:
			double valorDiv = num1 / num2;
			System.out.println("A divisão dos valores foi: " + valorDiv);
			break;
		case 5:
			System.out.println("Obrigado e volte sempre!!!");
			break;
		case 6:
			break;
		}
		
		
		//Questão 7
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------------------------Bem Vindo------------------------");
			System.out.println("Digite a primeira letra do seu estádo civil ");
			String estadoCivil = scan.next();
			switch(estadoCivil.toUpperCase()) {
			case "S":
				System.out.println("Solteiro");
				break;
			case "C":
				System.out.println("Casado");
				break;
			case "D":
				System.out.println("Divorciado");
				break;
			case "V":
				System.out.println("Viúvo");
				break;
			default:
				System.out.println("Opção invalida!");
			}
			
			
		Questão 8
		System.out.println("Os multiplos de 7 são: ");
		for(int i=1 ; i<=1000 ; i++){
			if(i % 7 ==0){
				System.out.println(i);
			}
		}
		
		questão 9
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da 1 pessoa: ");
		String nome1 = scan.next();
		System.out.println("Digite o peso da 1 pessoa: ");
		double peso1 = scan.nextDouble();
		System.out.println("Digite a altura da 1 pessoa: ");
		double altura1 = scan.nextDouble();
		
		System.out.println("Digite o nome da 2 pessoa: ");
		String nome2 = scan.next();
		System.out.println("Digite o peso da 2 pessoa: ");
		double peso2 = scan.nextDouble();
		System.out.println("Digite a altura da 2 pessoa: ");
		double altura2 = scan.nextDouble();
		
		System.out.println("Pessoa mais pesada é: ");
		if(peso1 > peso2) {
			System.out.print(nome1 + " ,com " + peso1 + "Kg");
		}else if(peso2 > peso1){
			System.out.println(nome2 + " ,com " + peso2 + "Kg");
		}else {
			System.out.println("As duas pessoas tem o mesmo peso");
		}
		
		System.out.println("Pessoa mais alta é: ");
		if(altura1 > altura2){
			System.out.println(nome1 + " ,com " + altura1 + " metros");
		}else if(altura2 > altura1) {
			System.out.println(nome2 + " ,com " + altura2 + " metros");
		}
		
		questão 10
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double num = scan.nextInt();
		int div = 0;
		while( num > 1) {
			System.out.print(num + " dividido po 2 é: ");
			num = (num / 2);
			System.out.println(num);
			div++;
		}
		System.out.println("A quantidade de vivisões feitas foi: " + div + " divisões!");
		*/
	}

}
