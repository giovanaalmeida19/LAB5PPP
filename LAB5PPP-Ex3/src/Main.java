//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    EstacaoTempo estacao = new EstacaoTempo();

    AeroportoObserver aeroporto = new AeroportoObserver();
    estacao.addObserver(aeroporto);

    PrefeituraObserver prefeitura = new PrefeituraObserver();
    estacao.addObserver(prefeitura);

    estacao.setVelocidadeVento(150.0);
    estacao.setTemperatura(25.0);
    estacao.setUmidade(30.0);

    estacao.setUmidade(5.0);
}
