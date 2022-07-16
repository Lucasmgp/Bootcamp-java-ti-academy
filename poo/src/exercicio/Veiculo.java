package exercicio;

public class Veiculo {
	//atributos
	public int passageiro;
	public double capacidade;
	public double consumo;
	
	public Veiculo(int pas, double capa, double cons) {
		passageiro = pas;
		capacidade = capa;
		consumo = cons;
	}
	
	//métodos
	public double tanqueViagem(double quilometro) {
		return quilometro/(consumo*capacidade);
	}
	
	
	public double dividirDispesas(double quilometro, double combustivel) {
		return (quilometro/consumo*combustivel)/passageiro;
	}
	
	public String ToString() {
		return "\nO veículo comporta " + passageiro + " pessoas, tem uma capacidade de " + capacidade + " litros de combustível, e faz "
				+ consumo + " quilômetros por litros.\n";
	}
	
	public int getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(int passageiro) {
		this.passageiro = passageiro;
	}
	
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
}