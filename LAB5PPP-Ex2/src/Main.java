//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Item bala = new Item();
    bala.setPreco(2.5);
    bala.setNome("bala");

    Item chocolate = new Item();
    chocolate.setNome("chocolate");
    chocolate.setPreco(4.0);

    PagamentoStrategy pix = new PixPagamento();
    FreteStrategy sedex = new SedexFrete();

    CarrinhoCompras carrinho = new CarrinhoCompras(pix, sedex);
    carrinho.adicionaItem(chocolate);
    carrinho.adicionaItem(bala);

    System.out.println("Total dos itens: "+carrinho.calculaTotal());
    System.out.println("Frete: "+ carrinho.calculaFrete());

    System.out.println("Total da compra: "+ (carrinho.calculaTotal() + carrinho.calculaFrete()));
    carrinho.realizarPagamento();
}
