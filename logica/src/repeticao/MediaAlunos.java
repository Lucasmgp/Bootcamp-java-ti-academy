package repeticao;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		double total=0;
		int contador=0;
		
		while(contador<=9) {
			System.out.printf("\nDigite a %dª nota:\n", contador+1);
			double nota= sc.nextDouble();
			total+=nota;
			contador++;
		}
		double media=total/contador;
		System.out.printf("\nTotal de todas as notas é %.2f\n", total);
		System.out.printf("\nTotal de alunos é %d\n", contador);
		System.out.printf("\nA média da turma é %.2f\n", media);
		
		sc.close();
	}

}
