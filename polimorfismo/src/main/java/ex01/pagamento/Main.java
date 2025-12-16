package ex01.pagamento;
public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoPix();
        pagamento.pagar(150);
    }
}