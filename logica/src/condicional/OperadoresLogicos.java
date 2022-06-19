package condicional;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// && (E, and) � verdadeiro se as duas express�es forem verdadeiras.
		// || (ou, or) Para ser verdadeiro basta uma express�o ser verdadeira.
		// ! (N�o, not) Inverte o valor da express�o.
		
		int x=5;
		
		System.out.println(x<=15 && x==10);
		System.out.println(x>=0 && x!=6);
		System.out.println(x<=15 && x==10 && x!=6);
		System.out.println(x<=15 || x==10);
		System.out.println(x<0 || x!=5);
		System.out.println(x<=0 || x!=5 || x>3);
		System.out.println(!(x==15));
		System.out.println(!(x<5));
		System.out.println(!(x<0 || x!=5));
	}

}
