package sequencial;

import java.util.Scanner;

public class Aumento2 {

	public static void main(String[] args) {
		double salarioInicial, percentual;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Informe o sal�rio inicial: R$ ");
		salarioInicial=sc.nextDouble();
		System.out.println("Informe o percentual do aumento:");
		percentual=sc.nextDouble();
		
		double salarioBruto;
		salarioBruto=salarioInicial*(1+percentual/100);
		System.out.printf("O sal�rio anterior era de R$ %.2f e teve um aumento de %.2f porcento, ent�o seu novo sal�rio � R$ %.2f",salarioInicial, percentual, salarioBruto);
		sc.close();
	}

}
