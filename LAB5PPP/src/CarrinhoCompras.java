import java.util.ArrayList;

public class CarrinhoCompras {
    PagamentoStrategy strategy;
    ArrayList<Item> itens = new ArrayList<>();

    public CarrinhoCompras(PagamentoStrategy strategy){
        setStrategy(strategy);
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

    public void realizarPagamento(){
        double total = calculaTotal();
        strategy.pagar(total);
    }

    public PagamentoStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PagamentoStrategy strategy) {
        this.strategy = strategy;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}
