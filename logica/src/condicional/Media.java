package condicional;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		n1=sc.nextDouble();
		System.out.println("Informe a segunda nota: ");
		n2=sc.nextDouble();
		System.out.println("Informe a terceira nota: ");
		n3=sc.nextDouble();
		
		double media=(n1+n2+n3)/3;
		String resultado;
		
		if (media>=6.0) {
			resultado="foi aprovado. Parab�ns!!!";
		}else {
			resultado="foi reprovado. Que pena!!!";
		}
		System.out.printf("\nVoc� obteve m�dia %.1f e %s.", media, resultado);
		System.out.println("\nEncerrado o sistema!!!");
		sc.close();
	}

}
