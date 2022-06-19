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
			classificacao="está abaixo do peso!";
		}else if(imc<25) {
			classificacao="está com o peso normal!";
		}else if(imc <30) {
			classificacao="está com sobrepeso";
		}else if(imc <35) {
			classificacao="está com obesidade nível 1!";
		}else if(imc <40) {
			classificacao="está com obesidade nível 2!";
		}else {
			classificacao="está com obesidade mórbida!";
		}
		System.out.printf("\nO seu IMC é %.2f"+" "
		+"e %s.", imc, classificacao);
		sc.close();
	}

}
