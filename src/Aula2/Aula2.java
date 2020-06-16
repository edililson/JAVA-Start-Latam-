package Aula2;

import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//Cada exercicio está comentado para que ele funcione basta tiar os comentarios de um por um
		
		/*Exercicio 1
		
		System.out.println("Digite um valor: ");
		int val = scan.nextInt();
		val--;
		System.out.println("Seu antecesor é: "+val);
		*/
		
		/* Exercicio 2
		double b,h,a;
		
		System.out.println("Vamos caluclar a área do retângulo!!!");
		System.out.println("Digite a autura do retângulo: ");
		h = scan.nextDouble();
		System.out.println("Digite a base do retângulo: ");
		b = scan.nextDouble();
		a = b * h;
		
		System.out.println("A área do retângulo é: "+a);
		*/
		
		/*Exercicio 3
		int idade_anos,idade_meses,idade_dias,total_dias;
		total_dias = 0;
		System.out.println("Digite sua idade: ");
		idade_anos = scan.nextInt();
		System.out.println("Digite quantos meses: ");
		idade_meses = scan.nextInt();
		System.out.println("Digite quantos dias: ");
		idade_dias = scan.nextInt();
		
		total_dias = total_dias + (idade_anos*365);
				
		total_dias = total_dias + (idade_meses*30); 
		total_dias = total_dias + idade_dias;
		
		System.out.println("\"O total de dias é = "+total_dias);
		*/
		/*Exercicio 4

		int total_eleitos, votos_brancos, votos_null, votos_validos;
		System.out.println("Digite o taltal de eleitos na cidade: ");
		total_eleitos = scan.nextInt();
		System.out.println("Digite o total de votos validos: ");
		votos_validos = scan.nextInt();
		System.out.println("Digite o total de votos nulos: ");
		votos_null = scan.nextInt();
		System.out.println("Digite o total de votos em branco: ");
		votos_brancos = scan.nextInt();
		
		int total_votos = votos_brancos + votos_null + votos_validos;
		
		if(total_eleitos == total_votos) {
			System.out.println("Total de Eleitos não corresponde ao Total de Votos...");
			System.out.println("Total de eleitos: " + total_eleitos);
			double porc = (votos_validos*100)/total_eleitos;
			System.out.println("Porcentagem dos votos validos: " + porc + "%");
			porc = (votos_null*100)/total_eleitos;
			System.out.println("Porcentagem dos votos nulos: " + porc + "%");
			porc = (votos_brancos*100)/total_eleitos;
			System.out.println("Porcentagem dos votos em branco: " + porc + "%");
		}else {
			System.out.println("Total de eleitos não bate com o total de votos apurados...");
		}
		*/
		
		/*
		 * Exercicio 5
		System.out.println("Digite o valor do salário mensal atual do funcionário: ");
		double salario = scan.nextDouble();
		System.out.println("Digite a porcentagem do reajuste: ");
		double reajuste = scan.nextInt();
		double aumento = salario * (reajuste/100);
		salario = salario + aumento;
		System.out.println("Salario reajustado é: "+salario);
		*/
		
		/*Exercicio 6
		double porcDistribuidor = 0.28, porcImposto = 0.45, valFinal;
		System.out.println("Digite o valor do carro: ");
		double valorCarro = scan.nextDouble();
		double valPorc = (porcDistribuidor + porcImposto) * valorCarro;
		valFinal = valorCarro + valPorc;
		System.out.println(valFinal);
		*/
		
		/* Exercicio 7
		double salarioFixo = 0;
		double comissãoPorCarroVendido = 0;
		double porc = 0.05;
		
		System.out.println("Digite o total de carros vendidos: ");
		int totalCarrosVendidos = scan.nextInt();
		System.out.println("Digite o valor total das vendas: ");
		double valorVendas = scan.nextDouble();
		System.out.println("Digite o salario fixo do funcionário: ");
		salarioFixo = scan.nextDouble();
		System.out.println("Digite o valor da comissão por carro vendido: ");
		comissãoPorCarroVendido = scan.nextDouble();
		
		
		double salarioFinal = (valorVendas * porc) + (totalCarrosVendidos * comissãoPorCarroVendido) + salarioFixo;
		
		System.out.println(salarioFinal);
		
		*/
		
		/* Exercicio 9
		double grauCelcio;
		double grauFr;
		
		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		grauFr = scan.nextInt();
		
		grauCelcio = (grauFr - 32) / 1.8000;
		
		System.out.println("A temperatura em °C é de: "+ grauCelcio + "°C");
		
		*/
		
		
	}

}
