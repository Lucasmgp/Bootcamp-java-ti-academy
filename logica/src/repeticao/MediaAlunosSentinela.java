package repeticao;

import java.util.Scanner;

public class MediaAlunosSentinela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		double total=0;
		int contador=0;
		System.out.println("Digite uma nota ou -1 para sair: ");
		double nota=sc.nextDouble();
		
		while(nota != -1) {
			total+=nota;
			contador++;
			System.out.println("Digite uma nota ou -1 para sair: ");
			nota=sc.nextDouble();
		}
		if(contador!=0) {
			double media=total/contador;
			System.out.printf("\nO total de alunos é %d.\n", contador);
			System.out.printf("O total das notas é %.1f.\n",total);
			System.out.printf("A média das notas é %.1f.", media);
		}else {
			System.out.println("\nSem notas cadastradas.");
		}
		
		sc.close();
	}

}
