import java.util.ArrayList;
import java.util.List;

public class Acao {
    private List<InvestidorObserver> observadores;
    private String codigo;
    private double preco;

    public Acao(String codigoAcao, double precoInicial){
        observadores = new ArrayList<>();
        setCodigoAcao(codigoAcao);
        setPreco(precoInicial);
    }

    public void addObserver(InvestidorObserver obs) {
        observadores.add(obs);
    }

    public void removeObserver(InvestidorObserver obs) {
        observadores.remove(obs);
    }

    public void notifyObservers() {
        for(InvestidorObserver o : observadores){
            o.update(codigo, preco);
        }
    }

    public List<InvestidorObserver> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<InvestidorObserver> observadores) {
        this.observadores = observadores;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigoAcao(String codigoAcao) {
        this.codigo = codigoAcao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
