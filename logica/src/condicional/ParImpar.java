package condicional;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		String resultado;
		
		System.out.println("Informe um n�mero: ");
		num=sc.nextInt();
		
		if(num%2==0) {
			resultado="Par";
		}else {
			resultado="Impar";
		}
		System.out.printf("\nO n�meor %d � %s.", num, resultado);
		System.out.println("\nEncerramento da execu��o!!!");
		
		sc.close();
	}

}
