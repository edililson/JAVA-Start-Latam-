package Aula5;

import java.util.Scanner;

public class aula2312 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double salarioVendedor, valVendas, salarioComComissao;

		System.out.println("Digite o salario fixo do vendedor: ");
		salarioVendedor = scan.nextDouble();
		System.out.println("Digite o valor total das vendas do funcionário:");
		valVendas = scan.nextDouble();

		if (valVendas <= 1500) {
			salarioComComissao = salarioVendedor + (valVendas * 0.03);
			System.out.println("O valor do salario com a comissão é de: " + salarioComComissao);
		}else {
			double valComissao = valVendas - 1500;
			salarioComComissao = (1500 * 0.03) + ((valComissao * 0.05) + salarioVendedor);
			System.out.println("O valor do salario com a comissão é de: " + salarioComComissao);
		}

	}

}