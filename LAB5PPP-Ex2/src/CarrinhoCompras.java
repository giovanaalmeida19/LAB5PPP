import java.util.ArrayList;
import java.util.Objects;

public class CarrinhoCompras {
    PagamentoStrategy pagamentoStrategy;
    FreteStrategy freteStrategy;
    ArrayList<Item> itens = new ArrayList<>();

    public CarrinhoCompras(PagamentoStrategy pagamentoStrategy, FreteStrategy freteStrategy){
        setStrategy(pagamentoStrategy);
        setFreteStrategy(freteStrategy);
    }

    public void adicionaItem(Item item){
        System.out.println("Adicionando item: "+item.getNome());
        itens.add(item);
    }

    public void removeItem(Item item){
        System.out.println("Removendo item: "+item.getNome());
        itens.remove(item);
    }

    public double calculaTotal(){
        double total = 0.0;
        for(Item item: itens){
            total += item.getPreco();
        }

        return total;
    }

    public double calculaFrete(){
        return freteStrategy.calculaFrete();
    }

    public void realizarPagamento(){
        double valorFrete = calculaFrete();
        double total = calculaTotal() + valorFrete;
        pagamentoStrategy.pagar(total);
    }

    public PagamentoStrategy getStrategy() {
        return pagamentoStrategy;
    }

    public void setStrategy(PagamentoStrategy strategy) {
        this.pagamentoStrategy = strategy;
    }

    public FreteStrategy getFreteStrategy() {
        return freteStrategy;
    }

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}
