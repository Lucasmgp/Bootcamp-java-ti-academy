package condicional;

import java.util.Scanner;

public class ConfereAprovacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String disciplina;
		int qtAulas, faltas;
		double n1,n2,n3,n4;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Informe a disciplina: ");
		disciplina=sc.next();
		System.out.println("Informe a quantidade de aulas dadas: ");
		qtAulas=sc.nextInt();
		System.out.println("Informe a quantiadade de faltas: ");
		faltas=sc.nextInt();
		System.out.println("Informe a nota do 1° bimestre: ");
		n1=sc.nextDouble();
		System.out.println("Informe a nota do 2° bimestre: ");
		n2=sc.nextDouble();
		System.out.println("Informe a nota do 3° bimestre: ");
		n3=sc.nextDouble();
		System.out.println("Informe a nota do 4° bimestre: ");
		n4=sc.nextDouble();
		
		double media=(n1+n2+n3+n4)/4;
		int aulasPresentes=(qtAulas-faltas);
		if(media>6.0 && aulasPresentes>=(qtAulas*0.75)) {
			System.out.printf("A sua média foi de %.2f\n"
					+ " teve %d aulas dadas\n "
					+ "faltou em %d aulas\n "
					+ "assistiu %d aulas\n"
					+ "Você foi aprovado, parabéns!!!",
					media,qtAulas,faltas,aulasPresentes);
		}else {
			System.out.printf("A sua média foi de %.2f\n"
					+ " teve %d aulas dadas\n "
					+ "faltou em %d aulas\n "
					+ "assistiu %d aulas\n"
					+ "Você foi reprovado, que pena!!!",
					media,qtAulas,faltas,aulasPresentes);
		}
		
		sc.close();
	}

}
