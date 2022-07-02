package repeticao;

import java.util.Scanner;

public class MediaAlunosFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		double total=0;
		int contador;
		
		for(contador=0;contador<=9;contador++) {
			System.out.printf("\nDigite a %dª nota", contador+1);
			double nota=sc.nextDouble();
			total+=nota;
		}
		
		double media=total/contador;
		
		System.out.printf("\nO total de alunos: é %d\n", contador);
		System.out.printf("\nO total das notas: é %.1f\n", total);
		System.out.printf("\nA média da sala é: %.1f\n", media);
		
		sc.close();
	}

}
