package entidade;

public class Bicicleta {
	private int nroDeMarchas;
	private int velocidade;
	
	//Construtor
	public Bicicleta(int nroDeMarchas, int velocidade) {
		this.nroDeMarchas = nroDeMarchas;
		this.velocidade = velocidade;
	}
	
	//Getters and Setters
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	public void setNroDeMarchas(int nroDeMarchas) {
		this.nroDeMarchas = nroDeMarchas;
	}
	
	public int getNroDeMarchas() {
		return this.nroDeMarchas;
	}
	
	protected void tocaBuzina() {
		System.out.println("Bi bi bi");
	}
}
