package repeticao;

import java.util.Scanner;

public class ExercicoAumentoSalarial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int ano;
		double salario;
		
		System.out.println("Informe o sal�rio inicial do funcion�rio:");
		salario=sc.nextDouble();
		System.out.println("Digite -1 para sair ou o ano para calcular o novo sal�rio: \n");
		ano=sc.nextInt();
		switch(ano) {
		case 2015:
			System.out.printf("\nO sal�rio para o ano de 2015 �: %.2f\n ", salario*=1.0880);
			break;
		case 2016:
			System.out.printf("\nO sal�rio para o ano de 2016 �: %.2f\n ", salario*=1.1167);
			break;
		case 2017:
			System.out.printf("\nO sal�rio para o ano de 2017 �: %.2f\n", salario*=1.0647);
			break;
		case 2018:
			System.out.printf("\nO sal�rio para o ano de 2018 �: %.2f\n", salario*=1.0181);
			break;
		case 2019:
			System.out.printf("\nO sal�rio para o ano de 2019 �: %.2f\n", salario*=1.0461);
			break;
		case 2020:
			System.out.printf("\nO sal�rio para o ano de 2020 �: %.2f\n", salario*=1.0468);
			break;
		case 2021:
			System.out.printf("\nO sal�rio para o ano de 2021 �: %.2f\n", salario*=1.0526);
			break;
		case 2022:
			System.out.printf("\nO sal�rio para o ano de 2022 �: %.2f\n", salario*=1.0924);
			break;
		default:
			if(ano==-1);
			System.out.println("Encerrando programa!!!");
		}
		
		sc.close();
	}

}
