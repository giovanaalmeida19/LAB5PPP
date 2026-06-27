public class AeroportoObserver implements Observer{
    public void update(double temperatura, double velocidadeVento, double umidade) {
        if (velocidadeVento > 100.0) {
            emitirAlertaVento();
        }
    }

    public void emitirAlertaVento(){
        System.out.println("Aeroporto informa: Rajadas de vento perigosas");
    }
}
