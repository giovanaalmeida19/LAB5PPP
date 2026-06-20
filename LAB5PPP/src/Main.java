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

    CarrinhoCompras carrinho = new CarrinhoCompras(pix);
    carrinho.adicionaItem(chocolate);
    carrinho.adicionaItem(bala);

    carrinho.realizarPagamento();
}
