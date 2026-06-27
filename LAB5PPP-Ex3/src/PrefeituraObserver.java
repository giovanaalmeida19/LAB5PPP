public class PrefeituraObserver implements Observer{
    public void update(double temperatura, double velocidadeVento, double umidade) {
        if (umidade < 10.0) {
            emitirAlertaUmidade();
        }
    }

    public void emitirAlertaUmidade(){
        System.out.println("Prefeitura informa: Defesa civil alerta: baixa umidade!");
    }
}
