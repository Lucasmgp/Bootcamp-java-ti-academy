package desafio;

import java.util.Scanner;

public class DesafioLogicaJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cont1 = 0, cont2 = 0, quantidade;
		String nome;
		double preco, aliquota = 0, lucro = 0, mediaC = 0, mediaE = 0, mediaV = 0 ;
		char categoria;
		
		for(cont1 = 0; cont1 <15; cont1++) {
			System.out.println("Digite -1 no preço para encerrar o programa.\n");
			
			System.out.printf("Produto %d\n", cont1+1);
			
			System.out.println("Nome do item catalogado: ");
			nome = sc.next();
			
				System.out.println("Digite o preço unitário desse item: ");
				preco = sc.nextDouble();
					
				if(preco == -1) {
					cont1 = 15;
				} else {
					
					System.out.println("Digite a quantidade em estoque desse item: ");
					quantidade = sc.nextInt();
					
					if(quantidade == -1) {
						cont1 = 15;
					} else {
					
						System.out.println("Digite a categoria desse item: "
								+ "C (Cama, Mesa e Banho), E (Eletrodomésticos), V (Vestuário):");
						categoria = sc.next().charAt(0);
				
						switch(categoria) {
						
						case 'E':
							break;
						
						case 'C':
							break;
						
						case 'V':
							break;
						
						default:
							cont2 = 0;
							while(cont2 == 0) {
								System.out.println("\nDigite um valor válido.");
								
								System.out.println("Digite a categoria desse item: "
										+ "C (Cama, Mesa e Banho), E (Eletrodomésticos), V (Vestuário):");
								categoria = sc.next().charAt(0);
								if(categoria == 'C' || categoria == 'E' || categoria == 'V') {
									cont2++;
								}
							}
						}
						
						if(categoria == 'C') {
							aliquota = preco * 0.3741;
							lucro = preco * 0.30;
							mediaC += (lucro+preco+aliquota) * quantidade;
							System.out.printf("\nNome do produto...................................: %s\n", nome);
							System.out.printf("Preço do produto..................................: R$%.2f\n", preco);
							System.out.printf("Adicional da Alíquota.............................: R$%.2f\n", aliquota);
							System.out.printf("Valor do lucro de 30 por cento....................: R$%.2f\n", lucro);
							System.out.printf("Preço para ter uma margem de lucro de 30 por cento: R$%.2f\n\n", lucro+preco);
							System.out.printf("Preço do produto adicionando o imposto e o lucro..: R$%.2f\n\n", lucro+preco+aliquota);
						}
						if(categoria == 'E') {
							aliquota = preco * 0.4314;
							lucro = preco * 0.35;
							mediaE += (lucro+preco+aliquota) * quantidade;
							System.out.printf("\nNome do produto...................................: %s\n", nome);
							System.out.printf("Prço do produto..................................: R$%.2f\n", preco);
							System.out.printf("Adicional da Alíquota.............................: R$%.2f\n", aliquota);
							System.out.printf("Valor do lucro de 35 por cento....................: R$%.2f\n", lucro);
							System.out.printf("Preço para ter uma margem de lucro de 35 por cento: R$%.2f\n\\n", lucro+preco);
							System.out.printf("Preço do produto adicionando o imposto e o lucro..: R$%.2f\n\n", lucro+preco+aliquota);
						}
						if (categoria == 'V') {
							aliquota = preco * 0.3842;
							lucro = preco * 0.50;
							mediaV += (lucro+preco+aliquota) * quantidade;
							System.out.printf("\nNome produto......................................: %s\n", nome);
							System.out.printf("Preço do produto..................................: R$%.2f\n", preco);
							System.out.printf("Adicional da Alíquota.............................: R$%.2f\n", aliquota);
							System.out.printf("Valor do lucro de 50 por cento....................: R$%.2f\n", lucro);
							System.out.printf("Preço para ter uma margem de lucro de 50 por cento: R$%.2f\n\n", lucro+preco);
							System.out.printf("Preço do produto adicionando o imposto e o lucro..: R$%.2f\n\n", lucro+preco+aliquota);
						}
				}
			}
		}
		
		System.out.printf("\nO valor total de cada categoria esta em:\n"
				+ "Cama, mesa e banho: R$%.2f\n"
				+ "Eletrodoméstico...: R$%.2f\n"
				+ "Vestuário.........: R$%.2f\n", mediaC, mediaE, mediaV);
		
		System.out.println("\nEncerrando o programa.");
		
		sc.close();
	}
}