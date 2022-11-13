package dio.desafio_banco;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Conta implements iConta {
	
	private static final int AGENCIA_PADRAO = 1010;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
		
	@Override
	public void sacar(double valor) {
		if (valor < saldo) {
			saldo -= valor;
		} else {
			System.out.println("Saldo Insuficiente:" + saldo);
		}
				
	}

	@Override
	public void depositar(double valor) {
		if (valor < 0) {
			System.out.println("Digite um valor de depósito válido");
		} else {
			saldo += valor;
		}
				
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if (valor < saldo) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Saldo Insuficiente:" + saldo);
		}
		
	}
		
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("--- xxxxx ---");
	}

}
