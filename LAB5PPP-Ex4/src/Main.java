//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    AcaoBroker broker = new AcaoBroker();
    Acao acao = new Acao("VALE3", 60.0);

    PrecoMaximoObserver maxObserver = new PrecoMaximoObserver(broker, 70.0);
    acao.addObserver(maxObserver);

    PrecoMinimoObserver minObserver = new PrecoMinimoObserver(broker, 50.0);
    acao.addObserver(minObserver);

    acao.setPreco(65.0);
    acao.setPreco(75.0);

    acao.setPreco(55.0);
    acao.setPreco(45.0);
}
