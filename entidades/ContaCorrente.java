package entidades;

public class ContaCorrente extends ContaBancaria {
	private float limite;
	
	//Construtor
	public ContaCorrente(String nomeCliente, int numConta, float saldo, float limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public float sacar(float valorDeSaque) {
		float valorAtual, resultado;
		
		if(valorDeSaque <= getSaldo()) {
			if(getSaldo() > 0) {
				valorAtual = getSaldo() - valorDeSaque;
				if(valorAtual >= 0) {
					setSaldo(valorAtual);
					return valorDeSaque;
				}else {
					return getSaldo();
				}
			}else {
				return getSaldo();
			}
		}else {
			
			System.out.printf("\nSaldo em conta corrente: %.2f",getSaldo());
			valorAtual =  valorDeSaque - getSaldo()  ;
			
			if(valorAtual <= limite) {
				setSaldo(-valorAtual);
				System.out.printf("\nO valor: %.2f será retirado do limite",valorAtual);
				System.out.printf("\nO seu é limite: %.2f\n",limite);
				resultado = limite - valorAtual;  
				System.out.printf("Após usar o limite\n");
				System.out.printf("O limite restante é de: %.2f\n",resultado);	
				return resultado;
			}
			else {
				System.out.println("\nLimite Atual: "+limite);
				System.out.printf("\n O valor de %.2f esta acima do Limite\n ",valorAtual);
				return -1;
			}
		}
		
	}

}
