package exercicio;
import java.util.Scanner;

import exercicio.Veiculo;

public class VeiculoExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int passageiro;
		double tanque, consumo, km, valor;
		
		System.out.println("\nQuantidade de passageiros:");
		passageiro = sc.nextInt();
		System.out.println("Capacidade de tanque:");
		tanque = sc.nextDouble();
		System.out.println("Consumo por litro:");
		consumo = sc.nextDouble();
		System.out.println("Distância em km:");
		km = sc.nextDouble();
		System.out.println("Valor do combustível:");
		valor = sc.nextDouble();
		
		
		Veiculo carro = new Veiculo(passageiro, tanque, consumo);
		System.out.println(carro.ToString());
		
		double tanques = carro.tanqueViagem(km);
		double rateiro = carro.dividirDispesas(km, valor);
		System.out.printf("Para a viagem vamos precisar de %.2f tanque(s) e cada passageiro contribuirá com R$ %.2f", tanques, rateiro);
		
		sc.close();
	}

}