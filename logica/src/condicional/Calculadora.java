package condicional;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		double n1,n2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		n1=sc.nextDouble();
		System.out.println("Informe o segundo n�mero: ");
		n2=sc.nextDouble();
		
		System.out.println("\n\nCalculadora\n");
		System.out.println("\n1-Soma \n2-Subtra��o \n3-Multiplica��o \n4-Divis�o");
		System.out.println("\nEscolha uma op��o: ");
		opcao=sc.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.printf("%.2f + %.2f = %.2f",n1,n2,n1+n2);
				break;
			case 2:
				System.out.printf("%.2f - %.2f = %.2f",n1,n2,n1-n2);
				break;
			case 3:
				System.out.printf("%.2f * %.2f = %.2f",n1,n2,n1*n2);
				break;
			case 4:
				System.out.printf("%.2f / %.2f = %.2f",n1,n2,n1/n2);
				break;
			default:
				System.out.println("Op��o inv�lida. Escolha um n�mero entre 1 e 4!!!");
		}
		sc.close();
	}

}
