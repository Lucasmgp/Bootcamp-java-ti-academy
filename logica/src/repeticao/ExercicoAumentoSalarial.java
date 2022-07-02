package repeticao;

import java.util.Scanner;

public class ExercicoAumentoSalarial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int ano;
		double salario;
		
		System.out.println("Informe o salário inicial do funcionário:");
		salario=sc.nextDouble();
		System.out.println("Digite -1 para sair ou o ano para calcular o novo salário: \n");
		ano=sc.nextInt();
		switch(ano) {
		case 2015:
			System.out.printf("\nO salário para o ano de 2015 é: %.2f\n ", salario*=1.0880);
			break;
		case 2016:
			System.out.printf("\nO salário para o ano de 2016 é: %.2f\n ", salario*=1.1167);
			break;
		case 2017:
			System.out.printf("\nO salário para o ano de 2017 é: %.2f\n", salario*=1.0647);
			break;
		case 2018:
			System.out.printf("\nO salário para o ano de 2018 é: %.2f\n", salario*=1.0181);
			break;
		case 2019:
			System.out.printf("\nO salário para o ano de 2019 é: %.2f\n", salario*=1.0461);
			break;
		case 2020:
			System.out.printf("\nO salário para o ano de 2020 é: %.2f\n", salario*=1.0468);
			break;
		case 2021:
			System.out.printf("\nO salário para o ano de 2021 é: %.2f\n", salario*=1.0526);
			break;
		case 2022:
			System.out.printf("\nO salário para o ano de 2022 é: %.2f\n", salario*=1.0924);
			break;
		default:
			if(ano==-1);
			System.out.println("Encerrando programa!!!");
		}
		
		sc.close();
	}

}
