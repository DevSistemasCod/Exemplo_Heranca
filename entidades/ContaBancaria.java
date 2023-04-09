package entidades;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private float saldo;
	
	public ContaBancaria(String nomeCliente, int numConta, float saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	//Meus Métodos
	public float sacar(float valorDeSaque) {
		float valorAtual;
		
		if(valorDeSaque < saldo) {
			if(saldo > 0) {
				valorAtual = saldo - valorDeSaque;
				if(valorAtual >= 0) {
					saldo = valorAtual;
					return valorDeSaque;
				}else {
					return saldo;
				}
			}else {
				return saldo;
			}
		}else {
			return -1;
		}
	}
	
	
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}

	//Setters and Getters
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente; 
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
}
