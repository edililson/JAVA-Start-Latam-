	package Aula5;

import java.util.Scanner;

public class Aula5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		/* EXERCICIO 1
		 
		 
		System.out.println("Escreva um Valor Inteiro: ");
		int val = scan.nextInt();
		if(val > 10) {
			System.out.println("O valor � maior que 10");
		}else if(val == 10){
			System.out.println("O valor � igual que 10");
		}else {
			System.out.println("Valor menor que 10");
		}
		System.out.println(val);
		
		
		*/
		//--------------------------------------------------------
		/*	EXERCICIO 2
		
		System.out.println("Escreva um Valor Inteiro: ");
		int val = scan.nextInt();
		if(val >= 0) {
			System.out.println("O valor � positivo");
		}else {
			System.out.println("Valor � negativo");
		}
		System.out.println(val);
		
		*/
		//--------------------------------------------------------
		/*
		  EXERCICIO 3
		  
		double maca = 0;
		double custoTotal = 0;
		double valorUnidade = 1.30;	
		double valorAtacado = 1.00;		
		
		System.out.println("Digite o numero de ma�as que vc gostaria de comprar: ");
		maca = scan.nextDouble();
		if(maca >= 12) {
			custoTotal = valorAtacado * maca;
			System.out.println("O valor total �: " + custoTotal);
		}else{
			custoTotal = valorUnidade * maca;
			System.out.println("O valor total �: " + custoTotal);
		}
		
		*/
		//----------------------------------------------------------
		/*EXERCICIO 4
		
		double nota1;
		double nota2;
		double media;
		
		System.out.println("Dugite a primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.println("Digite o valor da segunda nota: ");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		
		if((nota1 < 0 || nota1 > 10) && (nota2 < 0 || nota2 > 10)) {
			System.out.println("Notas invalidas");
		}else {
			if(media >= 6) {
				System.out.println("Aluno foi aprovado com m�dia: "+media);
			}else{
				System.out.println("Aluno foi reprovado com m�dia: "+media);
			}
		}
		
		*/
		//------------------------------------------------
		/*EXERCICIO 5
		
		int anoAtual = 2020;
		int anoNascimento;
		int idadeAtual;
		
		System.out.println("Digite o ano do seu nascimento: ");
		anoNascimento = scan.nextInt();
		
		idadeAtual = anoAtual - anoNascimento;
		
		if (idadeAtual >= 16) {
			System.out.println("Pode votar esse ano");
		}else {
			System.out.println("N�o pode votar esse ano");
		}
		System.out.println(idadeAtual);
		*/
		//-----------------------------------------
		/*EXERCICIO 6
		 
		int val1;
		int val2;
		
		
		System.out.println("Digite o primeiro valor: ");
		val1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		val2 = scan.nextInt();
		
		if(val1 == val2) {
			System.out.println("Os valores s�o identicos.");
		}else if(val1 > val2) {
			System.out.println("O primeiro valor � o maior valor.");
		}else {
			System.out.println("O segundo valor � maior.");
		}
		*/
		//-----------------------------------
		/*EXERCICIO 7
		
		int val1;
		int val2;
		
		System.out.println("Digite o primeiro valor: ");
		val1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		val2 = scan.nextInt();
		
		if(val1 > val2) {
			System.out.println(val1 + ", " + val2);
		}else {
			System.out.println(val2 + ", " + val1);
		}
		*/
		
		
		
		/*Exercicio 9
		//jornada semanal de trabaho � de 40H
		//se trabalhar masi que 40h/S recebe 50% a mais, se ele recebe 15 por hora vai receber 7,50 por hora extra
		
		double horasMensais;
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horasMensais = scan.nextDouble();
		System.out.println("Digite o valor da hora do funcion�rio: ");
		double valHora = scan.nextDouble();
		System.out.println("Digite o salario do funcion�rio: ");
		double salarioFunc = scan.nextDouble();
		
		
		if (horasMensais > 160) {
			double valHoraExtra = valHora + (valHora / 2);
			double horasExtras = horasMensais - 160;
			salarioFunc = salarioFunc + (valHoraExtra * horasExtras);
			System.out.println("O salario funcion�rio com extra �: "+ salarioFunc);
		}else {
			System.out.println("Funcion�rio n�o tem direito a horas extras!!!");
		}
		
		*/
		
		
		/*Exercicio 10
		double salarioVendedor, valVendas, salarioComComissao;
		
		System.out.println("Digite o salario fixo do vendedor: ");
		salarioVendedor = scan.nextDouble();
		System.out.println("Digite o valor total das vendas do funcion�rio:");
		valVendas = scan.nextDouble();
		
		System.out.println("O valor do salario com a comiss�o � de: ");
		
		if(valVendas > 1500) {
			salarioComComissao = salarioVendedor + (valVendas * 0.05);
			System.out.print(salarioComComissao);
		}else {
			salarioComComissao = salarioVendedor + (valVendas * 0.03);
			System.out.print(salarioComComissao);
		}
		
		*/
		
		
		
		/*Exercicio 20
		String tipo;
		double valorTotal;
		
		System.out.println("Digite o tipo do Combustivel: ");
		tipo = scan.next();
		System.out.println("Digite quantos litros foram comprados: ");
		double litros = scan.nextDouble();
		System.out.println("Digite o valor do litro do "+tipo);
		double preco = scan.nextDouble();	
		
		
		if(tipo == "A") {
			System.out.println("Alcool");
			if(litros >20) {
				 valorTotal = preco* litros *0.03;
				 System.out.println("Valor a ser pago: "+valorTotal);
			}else {
				valorTotal = preco * litros * 0.05;
				System.out.println("Valor a ser pago: "+valorTotal);
			}
		}else if(tipo == "G") {
			System.out.println("Gasolina");
			if(litros >20) {
				 valorTotal = preco* litros *0.04;
				 System.out.println("Valor a ser pago: "+valorTotal);
			}else {
				valorTotal = preco * litros * 0.06;
				System.out.println("Valor a ser pago: "+valorTotal);
			}
		}else {
			System.out.println("Tipo do combustivel invalido!!!");
		}
		*/
		
		
		/*Exercicio 21
		int homemNovo,homemVelho, mulherNova, mulherVelha, homem1, homem2, mulher1, mulher2;
		
		System.out.println("Digite a idade dos Homens: ");
		homem1 = scan.nextInt();
		System.out.println("2 homem: ");
		homem2 = scan.nextInt();
		System.out.println("Digite a idade das mulheres: ");
		mulher1 = scan.nextInt();
		System.out.println("2 mulher: ");
		mulher2 = scan.nextInt();
		
		if (homem1 > homem2) {
			homemVelho = homem1;
			homemNovo = homem2;
		}else {
			homemVelho = homem2;
			homemNovo = homem1;
		}
		if (mulher1 > mulher2) {
			mulherVelha = mulher1;
			mulherNova = mulher2;
		}else {
			mulherVelha = mulher2;
			mulherNova = mulher1;
		}
		
		System.out.println(homemVelho + mulherNova);
		System.out.println(mulherNova * homemVelho);
		*/
	
		
		/* Exercicio 23
		int anoEmpresa, anoNascimento, matricula;
		
		System.out.println("Digite sua matricula: ");
		matricula = scan.nextInt();		
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = scan.nextInt();
		System.out.println("Digite o ano que entrou na empresa: ");
		anoEmpresa = scan.nextInt();
		
		int idade = anoNascimento - 2020;
		int tempoContribui��o = anoEmpresa - 2020;
		
		System.out.println("Funcion�rio matriculado no codigo: " + matricula + ": ");
		if(idade >= 65) {
			
			System.out.println("Requerer aposentadoria");
			
		}else if (tempoContribui��o >= 35) {
			
			System.out.println("'Requerer aposentadoria");
			
		}else if(idade >= 60 && tempoContribui��o >= 30) {
			
			System.out.println("'Requerer aposentadoria");
			
		}else{
			
			System.out.println("N�o requerer aposentadoria");
		
		}
		*/
		
		/*
		System.out.println("Digite o nome da doen�a: ");
		String doenca = scan.next();
		
		switch (doenca) {
		case ("Covid 19"):
			System.out.println("Sintomas do covid");
			break;
		case("Gripe"):
			System.out.println("Sintomas da gripe");
			break;
		case("Alergia"):
			System.out.println("Sintomas Alergia");
			break;
		}
		*/
	}

}
