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
				+ "\n3-Ter�a-feira"
				+ "\n4-Quarta-feira"
				+ "\n5-Quinta-feira"
				+ "\n6-Sexta-feira"
				+ "\n7-S�bado");
		System.out.println("\nEscolha uma op��o: ");
		opcao=sc.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("O dia da semana � domingo.");
			break;
		case 2:
			System.out.println("O dia da semana � segunda-feira.");
			break;
		case 3:
			System.out.println("O dia da semana � ter�a-feira.");
			break;
		case 4:
			System.out.println("O dia da semana � quarta-feira.");
			break;
		case 5:
			System.out.println("O dia da semana � quinta-feira.");
			break;
		case 6:
			System.out.println("O dia da semana � sexta-feira.");
			break;
		case 7:
			System.out.println("O dia da semana � s�bado.");
			break;
		default:
			System.out.println("Informe uma op��o v�lida.");
		}
		
		sc.close();
	}

}
