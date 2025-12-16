package ex01.pagamento;

public class PagamentoPix implements Pagamento {
	public void pagar(double valor) {
		System.out.println("Pagamento via Pix: R$ " + valor);
	}
}