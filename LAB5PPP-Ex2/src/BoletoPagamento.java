public class BoletoPagamento implements PagamentoStrategy{
    public void pagar(double total) {
        System.out.println("Pagando com boleto...");
    }
}
