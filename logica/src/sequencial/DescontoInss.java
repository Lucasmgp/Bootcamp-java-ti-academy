package sequencial;

import java.util.Scanner;

public class DescontoInss {

	public static void main(String[] args) {
		double salarioBruto;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escreva o salário bruto: R$ ");
		salarioBruto=sc.nextDouble();
		
		double descontoInss=salarioBruto*(1-0.11);
		System.out.printf("O salário já com o desconto do INSS será de R$%.2f",descontoInss);
		
		sc.close();
	}

}
