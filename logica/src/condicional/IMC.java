package condicional;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso, altura;
		String classificacao;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Informe o peso: ");
		peso=sc.nextDouble();
		System.out.println("Informe a altura: ");
		altura=sc.nextDouble();
		
		double imc=peso/Math.pow(altura, 2);
		
		if(imc<18.5) {
			classificacao="est� abaixo do peso!";
		}else if(imc<25) {
			classificacao="est� com o peso normal!";
		}else if(imc <30) {
			classificacao="est� com sobrepeso";
		}else if(imc <35) {
			classificacao="est� com obesidade n�vel 1!";
		}else if(imc <40) {
			classificacao="est� com obesidade n�vel 2!";
		}else {
			classificacao="est� com obesidade m�rbida!";
		}
		System.out.printf("\nO seu IMC � %.2f"+" "
		+"e %s.", imc, classificacao);
		sc.close();
	}

}
