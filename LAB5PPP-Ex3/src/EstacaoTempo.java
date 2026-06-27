import java.util.ArrayList;
import java.util.List;

public class EstacaoTempo {
    private List<Observer> observers;
    private double temperatura;
    private double velocidadeVento;
    private double umidade;

    public EstacaoTempo(){
        observers = new ArrayList<>();
    }

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temperatura, velocidadeVento, umidade);
        }
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
        notifyObservers();
    }
    public void setUmidade(double umidade){
        this.umidade = umidade;
        notifyObservers();
    }
    public void setVelocidadeVento(double velocidadeVento){
        this.velocidadeVento = velocidadeVento;
        notifyObservers();
    }
}
