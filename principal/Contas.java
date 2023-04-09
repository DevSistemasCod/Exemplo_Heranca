package principal;

import java.util.Scanner;

import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class Contas {
	
	public static void saqueEmContaCorrente(Scanner lerDados, ContaCorrente contaCorrente) {
		float valorDeSaque, conteudoValorSaque;
		
		System.out.println("Valor de saque para Conta Corrente: ");
		valorDeSaque = lerDados.nextFloat();
		conteudoValorSaque = contaCorrente.sacar(valorDeSaque);
		
		if(conteudoValorSaque == -1) {
			System.out.println("Você não tem crédito para sacar esse valor");
		}else{
			System.out.printf("Valor retirado: %.2f\n",valorDeSaque);
			System.out.println("Saldo atual: "+contaCorrente.getSaldo());
		}
		
		
	}
	
	
	public static void saqueEmContaPoupanca(Scanner lerDados, ContaPoupanca contaPoupanca) {
		float valorDeSaque, conteudoValorSaque;
		
		System.out.println("Valor de saque para Conta Poupança: ");
		valorDeSaque = lerDados.nextFloat();
		conteudoValorSaque = contaPoupanca.sacar(valorDeSaque);
		if(conteudoValorSaque == -1) {
			System.out.println("Você não tem saldo para sacar esse valor");	
		}else{
			System.out.println("Valor retirado: "+conteudoValorSaque);
		}
		
		System.out.println("Saldo atual: "+contaPoupanca.getSaldo());
	}
	
	public static void main(String[] args) {
		ContaPoupanca contaPoupanca = new ContaPoupanca("Amadeu", 1, 200, 10);
		ContaCorrente contaCorrente = new  ContaCorrente("Carlos", 2, 300, 200); 
		float saldo;
		Scanner lerDados = new Scanner(System.in);
		
		//saqueEmContaCorrente(lerDados, contaCorrente);
		//System.out.println("\n");
		//saqueEmContaPoupanca(lerDados, contaPoupanca);
		System.out.println(contaPoupanca.getSaldo());
		//saldo = contaPoupanca.calcularNovoSaldo(5, 1);
		saldo = contaPoupanca.calcularNovoSaldo(5, 1);
		System.out.println(contaPoupanca.toString());
		System.out.println("Novo saldo do cliente, a partir da taxa de rendimento: "+saldo);
		
		//System.out.println(contaBancaria.toString());
		lerDados.close();
	}
	
}
