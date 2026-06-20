public class BoletoPagamento implements PagamentoStrategy{
    @Override
    public void pagar(double total) {
        System.out.println("Pagando com boleto...");
    }
}
