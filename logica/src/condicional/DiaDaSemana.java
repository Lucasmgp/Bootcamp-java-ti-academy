package condicional;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Apresente dia da semana\n");
		System.out.println("\n1-Domingo"
				+ "\n2-Segunda-feira"
				+ "\n3-Terça-feira"
				+ "\n4-Quarta-feira"
				+ "\n5-Quinta-feira"
				+ "\n6-Sexta-feira"
				+ "\n7-Sábado");
		System.out.println("\nEscolha uma opção: ");
		opcao=sc.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("O dia da semana é domingo.");
			break;
		case 2:
			System.out.println("O dia da semana é segunda-feira.");
			break;
		case 3:
			System.out.println("O dia da semana é terça-feira.");
			break;
		case 4:
			System.out.println("O dia da semana é quarta-feira.");
			break;
		case 5:
			System.out.println("O dia da semana é quinta-feira.");
			break;
		case 6:
			System.out.println("O dia da semana é sexta-feira.");
			break;
		case 7:
			System.out.println("O dia da semana é sábado.");
			break;
		default:
			System.out.println("Informe uma opção válida.");
		}
		
		sc.close();
	}

}
