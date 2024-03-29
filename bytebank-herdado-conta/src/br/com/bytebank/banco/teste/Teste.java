package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(11,22);
		guardador.adicionar(cc);
		
		Conta cc2 = new ContaCorrente(33, 44);
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidade();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref);
	}

}
