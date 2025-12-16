package ex01.pagamento;

public class PagamentoCartao implements Pagamento {
	public void pagar(double valor) {
		System.out.println("Pagamento no Cartão: R$ " + valor);
	}
}