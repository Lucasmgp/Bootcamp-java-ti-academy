//Fa�a um programa que receba a nota de 10 alunos. Para cada nota recebida, se a nota for maior ou igual a 6.0 o aluno est� aprovado, caso contr�rio o aluno 
//est� reprovado. No final da execu��o o programa deve apresentar a quantidade de alunos aprovados e reprovados, al�m da m�dia da truma.

package repeticao;

import java.util.Scanner;

public class ExercicoReprovaAprova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		double total=0, nota, media;
		int contador, contReprova=0, contAprova=0;

		for(contador=0; contador<=9; contador++) {
			System.out.printf("Digite a nota do %d� aluno: \n", contador+1);
			nota=sc.nextDouble();
			
			while(nota>10) {
				System.out.println("Digite um valor v�lido para a nota!!!");
				System.out.printf("Digite a nota do %d� aluno: ",contador+1);
				nota=sc.nextDouble();
			}
			if(nota>=6.0) {
				System.out.println("Aluno aprovado");
				contAprova++;
			}else {
				System.out.println("Aluno reprovado");
				contReprova++;
			}
			total+=nota;
		}
		media=total/contador;
		
		System.out.printf("\nO total das notas foi: %.1f."
				+ "\nA m�dia da sala foi: %.1f."
				+ "\nO total de alunos aprovados �: %d."
				+ "\nO total de alunos reprovados �: %d", total, media, contAprova, contReprova);
		
		sc.close();
	}

}
