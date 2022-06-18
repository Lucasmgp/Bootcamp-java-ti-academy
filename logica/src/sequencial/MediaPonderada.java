package sequencial;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		double n1,n2,n3,n4;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Escreva a nota 1: ");
		n1=sc.nextDouble();
		System.out.println("Escreva a nota 2: ");
		n2=sc.nextDouble();
		System.out.println("Escreva a nota 3: ");
		n3=sc.nextDouble();
		System.out.println("Escreva a nota 4: ");
		n4=sc.nextDouble();
		
		double mediaPonderada=((n1*2)+(n2*2)+(n3*3)+(n4*3))/10;
		System.out.printf("A média ponderada de %.2f, %.2f, %.2f e %.2f é %.2f.",n1,n2,n3,n4,mediaPonderada);
		
		sc.close();
	}

}
