package condicional;

import java.util.Scanner;

public class ClaculaImpostoRenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salarioBruto, valorDeducao;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Informe o seu sal�rio: ");
		salarioBruto=sc.nextDouble();
		
		if(salarioBruto<=1903.98) {
			valorDeducao=0.00;
		}else if(salarioBruto<=2826.65) {
			valorDeducao=142.80;
		}else if(salarioBruto<=3751.06) {
			valorDeducao=354.80;
		}else if(salarioBruto<=4664.68) {
			valorDeducao=636.13;
		}else {
			valorDeducao=869.36;
		}
		
		double salarioLiquido=salarioBruto-valorDeducao;
		System.out.printf("O seu sal�rio bruto � %.2f\n"
				+ "Sua dedu��o ser� de %.2f\n"
				+ "Seu sal�rio l�quido ser� de %.2f",
				salarioBruto,valorDeducao, salarioLiquido);
		
		sc.close();
	}

}
