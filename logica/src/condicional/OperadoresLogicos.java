package condicional;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// && (E, and) É verdadeiro se as duas expressões forem verdadeiras.
		// || (ou, or) Para ser verdadeiro basta uma expressão ser verdadeira.
		// ! (Não, not) Inverte o valor da expressão.
		
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
